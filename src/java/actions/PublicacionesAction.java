/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package actions;

import entities.Publicacion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Set;

/**
 *
 * @author agustin
 */
public class PublicacionesAction {
    Set<Publicacion> publicaciones;
    
    public Set<Publicacion> obtenerMisPublicaciones(Integer userid) throws Exception{
        String table1 = "Publicacion";
        String table2 = "Usuario";
        String url = "jdbc:mysql://localhost:3306/softwart";
        String driver = "com.mysql.jdbc.Driver";
        
        try{
            if (!(userid == null)){
                Class.forName(driver).newInstance();
                Connection con = DriverManager.getConnection(url,"root","root");

                String query = "select * from " + table2 + " as t2 inner join " + table1 + " as t1 on t2.idUsuario = t1.usuario_publicador where idUsuario = ? and ";
                PreparedStatement ps = con.prepareStatement(query);

                ps.setInt(1, userid);

                ResultSet rs = ps.executeQuery();
                
                //SEGUIR PARA DEVOLVER LA LISTA DE PUBLICACIONES
            }
        }catch(ClassNotFoundException e){
            System.out.println("EXCEPTION: " + e);
        }
        return null;
        
    }
    
}
