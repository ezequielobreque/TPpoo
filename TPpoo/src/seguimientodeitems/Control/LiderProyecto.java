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

    Integer legajo;

    public LiderProyecto(String nombre) {
        super(nombre);
    }
    
    
  public int getLegajo() {
        return legajo;
    }

    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }
    
    
    
    public void configurarEstado(Item i,int x){
       //aca deberia selecionar el siguiente estado
       //de esta selecion sale un unico estado
       i.registro=new Registro();
       i.selecionDeSiguienteEstado(x);
       i.setEstadoActual(i.estado);
    }
}

    

