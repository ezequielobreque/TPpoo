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
public class LiderProyecto extends Miembro {

    int legajo;
    
    
  public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
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

    

