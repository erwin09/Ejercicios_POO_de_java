package sistemadereservas;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        Sala sala = new Sala();

        System.out.println("Bienvenido al sistema de reservas.");
        System.out.println("Menú: \n"
                + "1. Hacer reserva.  \n"
                + "2. Salir.");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                while (sala.hayDisponibilidad()) {
                    sala.mostrarAsientos();

                    System.out.print("Ingrese su nombre: ");
                    String nombre = sc.nextLine();
                    sc.nextLine();
                    System.out.print("Ingrese documento de identidad: ");

                    int documento = sc.nextInt();

                    Usuario usuario = new Usuario(nombre, documento);

                    System.out.print("Ingrese la cantidad de asientos que desea reservar: ");
                    int cantidad = sc.nextInt();
                    
                    for (int i = 1; i <= cantidad; i++) {
                        sala.mostrarAsientos();
                        System.out.print("Escoge la silla: ");
                        int numeroAsiento = sc.nextInt();
                        sc.nextLine();
                        usuario.reservar(sala, numeroAsiento);
                    }

                    System.out.print("¿Desea hacer otra reserva? (s/n): ");
                    String continuar = sc.nextLine().toLowerCase();
                    if (!continuar.equals("s")) {
                        break;
                    }
                }
            case 2:
                System.out.println("¡Programa finalizado!");
        }

        System.out.println("No hay más asientos disponibles o decidió salir.");
        sc.close();
    }

}
