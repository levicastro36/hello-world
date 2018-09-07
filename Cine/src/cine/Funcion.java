
package cine;

import java.util.ArrayList;

public class Funcion {
    
    /*
    Esta clase hace referencia a cada una de las proyecciones que se hacen de una pelicula
    en una sala y un determinado horario
    esta clase debera contar con:
    1)atributos:
        a) int idPelicula
        b) String hora
        c) int numeroSala
    2)metodos
        a)contructor
        b)set y get
    */
    private Sala sala;
    private int idPelicula;
    private String hora;
    private int numeroFuncion;
    private int idComplejo;

    public Funcion(int idComplejo,int numeroFuncion, int idPelicula, String hora, int numeroSala) {
        this.idComplejo = idComplejo;
        this.numeroFuncion = numeroFuncion;
        this.idPelicula = idPelicula;
        this.hora = hora;
        sala = new Sala(numeroSala);
    }

    public int getIdComplejo() {
        return idComplejo;
    }

    public void setIdComplejo(int idComplejo) {
        this.idComplejo = idComplejo;
    }
    
    public Sala getSala() {
        return sala;
    }
    
    public void setSala(Sala sala) {
        this.sala = sala;
    }
    
    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public int getNumeroFuncion() {
        return numeroFuncion;
    }

    public void setNumeroFuncion(int numeroFuncion) {
        this.numeroFuncion = numeroFuncion;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getNumeroSala() {
        return sala.getNumeroSala();
    }

}
