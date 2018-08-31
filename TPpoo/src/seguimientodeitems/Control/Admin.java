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
public class Admin extends Users{
    private static String nombre="admin";
    private static String contrasenia="admin";
    private static boolean admin= true ;
    private static boolean alta=true;
    private static boolean lider=true;
    public Admin() {
        super.setAdmin(admin);
        super.setAlta(alta);
        super.setUsuario(nombre);
        super.setContrasenia(contrasenia);
        super.setLider(lider);
        
    }

    
    
    
}
