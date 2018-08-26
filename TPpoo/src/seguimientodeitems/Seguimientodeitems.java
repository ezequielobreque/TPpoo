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
import seguimientodeitems.Control.*;
import java.util.ArrayList;
import java.util.List;
import seguimientodeitems.Control.FactoryTipo;
import seguimientodeitems.Control.InterfazFactory;

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
        InterfazFactory factory = new FactoryTipo();
        Tipo reporteBug= factory.crearTipo("bug");
                
                
        
        Miembro empleado = new Miembro("juang");
        Miembro empleado2= new Miembro("roberto");
        Miembro lider = new LiderProyecto("nombre");
        String n = new String ("nombre");
                
        lider.setNombre(n);
        Equipo e=new Equipo();
        e.agregarMiembro(empleado);
        e.agregarMiembro(empleado2);
        e.setLider(lider);
        e.setEspecialidad("Bug");
        
        Item i=new Item("Bug");
        i.setPrioridad("Alta");
        i.setTipo(reporteBug);
        i.setEquipo(e);
        
        i.setEstado(i.getTipo().getListaDeEstados().get(0));
        System.out.println(i.getTipo().getListaDeEstados().get(3).getNombre());
         List<Users> listaMiembros = new ArrayList<Users>();
        
                
        /* i.setResponsable(e.getMiembros().get(0));
        i.setEstado(creado);
       i.setEstadoActual(i.getEstado());
       i.getEquipo().getLider().getNombre();
        i.siguienteEstado(0);
        System.out.println(i.getEstado().getSiguientesEstados().get(0).getNombre());
        int l =0;
        i.siguienteEstado(0);
        System.out.println( i.getHistorial().get(0).getResponsable());;
        i.setResponsable(i.getEquipo().getMiembros().get(1));
        i.siguienteEstado(0);
        
        System.out.println( i.getHistorial().get(1).getResponsable());
       
        i.setResponsable(i.getEquipo().getMiembros().get(0));
        i.siguienteEstado(0);
        
        System.out.println( i.getHistorial().get(2).getResponsable());
        i.siguienteEstado(0);
        i.siguienteEstado(1);
        
        System.out.println(i.getEstado().getNombre());
    
    */
}
    }
