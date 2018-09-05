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
public class Proyecto implements Serializable{
    private List<Item> listaDeItems=  new ArrayList<Item>();
    private String nombre;
    private List<Equipo> listaDeEquipos=  new ArrayList<Equipo>();
public void AddItem(Item e){
        listaDeItems.add(e);
    
    };
    public void borrarItem(int n){
        listaDeItems.remove(n);
    
    };public void AddEquipo(Equipo e){
        listaDeEquipos.add(e);
    
    };
    public void borrarEquipo(int n){
        listaDeEquipos.remove(n);
    
    };
    public List<Equipo> getListaDeEquipos() {
        return listaDeEquipos;
    }

    public void setListaDeEquipos(List<Equipo> listaDeEquipos) {
        this.listaDeEquipos = listaDeEquipos;
    }

    public Proyecto(String nombre) {
        this.nombre = nombre;
    }

    public List<Item> getListaDeItems() {
        return listaDeItems;
    }

    public void setListaDeItems(List<Item> listaDeItems) {
        this.listaDeItems = listaDeItems;
    }
    public List<Tipo> listaDeTipos(){
        List<Tipo> lista=  new ArrayList<Tipo>();
        for (Equipo i : listaDeEquipos) {
            lista.add(i.getTipo());
        }
        return lista;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
