package calculadorasimple;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int opcion;

        System.out.println("\nBienvenido Calculadora\n");

        Scanner sc = new Scanner(System.in);

        do {

            System.out.print("\nMenú: \n"
                    + "1. Calculadora \n"
                    + "2. Salir \n"
                    + "Escoge una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Escoge la operación que desea hacer: + , - , * , /");
                    String opc = sc.next();
                    System.out.println("Ingrese un numero: ");
                    int num1 = sc.nextInt();
                    System.out.println("Ingrese un numero: ");
                    int num2 = sc.nextInt();
                    Operaciones operar = new Operaciones(num1, num2);

                    switch (opc) {
                        case "+":
                            operar.suma();
                            System.out.println("\nEl resultado de la operación es: " + operar.suma());
                            break;
                        case "-":
                            operar.resta();
                            System.out.println("\nEl resultado de la operación es: " + operar.resta());
                            break;
                        case "*":
                            operar.multiplicacion();
                            System.out.println("\nEl resultado de la operación es: " + operar.multiplicacion());
                            break;
                        case "/":
                            operar.division();
                            System.out.println("\nEl resultado de la operación es: " + operar.division());
                            break;
                        default:
                            System.out.println("Operación no váslida");
                            break;

                    }
                    break;
                case 2:
                    System.out.println("¡Finalizo el juego!");
                    break;
            }
        } while (opcion != 2);
    }

}
