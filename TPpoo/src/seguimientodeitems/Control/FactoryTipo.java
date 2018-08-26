/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguimientodeitems.Control;

import java.util.List;

/**
 *
 * @author ezequiel_o
 */
public class FactoryTipo implements InterfazFactory {

    

    
    
    @Override
    public Tipo crearTipo(String nombre) {
     switch (nombre){
            case "creacion": return new Creacion();
            case "bug": return new Bug();
            case "nuevo": return new New();       
            default: return null;
     }   
    
    }


}
