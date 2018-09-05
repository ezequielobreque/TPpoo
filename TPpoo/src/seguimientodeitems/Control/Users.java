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
   private boolean Lider=false;
   private boolean admin =false;
   private Miembro Miembro;
    private List<Proyecto> listaDeProyectos=  new ArrayList<Proyecto>();

    public Users() {
         //To change body of generated methods, choose Tools | Templates.
    }

    public boolean isLider() {
        return Lider;
    }

    public void setLider(boolean Lider) {
        this.Lider = Lider;
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
    
    public Miembro getLider() {
        return Miembro;
    }

    public void setLider(Miembro Lider) {
        this.Miembro = Lider;
    }
    
    public Users(String Usuario, String Contrasenia, Miembro Lider) {
        this.Usuario = Usuario;
        this.Contrasenia = Contrasenia;
        this.Miembro = Lider;
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
