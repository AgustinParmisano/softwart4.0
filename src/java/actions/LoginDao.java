/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package actions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author agustin
 */
public class LoginDao {
    
    public static boolean validate(String nombreUsuario, String passUsuario) throws Exception{
        boolean status = false;
        String table = "Usuario";
        
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin@localhost:1521:xe","system","oracle");
            
            String query = "select from" + table + "where name=? and password=?";
            PreparedStatement ps = con.prepareStatement(query);
            
            ps.setString(1, nombreUsuario);
            ps.setString(2, passUsuario);
            
            ResultSet rs = ps.executeQuery();
            status=rs.next();
            
        }catch(ClassNotFoundException e){
            System.out.println("EXCEPTION" + e.getException());
            System.out.println("CAUSE" + e.getCause());
        }        
            
        return status;
    }
    
}
