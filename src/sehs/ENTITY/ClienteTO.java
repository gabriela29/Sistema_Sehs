/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sehs.ENTITY;

/**
 *
 * @author SEHS - TI
 */
public class ClienteTO {
    private String usuario;
    private String pass;
    
    public ClienteTO(){
        
    }

    public ClienteTO(String usuario, String pass) {
        this.usuario = usuario;
        this.pass = pass;
    }

   

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    
}
