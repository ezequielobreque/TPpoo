/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguimientodeitems.Control;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;

/**
 *
 * @author ezequiel_o
 */
public class Bug extends Tipo {
     List<Estado> lista= new ArrayList<Estado>();
        Estado creado =  new Estado("Creado");
       Estado desarrollo =  new Estado("desarrollo");
       Estado validacion = new Estado("validacion");
        Estado aceptado = new Estado("Aceptado");
        
    public Bug() {
        super("bug",null,null);
        lista.add(creado);
        lista.add(desarrollo);
        lista.add(validacion);
        lista.add(aceptado);
        
        creado.AddSiguienteEstado(desarrollo);
        desarrollo.AddSiguienteEstado(validacion);
        validacion.AddSiguienteEstado(desarrollo);
        validacion.AddSiguienteEstado(aceptado);
        aceptado.AddSiguienteEstado(aceptado);
        super.SetEstado(creado);
        super.setListaDeEstados(lista);
        
        
        
        
        
        
    }

    
    
    
    
}
