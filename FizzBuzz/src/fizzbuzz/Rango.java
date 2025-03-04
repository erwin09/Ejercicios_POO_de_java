
package fizzbuzz;

public class Rango {
    
    private int rango1;
    private int rango2;

    public Rango(int rango1, int rango2) {
        this.rango1 = rango1;
        this.rango2 = rango2;
    }

    public int getRango1() {
        return rango1;
    }

    public void setRango1(int rango1) {
        this.rango1 = rango1;
    }

    public int getRango2() {
        return rango2;
    }

    public void setRango2(int rango2) {
        this.rango2 = rango2;
    }
    
    public void imprimirMensaje(){
        System.out.println("El juego empieza desde el " + this.rango1 + " hasta el " + this.rango2);
    }
}
