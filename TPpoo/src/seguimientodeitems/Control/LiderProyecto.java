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
public class LiderProyecto extends Miembro implements Serializable {

   private Integer legajo;

    public LiderProyecto(String nombre) {
        super(nombre);
    }
    
    
  public int getLegajo() {
        return legajo;
    }

    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }
    
}
    
  

    

