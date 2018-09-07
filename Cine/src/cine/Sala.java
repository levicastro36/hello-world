
package cine;

public class Sala {
    
    /*
    Esta clase contiene un vector de filas, cada fila contiene un vector de butacas,
    esta clase representa la sala donde se proyectan las peliculas.
    cada sala cuenta con 6 filas de butacas
    en sus primeras 4 filas desde el frente hacia atras, tiene 4 butacas en cada una
    y en sus ultima 2 filas 6 butacas.
    ademas las filas tiene una letra para su identificacion y comienzan desde la A fila en frente
    hasta la E ultima fila
    debera contar con:
    1)atributo:
        a) numeroSala tipo int
        b) vector de filas
    2)metodos:
        a) metodo contructor
            este metodo llamara al metodo cargaDeFilas
        b) metodo cargaDeFilas
            este metodo debera crear las filas correspondientes anunciadas antes y guardar dentro del vector
            en forma ordenada.
        c) metodos get
        d) metodo getUnaFila
            este metodo recibe por parametro la letra que identifica una fila
            y debera devolver la fila q corresponde con tal letra.
    */
    
    
    private int numeroSala;
    private Fila[] filas;

    public Sala() {
    }

    public Sala(int numeroSala) {
        this.numeroSala = numeroSala;
        this.filas = new Fila[]{
            new Fila('F',6),
            new Fila('E',6),
            new Fila('D',4),
            new Fila('C',4),
            new Fila('B',4),
            new Fila('A',4)};
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public Fila[] getFilas() {
        return filas;
    }

    public void setFilas(Fila[] filas) {
        this.filas = filas;
    }
    
    public Fila getUnaFila(char letraFila){
        Fila ret=null;
        for (Fila fila : filas) {
            if(fila.getFila()==letraFila){
                ret = fila;
                break;
            }
        }
        return ret;
    }
    
    public void reemplazarFila(Fila f){
        for (Fila fila : filas) {
            if(fila.getFila() == f.getFila()){
                fila = f;
                break;
            }
        }
    }

}
