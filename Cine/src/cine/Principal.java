
package cine;

public class Principal {

    public static void main(String[] args) {
        Cine.getIntancer();
        Complejo complejo = new Complejo(1,"Nuevo Centro");
        Funcion f1 = new Funcion(1,1, 1, "10:25", 1);
        Funcion f2 = new Funcion(1,1, 1, "11:00", 2);
        complejo.agregarFuncion(f1);
        complejo.agregarFuncion(f2);
        Cine.getIntancer().agregarComplejo(complejo);
        Datos.getIntancer().cargarDatos();
        Frm_Principal.getIntance();
    }   
}
