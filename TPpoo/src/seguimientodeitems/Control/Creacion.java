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
public class Creacion extends Tipo{
     static List<Estado> lista= new ArrayList<Estado>();
    static    Estado creado =  new Estado("Creado");
    static    Estado analisis =  new Estado("analisis");
    static    Estado testing = new Estado("testing");
    static    Estado evalu = new Estado("Evaluacion de usuario");
    static    Estado aceptado = new Estado("Aceptado");
    static    Estado desarrollo = new Estado("Aceptado");

    public Creacion() {
       
        
        super("creacion",creado,lista);
        lista.add(creado);
        lista.add(evalu);
        lista.add(desarrollo);
        lista.add(testing);
        lista.add(evalu);
        lista.add(aceptado);
        
        
        creado.AddSiguienteEstado(analisis);
        analisis.AddSiguienteEstado(desarrollo);
        desarrollo.AddSiguienteEstado(testing);
        testing.AddSiguienteEstado(desarrollo);
        testing.AddSiguienteEstado(evalu);
        evalu.AddSiguienteEstado(desarrollo);
        evalu.AddSiguienteEstado(aceptado);
        aceptado.AddSiguienteEstado(aceptado);
        
        
                }

   
    
    
    
    
}
