
package cine;

import java.util.ArrayList;

public class Complejo {
    
    /*
    Complejo es una clase que hace referencia a la franquisia o sucursal de la empresa,
    por ejemplo HOYTS NUEVO CENTRO
    esta clase tiene como atributo, un vector tipo Sala que contiene algunas de las salas de la sucurasl
    La clase debera tener con
    1)atributos:
        a)vector tipo Sala
        b)vector tipo Funcion
        c)int idComplejo
    2)metodos:
        a)constructor
        b)los metodos set y get correspondentes,
        c)metodo getUnaSala
            Deberá tener un metodo que recorra el vector y devuelva una sala en especifico
            para encontrar esa sala el metodo recibira por parametro un valor tipo int que debera
            coincidir con el numero de sala de la misma (numeroSala)
        d)metodo agregarSala
            es aquel q nos permite agregar una sala al vector, en la primera posicion disponible
            y terminar el metodo sin continuar recorriendo el vector, el metodo recibe por parametro
            un dato tipo Sala (Sala s).
        e)metodo getUnaFuncion
            Deberá tener un metodo que recorra el vector y devuelva una Funcion en especifico
            para encontrar esa sala el metodo recibira por parametro un valor tipo int que debera
            coincidir con el numero de Funcion de la misma (numeroFuncion)
        f)metodo agregarFuncion
            es aquel q nos permite agregar una Funcion al vector, en la primera posicion disponible
            y terminar el metodo sin continuar recorriendo el vector, el metodo recibe por parametro
            un dato tipo Funcion (Funcion f).
    */
    private ArrayList <Integer> salas = new ArrayList();
    private ArrayList <Funcion> funciones = new ArrayList();
    private String nombreComplejo;
    private int idComplejo;
    
    public Complejo (){
    }
    
    public Complejo (int idComplejo, String nombreComplejo){
        this.idComplejo = idComplejo;
        this.nombreComplejo = nombreComplejo;
    }
    //  -   -
    
    private void cargarSalas(){
        for (Funcion funcion : funciones) {
            if(!salas.contains(funcion.getNumeroSala())){
                salas.add(funcion.getNumeroFuncion());
            }
        }
    }
    
    private ArrayList<Integer> getSalas(){
        cargarSalas();
        return salas;
    }
    
    public ArrayList<Pelicula> getPeliculas(){
        ArrayList <Pelicula> ret = new ArrayList();
        for (int i = 0; i < funciones.size(); i++) {
            Funcion funcion = funciones.get(i);
            Pelicula p = Datos.getIntancer().getUnaPeliculaId(funcion.getIdPelicula());
            if(!ret.contains(p)){
               ret.add(p);
            }
        }

        return ret;
    }
    
    public ArrayList<Integer> getSala() {
        return salas;
    }
    
    public void setSalas(ArrayList<Integer> salas) {
        this.salas = salas;
    }
    
    public Integer getUnaSala(int numeroSala){
        Integer ret=null;
        for (Integer sala : salas) {
            if(sala == numeroSala){
                ret = sala;
                break;
            }
        }
        return ret;
    }
    
    public void agregarSala(Integer s){
        this.salas.add(s);
    }
    
    public ArrayList<Funcion> getFuncion() {
        return funciones;
    }

    public String getNombreComplejo(){
        return this.nombreComplejo;
    }
    
    public int getIdComplejo (){
        return this.idComplejo;
    }
    //  -   -
    
    public void setFunciones(ArrayList<Funcion> funciones) {
        this.funciones = funciones;
    }
    
    public void setNombreComplejo(String nombreComplejo){
        this.nombreComplejo = nombreComplejo;
    }
    
    public void setIdComplejo(int idComplejo){
        this.idComplejo = idComplejo;
    }
    //  -   -
    
    public Funcion getUnaFuncion(int numeroFuncion){
        Funcion ret = null;
        for (Funcion funcion : funciones) {
            if(funcion.getNumeroFuncion() == numeroFuncion){
                ret = funcion;
                break;
            } 
        }
        return ret;
    }
    
    public void agregarFuncion(Funcion f){
        this.funciones.add(f);
    }
}
