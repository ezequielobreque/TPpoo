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

    

    
    
    public Tipo crearTipo(String nombre,LiderProyecto lider) {
     switch (nombre){
            case "creacion": return new Creacion(lider);
            case "bug": return new Bug(lider);
            case "nuevo": return new New(lider);       
            default: return null;
     }   
    
    }

    @Override
    public Tipo crearTipo(String i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    


}
