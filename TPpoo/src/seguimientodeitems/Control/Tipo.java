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
public class Tipo {
    String nombre;
    private Estado primerEstado;

    public Tipo(String nombre ,Estado primerEstado){
        this.nombre=nombre;
        this.primerEstado=primerEstado;
    }   
    public String getNombre() {
        return nombre;
    }

    public List<Estado> getSecuenciaEstados() {
        return primerEstado.getSiguientesEstados();
    }
}
