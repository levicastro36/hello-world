
package cine;

import java.util.ArrayList;

public class Cine {
    
    /*
    Cine es una clase que hace referencia a la marca o empresa, por ejemplo HOYTS
    esta clase tiene como atributo, un vector tipo Complejo que contiene algunos de los coplejos de la empresa
    1)atributos:
        a)vector tipo Complejo
        b)int idCine
        c)String nombre
    2)metodos:
        a)constructor
        b)los metodos set y get correspondentes,
        c)metodo getUnComplejo
            Deberá tener un metodo que recorra el vector y devuelva un Complejo en especifico
            para encontrar ese Complejo el metodo recibira por parametro un valor tipo int que debera
            coincidir con el idComplejo del mismo (idComplejo)
        d)metodo agregarComplejo
            es aquel q nos permite agregar un Complejo al vector, en la primera posicion disponible
            y terminar el metodo sin continuar recorriendo el vector, el metodo recibe por parametro
            un dato tipo Complejo (Complejo c).
    */
    
    private int idCine;
    private String nombreCine;
    private ArrayList<Complejo> complejos = new ArrayList();
    
    private static Cine cine;
    
    public static synchronized Cine getIntancer(){
        if(cine==null){
            cine = new Cine(1,"HOYTS");
        }
        return cine;
    }

    public Cine(int idCine, String nombreCine) {
        this.idCine = idCine;
        this.nombreCine = nombreCine;
    }

    public void setIdCine(int idCine) {
        this.idCine = idCine;
    }

    public String getNombreCine() {
        return nombreCine;
    }

    public void setNombreCine(String nombreCine) {
        this.nombreCine = nombreCine;
    }

    public ArrayList<Complejo> getComplejos() {
        return complejos;
    }

    public void setComplejos(ArrayList<Complejo> complejos) {
        this.complejos = complejos;
    }
    
    public Complejo getUnComplejoID(int idComplejo){
        Complejo ret = null;
        for (Complejo complejo : complejos) {
            if(complejo.getIdComplejo()==idComplejo){
                ret = complejo;
                break;
            }
        }
        return ret;
    }
    
    public Complejo getUnComplejoNombre(String nombreComplejo){
        Complejo ret = null;
        for (Complejo complejo : complejos) {
            if(complejo.getNombreComplejo().equals(nombreComplejo)){
                ret = complejo;
                break;
            }
        }
        return ret;
    }
    
    public void agregarComplejo(Complejo complejo){
        this.complejos.add(complejo);
    }
    
}
