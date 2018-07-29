/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguimientodeitems.Control;

import java.io.Serializable;


/**
 *
 * @author ezequiel_o
 */
public class Miembro implements Serializable {
     private String nombre;
    
    public void configurarEstado(Item i,int x){
        
    }

    public Miembro(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     
}
