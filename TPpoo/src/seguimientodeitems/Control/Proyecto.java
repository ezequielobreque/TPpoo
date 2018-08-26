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
public class Proyecto {
    private List<Item> listaDeProyectos=  new ArrayList<Item>();
    private String nombre;

    public Proyecto(String nombre) {
        this.nombre = nombre;
    }

    public List<Item> getListaDeProyectos() {
        return listaDeProyectos;
    }

    public void setListaDeProyectos(List<Item> listaDeProyectos) {
        this.listaDeProyectos = listaDeProyectos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
