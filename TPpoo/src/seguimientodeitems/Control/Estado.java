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
public class Estado implements Serializable {
private String nombre;
private List<Estado> siguientesEstados=new ArrayList<Estado>();
    private Miembro responsable ;
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

    public void setResponsable(Miembro responsable) {
        this.responsable = responsable;
    }

    

        public Miembro getResponsable() {
            return responsable;
        }
    }

    