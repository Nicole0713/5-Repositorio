package fundacion;

import java.util.Scanner;

public class MenuPrincipal {

    Scanner sc = new Scanner(System.in);

    public void mostrarMenu() {

        Donante dn = new Donante();
        ManejoDonaciones md = new ManejoDonaciones();

        int seleccion;

        do {
            System.out.println("Menu principal:");
            System.out.println(" 1. Registrar donante. \n "
                    + "2. Registrar donaciones. \n "
                    + "3. Mostrar lista de donantes registrados. \n "
                    + "4. Mostrar lista de donaciones efectuadas. \n "
                    + "5. Buscar donante por su cedula. \n "
                    + "6. Buscar donacion por codigo. \n "
                    + "7. Salir del programa");
            seleccion = sc.nextInt();

            switch (seleccion) {
                case 1:
                    System.out.println(" Registro de Donante");
                    dn.registrarDonante();
                    break;
                case 2:

                    System.out.println(" Registro de Donaciones");
                    int num_don;

                    do {

                        System.out.println("Ingrese el tipo de donación:  ");
                        System.out.println(" 1. Donación de comida.");
                        System.out.println(" 2. Donación económica.");
                        System.out.println(" 3. Donación de juguetes.");
                        System.out.println(" 4. Volver al menú principal.");
                        num_don = sc.nextInt();
                        md.registroDeDonacion(num_don);
                    } while (num_don < 4);
                    System.out.println("\n \n \n");

                    break;
                case 3:
                    System.out.println(" Mostrar lista de donantes:");
                    dn.mostrarDonantes();
                    break;
                case 4:
                    System.out.println(" Mostar lista de donaciones efectuadas: ");
                    md.mostrarDonacion();
                    md.calcularTotal();

                    break;
                case 5:
                    System.out.println(" Búsqueda de donantes por su número de cédula: ");
                    System.out.println("  Ingrese el número de cédula: ");
                    sc.nextLine();
                    String ced = sc.nextLine();
                   dn.buscarDonante(ced);
                    
                    break;

                case 6:
                    System.out.println(" Búsqueda de donaciones por su código:");
                    System.out.println("  Ingrese el código de la donación: ");
                    sc.nextLine();
                    String cod = sc.nextLine();
                    md.buscarDonacion(cod);
                    break;
                case 7:
                    System.out.println(" Saliendo...");
                    System.exit(0);
                default:
                    System.out.println("Escriba un numero del 1 al 7.");
                    mostrarMenu();
            }

        } while (seleccion < 8);
        System.out.println("");
    }

}
