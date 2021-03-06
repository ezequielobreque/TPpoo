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


public class Item implements Serializable {
 private Tipo tipo;
 private String nombre;
 private String prioridad;
 private Registro registro = new Registro();
 private Estado estado;
 private Equipo equipo;
 //private List<Estado> listaDeEstados=new ArrayList<Estado>();
private List<Registro> historial=new ArrayList<Registro>(); 
//private List<Estado> bifurcacion=new ArrayList<Estado>();

    public List<Registro> getHistorial() {
        return historial;
    }

    public Item() {
        
    }

  
    public Item(String nombre) {
        this.nombre = nombre;
    }

    public void setHistorial(List<Registro> historial) {
        this.historial = historial;
    }

    public Estado getEstado() {
        return estado;
    }
    
    public void addSiguienteEstado(Estado e){estado.AddSiguienteEstado(e);};
    
    public void selecionDeSiguienteEstado(int i){this.estado = estado.getSiguientesEstados().get(i); };
    
    
    public List<Estado> getSiguienteEstados() {
        return estado.getSiguientesEstados();
   }
    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    
   // public List<Estado> getBifurcacion() {
   //     return bifurcacion;
   // }

    //public void addBifurcacion(Estado E ) {
    //    bifurcacion.add(E);
    //}
private int indice;

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public Tipo getTipo() {
        return equipo.getTipo();
    }

    

    public  String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public Registro getRegistro() {
        return registro;
    }

    public void setRegistro(Registro registro) {
        this.registro = registro;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
    
  
     public void setResponsable(Miembro responsable){
        estado.setResponsable(responsable);
         registro.setResponsable(responsable);
    }
    public Miembro getResponsable(){
       return registro.getResponsable();
    }
    
    
    
    public void clasificarItem(Tipo t){
        if (this.nombre.equals(t.getNombre())){
            asignarTipo(t);
        }
    }
    
    public void asignarTipo(Tipo tipoItem){        
        tipo=tipoItem;        
    }
    
    public void agregarRegistro(Registro r){
        historial.add(r);
    }
    
    public void siguienteEstado(int i){
        agregarRegistro(registro);
        estado.getResponsable().configurarEstado(this,i);
        }
    public void setEstadoActual(Estado estadoActual){
        registro.setEstadoActual(estadoActual);
    }
    
};
