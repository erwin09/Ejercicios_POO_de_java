package contraltemperaturainvernadero;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args){

        System.out.println("Bienvenido Control de Temperatura");
        System.out.println("");

        Scanner sc = new Scanner(System.in);
        int opcion;
        do {

                System.out.println("Menu\n"
                        + "1. Ingresar al sensor \n"
                        + "2. Salir del programa \n");
                System.out.print("Ingrese una opción: ");
                opcion = sc.nextInt();
                switch (opcion) {

                    case 1:

                        System.out.print("\nIngrese la temperatura en grados C° del invernadero: ");
                        int temp = sc.nextInt();
                        Sensor temperartura = new Sensor(temp);
                        temperartura.mostrarMensaje();
                        temperartura.cuentaRegresiva();
                        temperartura.validarTemperatura();
                        break;

                    case 2:
                        System.out.println("Programa finalizado");
                        break;
                }
            
            
        } while (opcion != 2);

    }

}
