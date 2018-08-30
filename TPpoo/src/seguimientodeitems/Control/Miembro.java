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
    
    

    public Miembro(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
      public void configurarEstado(Item i,int x){
       //aca deberia selecionar el siguiente estado
       //de esta selecion sale un unico estado
        i.setRegistro(new Registro());
       i.selecionDeSiguienteEstado(x);
       i.setEstadoActual(i.getEstado());
    }
}
     

