/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguimientodeitems;
import seguimientodeitems.Control.Equipo;
import seguimientodeitems.Control.Registro;
import seguimientodeitems.Control.Miembro;
import seguimientodeitems.Control.LiderProyecto;
import seguimientodeitems.Control.Item;
import seguimientodeitems.Control.Estado;
import seguimientodeitems.Control.Tipo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ezequiel_o
 */
public class Seguimientodeitems {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estado creado =  new Estado("Creado");
        Estado desarrollo =  new Estado("desarrollo");
        Estado validacion = new Estado("validacion");
        Estado aceptado = new Estado("Aceptado");
        
        creado.AddSiguienteEstado(desarrollo);
        desarrollo.AddSiguienteEstado(validacion);
        validacion.AddSiguienteEstado(desarrollo);
        validacion.AddSiguienteEstado(aceptado);
        aceptado.AddSiguienteEstado(aceptado);
        Tipo reportedeBug= new Tipo("Bug",creado);
        
        Miembro empleado = new Miembro();
        Miembro empleado2= new Miembro();
        Miembro lider = new LiderProyecto();
        String n = new String ("nombre");
                
        lider.setNombre(n);
        Equipo e=new Equipo();
        e.agregarMiembro(empleado);
        e.agregarMiembro(empleado2);
        e.setLider(lider);
        e.setEspecialidad("Bug");
        
        Item i=new Item("Bug");
        i.setPrioridad("Alta");
        i.clasificarItem(reportedeBug);
        
        i.setEquipo(e);
        
        
        i.setResponsable(e.getMiembros().get(0));
        i.setEstado(creado);
       // i.setEstadoActual(i.getEstado());
        
        //int l =0;
        i.siguienteEstado(0);
        i.siguienteEstado(0);
        i.siguienteEstado(0);
        i.siguienteEstado(0);
        i.siguienteEstado(1);
        System.out.println(i.getEstado().getNombre());
    }
    
}
