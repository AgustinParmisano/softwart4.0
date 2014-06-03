/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package actions;

import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author agustin
 */
public class LoginAction extends ActionSupport implements SessionAware{
    String identificacion;
    String userpass;
    String username;
    String perfil;
    private SessionMap<String,String> sessionmap;
    
        
    public String execute() throws Exception {
        perfil  = LoginDao.validate(username, userpass);
        if(perfil.equals("faltaUser")){
            addFieldError("username","Ingrese nombre de usuario");
        }else if(perfil.equals("faltaPass")){
            addFieldError("userpass","Ingrese su clave");
        }
        return perfil;
    }
    
    @Override
    public void setSession(Map<String, Object> map) {
        sessionmap = (SessionMap) map;
        sessionmap.put("login","true");
    }
    
    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
 
    
}
