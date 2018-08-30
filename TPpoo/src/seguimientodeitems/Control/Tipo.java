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
public abstract class Tipo implements Serializable {
    private  String nombre;
    private Estado primerEstado;
    private List<Estado> listaDeEstados=new ArrayList<Estado>();
     
    
    public List<Estado> getListaDeEstados() {
      return listaDeEstados;
    }
    public void agregarListaDeEstados(Estado e){listaDeEstados.add(e);}
    public void borrarListaDeEstados(int n){listaDeEstados.remove(n);}
    
    
    public void setListaDeEstados(List<Estado> listaDeEstados) {
        this.listaDeEstados = listaDeEstados;
    }
    public Tipo(String nombre,Estado e,List<Estado> listaDeEstados){
        this.nombre=nombre;
        this.primerEstado=e;
        this.listaDeEstados=listaDeEstados;
    }   
    public void SetEstado(Estado primer){
    this.primerEstado=primer;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre){
    this.nombre=nombre;
    }

    public List<Estado> getSecuenciaEstados() {
        return primerEstado.getSiguientesEstados();
    }
}
