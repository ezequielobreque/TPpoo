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
public class Estado {
String nombre;
private List<Estado> siguientesEstados=new ArrayList<Estado>();

    public List<Estado> getSiguientesEstados() {
        return siguientesEstados;
    }
    
    public void AddSiguienteEstado(Estado e){
        siguientesEstados.add(e);
    
    };
    public void borrarSiguienteEstado(int n){
        siguientesEstados.remove(n);
    
    };
    public void setSiguientesEstados(List<Estado> siguientesEstados) {
        this.siguientesEstados = siguientesEstados;
    }
        
    
    public Estado(String nombre){
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }
            
    
    public void asignarResponsable(Item item,Miembro responsable){
        item.setResponsable(responsable);
    }
}
    