
package cine;

public class Pelicula {
    
    /*
    Esta clase debera contar con:
    1)¨atributos:
        a) int idPelicula
        b) String nombrePelicula
    2) metodos:
        a)contructor
        b)set y get
    */
    
    private int idPelicula;
    private String nombrePelicula;

    public Pelicula() {
    }

    public Pelicula(int idPelicula, String nombrePelicula) {
        this.idPelicula = idPelicula;
        this.nombrePelicula = nombrePelicula;
    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }
    
}
