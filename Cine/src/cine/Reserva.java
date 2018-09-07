
package cine;

public class Reserva {
    
    /*
    Esta clase hace referencia a cuando hacemos una reserva para ver una pelicula
    cada reserva corresconde unicamente a una sola entrada
    esta clase debera tener
    1)atributos:
        a) int idComplejo
        b) int numeroReserva
        c) int idFunsion
        d) char fila
        e) int numeroButaca
    */
    
    private int numeroReserva;
    private int idComplejo;
    private int idFuncion;
    private char fila;
    private int numeroButaca;
    
    public Reserva() {
        
    }

    public Reserva(int numeroReserva, int idComplejo, int idFuncion, char fila, int numeroButaca) {
        this.numeroReserva = numeroReserva;
        this.idComplejo = idComplejo;
        this.idFuncion = idFuncion;
        this.fila = fila;
        this.numeroButaca = numeroButaca;
    }

    public int getNumeroReserva() {
        return numeroReserva;
    }

    public void setNumeroReserva(int numeroReserva) {
        this.numeroReserva = numeroReserva;
    }

    public int getIdComplejo() {
        return idComplejo;
    }

    public void setIdComplejo(int idComplejo) {
        this.idComplejo = idComplejo;
    }

    public int getIdFuncion() {
        return idFuncion;
    }

    public void setIdFunsion(int idFuncion) {
        this.idFuncion = idFuncion;
    }

    public char getFila() {
        return fila;
    }

    public void setFila(char fila) {
        this.fila = fila;
    }

    public int getNumeroButaca() {
        return numeroButaca;
    }

    public void setNumeroButaca(int numeroButaca) {
        this.numeroButaca = numeroButaca;
    }
    
    
}
