/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguimientodeitems.Control;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ezequiel_o
 */
public class New extends Tipo {
    private  List<Estado> lista= new ArrayList<Estado>();
    private  String nombre;
    public New(LiderProyecto lider){
            super("nuevo",null,null);
            super.setListaDeEstados(lista);
            
            
    }

    
    
}
