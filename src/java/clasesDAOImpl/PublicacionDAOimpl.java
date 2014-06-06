/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clasesDAOImpl;

import clasesDAOinterfaces.PublicacionDAO;
import com.opensymphony.xwork2.ActionSupport;
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
public class PublicacionDAOimpl extends ActionSupport implements PublicacionDAO {

    /**
     *
     * @param userid
     * @return
     * @throws Exception
     */
    public static Set<Publicacion> listarPublicaciones(Integer userid) throws Exception{
        String table1 = "Publicacion";
        String table2 = "Usuario";
        String url = "jdbc:mysql://localhost:3306/softwart";
        String driver = "com.mysql.jdbc.Driver";
        Set<Publicacion> publicaciones = null;
        
        try{
            if (!(userid == null)){
                Class.forName(driver).newInstance();
                Connection con = DriverManager.getConnection(url,"root","root");

                String query = "select * from " + table2 + " as t2 inner join " + table1 + " as t1 on t2.idUsuario = t1.usuario_publicador where idUsuario = ? and ";
                PreparedStatement ps = con.prepareStatement(query);

                ps.setInt(1, userid);

                ResultSet rs = ps.executeQuery();
                
                while(rs.next()){
                    
                    Publicacion  publicacion = new Publicacion();
                    publicacion.setTitulo(rs.getString("titulo"));
                    publicacion.setDescripcion(rs.getString("descripcion"));
                    publicacion.setContenido(rs.getString("contenido"));
                    
                    publicaciones.add(publicacion);
                    
                }
   
                return publicaciones;
            }
        }catch(ClassNotFoundException e){
            System.out.println("EXCEPTION: " + e);
        }
        return null;
        
    }
    
    @Override
    public Publicacion create(Publicacion entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Publicacion update(Publicacion entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Publicacion entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Publicacion findById(Long key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
