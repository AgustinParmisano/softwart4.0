/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package actions;

import clasesDAOImpl.PublicacionDAOimpl;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.logging.Logger;
import entities.Publicacion;
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
        publicaciones  = PublicacionDAOimpl.listarPublicaciones(userid);
        System.out.println("************ "+ publicaciones);
        if((publicaciones == null)||((publicaciones.isEmpty()))){
            addFieldError("formNuevaPublicacion","Sin publicaciones");
            return "publique";
        }
        return "success";
     
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
