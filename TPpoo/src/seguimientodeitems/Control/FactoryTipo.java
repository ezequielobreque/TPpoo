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

    

    
    
    public Tipo crearTipo(String nombre,Miembro miembro) {
     switch (nombre){
            case "creacion": return new Creacion(miembro);
            case "bug": return new Bug(miembro);
            case "nuevo": return new New(miembro);       
            default: return null;
     }   
    
    }

   

    

    


}
