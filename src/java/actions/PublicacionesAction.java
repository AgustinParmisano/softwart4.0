/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.logging.Logger;
import entities.Publicacion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;
import java.util.Set;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author agustin
 */
public class PublicacionesAction extends ActionSupport implements SessionAware{
    Set<Publicacion> publicaciones;
    Integer userid;

    private SessionMap<String,String> sessionmap;
    
    /**
     *
     * @return
     * @throws Exception
     */
    @Override
    public String execute() throws Exception {
        this.obtenerMisPublicaciones(userid);
        return null;
    }    
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

    @Override
    public void setSession(Map<String, Object> map) {
        sessionmap = (SessionMap) map;
        sessionmap.put("login","true");
    }
    
    
    public Set<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(Set<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public SessionMap<String, String> getSessionmap() {
        return sessionmap;
    }

    public void setSessionmap(SessionMap<String, String> sessionmap) {
        this.sessionmap = sessionmap;
    }

    public static Logger getLOG() {
        return LOG;
    }

    public static void setLOG(Logger LOG) {
        ActionSupport.LOG = LOG;
    }
}
