package fundacion;

import java.util.*;

public class Donante {

    Scanner sc = new Scanner(System.in);

    private String nombres;
    private String apellidos;
    private String cedula;

    LinkedList<Donante> donadores = new LinkedList();

    int iterador;

//Constructors
    public Donante(String nombres, String apellidos, String cedula) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
    }

    public Donante() {
        this.apellidos = "Por defecto";
    }
//Getters and Setters

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
//metodos
@Override
public String toString(){
    return "Nombre: " + this.getNombres() + "  Apellidos: " + this.getApellidos() + "  Cedula: " + this.getCedula();
            
}
    public void registrarDonante() {

        Donante don = new Donante();
        System.out.println("Ingrese nombres: ");
        don.setNombres(sc.nextLine());
        System.out.println("Ingrese apellidos: ");
        don.setApellidos(sc.nextLine());
        System.out.println("Ingrese su cedula: ");
        don.setCedula(sc.nextLine());

        donadores.add(don);

        System.out.println("\n \n \n \n");
        MenuPrincipal mp = new MenuPrincipal();

    }

    public void mostrarDonantes() {
        int i = 1;
        for (Donante don : donadores) {
            System.out.println("Donante numero " + i + ": ");
            System.out.println("Nombre: " + don.getNombres() + "  Apellidos: " + don.getApellidos() + "  Cedula: " + don.getCedula());
            System.out.println("\n");
            i++;
        }
    }
     public Donante seleccionarDonante(String ced) {
         Donante donencontrado=new Donante();
         for (Donante don : this.donadores) {
            if (don.getCedula().equals(ced)) {
                System.out.println("Donante Encontrado");
                donencontrado = don;
                break;
            } else {
                System.out.println("El Donante No Se Encuentra Regristrado ");
                
            }
        }
         
          return donencontrado;
     }

    public void buscarDonante(String cdl) {
        //foreach
        for (Donante don : this.donadores) {
            //  Donante donEncontrado = null;
            if (don.cedula.equals(cdl)) {
                System.out.println("");

                System.out.println("Donante Encontrado");
                System.out.println("Nombre: " + don.getNombres() + "  Apellidos: " + don.getApellidos() + "  Cedula: " + don.getCedula());

                System.out.println("");

                break;

            } else {
                System.out.println("El Donante No Se Encuentra Regristrado ");

            }

        }

    }

}
