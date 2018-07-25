/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguimientodeitems.Control;

/**
 *
 * @author ezequiel_o
 */
public class Users {
    String Usuario;
    String Contrasenia;
    LiderProyecto Lider;

    public LiderProyecto getLider() {
        return Lider;
    }

    public void setLider(LiderProyecto Lider) {
        this.Lider = Lider;
    }

    public Users(String Usuario, String Contrasenia, LiderProyecto Lider) {
        this.Usuario = Usuario;
        this.Contrasenia = Contrasenia;
        this.Lider = Lider;
    }
    
    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContrasenia() {
        return Contrasenia;
    }

    public void setContrasenia(String Contrasenia) {
        this.Contrasenia = Contrasenia;
    }
     
    
    
    
}
