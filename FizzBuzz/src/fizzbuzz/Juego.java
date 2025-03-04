package fizzbuzz;

public class Juego extends Rango {

    public Juego(int rango1, int rango2) {
        super(rango1, rango2);
    }

    public void ejecutar() {
        int contador = getRango1();
        
        for (int i = getRango1(); i <= getRango2(); i++) {
            if (contador % 3 == 0 && contador % 5 == 0) {
                System.out.println("Fizz Buzz");
            } else if (contador % 3 == 0) {
                System.out.println("Fizz");
            } else if (contador % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(contador);
            }
            contador += 1;
        }
        System.out.println("¡JUEGO FINALIZADO!");

    }

}
