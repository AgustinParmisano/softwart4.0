/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package actions;

/**
 *
 * @author agustin
 */
public class LoginAction{
    String identificacion;
    String clave;
    String usuario;
    String perfil;
    

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
 
    public LoginAction() {
    }
    
    public String execute() throws Exception {
        System.out.println("Entro a LoginAction execute");
        
        return "success";
    }
    
}
