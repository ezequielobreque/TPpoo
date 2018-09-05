/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguimientodeitems.Control;

/**
 *
 * @author ezequiel_o
 */
import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar; 
public class Registro implements Serializable {
    private Estado estadoActual;
    private Calendar fecha;
    private Miembro Responsable;           
    private boolean cambio=false;
    public Estado getEstadoActual() {
        return estadoActual;
    }

    public boolean isCambio() {
        return cambio;
    }

    public void setCambio(boolean cambio) {
        this.cambio = cambio;
    }

    public void setEstadoActual(Estado estadoActual) {
        this.estadoActual = estadoActual;
    }

    public String getFecha() {
        String dia = Integer.toString(fecha.get(Calendar.DATE));
        String mes = Integer.toString(fecha.get(Calendar.MONTH));
        String anio = Integer.toString(fecha.get(Calendar.YEAR));
        return dia + mes + anio;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public Miembro getResponsable() {
        return Responsable;
    }

    public void setResponsable(Miembro Responsable) {
        this.Responsable = Responsable;
    }

    
    public Registro(){
        this.fecha = new GregorianCalendar();
    }
    
    
}
