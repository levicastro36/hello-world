
package cine;

import java.util.ArrayList;

public class Datos {
    private ArrayList<Reserva> reservas = new ArrayList();
    private ArrayList<Pelicula> peliculas = new ArrayList();
    
    private static Datos datos;
    
    public static synchronized Datos getIntancer(){
        if(datos==null){
            datos = new Datos();
        }
        return datos;
    }
    
    public int generarNumeroReserva(){
        if(reservas.size()<1){
            return 1;
        }else{
            int numReserva=0;
            for (Reserva reserva : reservas) {
                if(reserva.getNumeroReserva()>numReserva){
                    numReserva = reserva.getNumeroReserva();
                }
            }
            return numReserva+1;
        }
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }
    
    public void agregarPelicula(Pelicula p){
        peliculas.add(p);
    }
    
    public Pelicula getUnaPeliculaId(int idPelicula){
        Pelicula ret=null;
        for (Pelicula pelicula : peliculas) {
            if(pelicula.getIdPelicula()==idPelicula){
                ret = pelicula;
                break;
            }
        }
        return ret;
    }
    
    public Pelicula getUnaPeliculaNombre(String nombrePelicula){
        Pelicula ret=null;
        for (Pelicula pelicula : peliculas) {
            if(pelicula.getNombrePelicula().equals(nombrePelicula)){
                ret = pelicula;
                break;
            }
        }
        return ret;
    }
    
    public void agregarReserva(Reserva r){
        reservas.add(r);
        Cine.getIntancer().getUnComplejoID(r.getIdComplejo()).getUnaFuncion(r.getIdFuncion()).getSala().getUnaFila(r.getFila()).getUnButaca(r.getFila(), r.getNumeroButaca()).setEstado(false);
    }
    
    public Reserva getUnaReserva(int numeroReserva){
        Reserva ret=null;
        for (Reserva reserva : reservas) {
            if(reserva.getNumeroReserva()==numeroReserva){
                ret = reserva;
                break;
            }
        }
        return ret;
    }
    
    public void cargarDatos(){
        this.peliculas.add(new Pelicula(1,"Harry Potter y La Piedra Filosofal"));
        this.peliculas.add(new Pelicula(2,"Transformer El Lado Oscuro de la Luna"));
        
        /*
        a) int numeroReserva
        b) int idComplejo
        c) int idFunsion
        d) char fila
        e) int numeroButaca
        */
        Reserva r1 = new Reserva(0001,1,1,'D',4);
        Reserva r2 = new Reserva(0002,1,1,'D',3);
        agregarReserva(r1);
        agregarReserva(r2);
    }
}
