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
   private LiderProyecto Lider;
    private List<Item> listaDeItems=  new ArrayList<Item>();

    public Users() {
         //To change body of generated methods, choose Tools | Templates.
    }

    public List<Item> getListaDeItems() {
        return listaDeItems;
    }
    public  void addItem(Item i){listaDeItems.add(i);}
    public  void addItem(int n){listaDeItems.remove(n);}
    public void setListaDeItems(List<Item> listaDeItems) {
        this.listaDeItems = listaDeItems;
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
