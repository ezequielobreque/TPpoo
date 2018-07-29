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
public class Tipo implements Serializable {
     private String nombre;
    private Estado primerEstado;

    public Tipo(String nombre ){
        this.nombre=nombre;
        
    }   
    public String getNombre() {
        return nombre;
    }

    public List<Estado> getSecuenciaEstados() {
        return primerEstado.getSiguientesEstados();
    }
}
