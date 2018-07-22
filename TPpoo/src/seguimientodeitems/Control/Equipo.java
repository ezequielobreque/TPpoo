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
public class Equipo {
        String especialidad;
        Miembro lider;
        private List<Miembro> miembros = new ArrayList<Miembro>();

    
    public String    getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    public void agregarMiembro(Miembro m){
        miembros.add(m);
    }
    
    public List<Miembro> getMiembros() {
        return miembros;
    }
        
    public Miembro getLider() {
        return lider;
    }

    public void setLider(Miembro lider) {
        this.lider = lider;
    }
}

    
