/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguimientodeitems.Control;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ezequiel_o
 */
public class Users implements Serializable {
   private String Usuario;
   private String Contrasenia;
   private boolean alta=false;
   private boolean admin ;
   private LiderProyecto Lider;
    private List<Proyecto> listaDeProyectos=  new ArrayList<Proyecto>();

    public Users() {
         //To change body of generated methods, choose Tools | Templates.
    }

    public boolean isAlta() {
        return alta;
    }

    public void setAlta(boolean alta) {
        this.alta = alta;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public List<Proyecto> getListaDeProyectos() {
        return listaDeProyectos;
    }
    public  void addProyecto(Proyecto i){listaDeProyectos.add(i);}
    public  void removeProyecto(int n){listaDeProyectos.remove(n);}
    public void setListaDeProyectos(List<Proyecto> listaDeProyectos) {
        this.listaDeProyectos = listaDeProyectos;
    }
    
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
