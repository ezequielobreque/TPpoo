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
public class Admin extends Users implements Serializable{
    private  String nombre="admin";
    private  String contrasenia="admin";
    private boolean admin= true ;
    private  boolean alta=true;
    private  boolean lider=true;
    
    
    public Admin() {
        super.setAdmin(admin);
        super.setAlta(alta);
        super.setUsuario(nombre);
        super.setContrasenia(contrasenia);
        super.setLider(lider);
        
    }

    
    
    
}
