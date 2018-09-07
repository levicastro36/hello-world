
package cine;

public class Butaca {
    
    /*
    Esta clase hace referencia a los asientos que tiene una sala de cine,
    esta clase cuenta con:
    1) atributos:
        a) char fila
        b) int numeroButaca
        c) boolean estado
    2) metodos:
        a) contructor
        b) set y get
    */

    private char fila;
    private int numeroButaca;
    private boolean estado;

    public Butaca(char fila, int numero) {
        this.fila = fila;
        this.numeroButaca = numero;
        this.estado = true;
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

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "F : " + fila + " , N : " + numeroButaca;
    }
       
}
