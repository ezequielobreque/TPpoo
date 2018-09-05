/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguimientodeitems.Control;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ezequiel_o
 */
public class Creacion extends Tipo implements Serializable{
      List<Estado> lista= new ArrayList<Estado>();
       Estado creado =  new Estado("Creado");
      Estado analisis =  new Estado("analisis");
       Estado testing = new Estado("testing");
       Estado evalu = new Estado("Evaluacion de usuario");
     Estado aceptado = new Estado("Aceptado");
      Estado desarrollo = new Estado("Aceptado");

    public Creacion(Miembro lider) {
       
        
        super("creacion",null,null);
        lista.add(creado);
        lista.add(evalu);
        lista.add(desarrollo);
        lista.add(testing);
        lista.add(evalu);
        lista.add(aceptado);
        
        creado.setResponsable(lider);
        analisis.setResponsable(lider);
        testing.setResponsable(lider);
        evalu.setResponsable(lider);
        aceptado.setResponsable(lider);
        desarrollo.setResponsable(lider);
        
        creado.AddSiguienteEstado(analisis);
        analisis.AddSiguienteEstado(desarrollo);
        desarrollo.AddSiguienteEstado(testing);
        testing.AddSiguienteEstado(desarrollo);
        testing.AddSiguienteEstado(evalu);
        evalu.AddSiguienteEstado(desarrollo);
        evalu.AddSiguienteEstado(aceptado);
        aceptado.AddSiguienteEstado(aceptado);
         super.SetEstado(creado);
        super.setListaDeEstados(lista);
        
                }

   
    
    
    
    
}
