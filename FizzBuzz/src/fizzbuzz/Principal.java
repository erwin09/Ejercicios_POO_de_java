package fizzbuzz;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al juego Fizz Buzz");
        
        System.out.println("Debes ingresar un rango en el que juego recorrera.");
        
        int opcion;

        do {
            System.out.print("\nMenú  \n"
                    + "1. Iniciar el juego. \n"
                    + "2. Salir. \n"
                    + "Escoge una opción:");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el numero desde donde inicia: ");
                    int rango1 = sc.nextInt();
                    System.out.print("Ingrese el numero donde termina: ");
                    int rango2 = sc.nextInt();
                    Juego obj1 = new Juego(rango1, rango2);
                    obj1.imprimirMensaje();
                    obj1.ejecutar();
                    break;
                case 2:
                    System.out.println("Programa finalizada.");
            }
        } while (opcion != 2);

    }

}
