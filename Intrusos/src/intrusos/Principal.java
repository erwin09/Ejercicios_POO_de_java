package intrusos;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Alarma objAlarma = new Alarma();
        System.out.println("Bienvenido al Sistema de Alarma \n");
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.print("\nMenú\n"
                    + "1. Activar alarma \n"
                    + "2. Desactivar alarma \n"
                    + "Ingrese una opción: ");
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("\n¡Alarma activada!");
                    System.out.println("\nActivar sensores\n"
                            + "Cuantos sensores activaras: ");
                    int cant = sc.nextInt();
                    
                    for (int i = 0; i < cant; i++) {
                        
                        int num = i +1;
                        objAlarma.activarSensor(num);
                    }
                    objAlarma.mostrarMensaje();
                    break;
                case 2:
                    System.out.println("\nAlarma desactivada");
                    break;
                default:
                    System.out.println("\nEntrada invalida");
            }
        } while (opcion != 2);

    }

}
