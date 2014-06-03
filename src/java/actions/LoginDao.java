/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package actions;

import com.opensymphony.xwork2.ActionSupport;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author agustin
 */
public class LoginDao extends ActionSupport{
    
    public static String validate(String nombreUsuario, String passUsuario) throws Exception{
        boolean status = false;
        String table = "Usuario";
        String perfil = null;
        String url = "jdbc:mysql://localhost:3306/softwart";
        String driver = "com.mysql.jdbc.Driver";
        
        try{
            if ((!nombreUsuario.isEmpty()) && ((!passUsuario.isEmpty()))) {
                Class.forName(driver).newInstance();
                Connection con = DriverManager.getConnection(url,"root","root");

                String query = "select * from " + table + " where nombre = ? and clave = ?";
                PreparedStatement ps = con.prepareStatement(query);

                ps.setString(1, nombreUsuario);
                ps.setString(2, passUsuario);

                ResultSet rs = ps.executeQuery();
                
                while(rs.next()){
                    perfil=rs.getString("moderador");
                }
                if(perfil == null){
                    perfil = "usuario";
                }else{
                    if((perfil.equals("0"))){
                        perfil = "usuario";
                    }else if(perfil.equals("1")){
                        perfil = "moderador";
                    }
                }
                
                return perfil;
            }else if(nombreUsuario.isEmpty()){
                return "faltaUser";
            }else if(passUsuario.isEmpty()){
                return "faltaPass";
            }
            
        }catch(ClassNotFoundException e){
            System.out.println("EXCEPTION: " + e);
        }        
            
        return perfil;
    }
    
}
