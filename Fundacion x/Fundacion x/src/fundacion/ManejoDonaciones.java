package fundacion;

import java.util.*;

public class ManejoDonaciones implements ManejoDonacion {
    
    ArrayList<Donacion> donacion = new ArrayList();
    Scanner sc = new Scanner(System.in);
    ArrayList<Donante> donadores = new ArrayList();
    Donante donante = new Donante();
    String nom;
    String ape;
    String cedula;
    MenuPrincipal mp = new MenuPrincipal();

    @Override
    public void registroDeDonacion(int x) {
        if (x == 1) {
            System.out.println("- Ingreso de donación comestible -");
            sc.nextLine();
            Donacion dn = new DonacionComestibles();
            DonacionComestibles dc = (DonacionComestibles) dn;
            System.out.println("Ingrese el codigo:  ");
            String cod = sc.nextLine();
            System.out.println("Ingrese el tipo de comestible:  ");
            String com = sc.nextLine();
            System.out.println("¿Es enlatado?  ");
            boolean en = sc.nextBoolean();
            sc.nextLine();
            System.out.println("Ingrese el motivo: ");
            String mot = sc.nextLine();
            System.out.println("Ingrese la cédula del donante: ");
            String ced = sc.nextLine();
            
            //Donante donandor = new Donante();
            this.seleccionarDonante(ced);
            dn = new DonacionComestibles(cod, donante, mot, com, en );
            //dn.setDonante(donante);
            donacion.add(dn);
           
            System.out.println("\n \n \n \n");
        } else {
            if (x == 2) {
                System.out.println("- Ingreso de donación económica -");
                sc.nextLine();
                Donacion dn = new DonacionEconomica();
                DonacionEconomica de = (DonacionEconomica) dn;
                System.out.println("Ingrese el monto: ");
                double mont = sc.nextDouble();
                sc.nextLine();
                System.out.println("Ingrese el codigo:  ");
                String cod = sc.nextLine();
                System.out.println("Ingrese la divisa:  ");
                String div = sc.nextLine();
                System.out.println("Ingrese el banco:  ");
                String banc = sc.nextLine();
                //ingresar donante
                System.out.println("Ingrese la cedula del donante:  ");
                String ced = sc.nextLine();
                Donante don = new Donante();
                System.out.println("Ingrese el motivo: ");
                String mot = sc.nextLine();
                dn = new DonacionEconomica(mont, div, banc, cod, don, mot);
                donacion.add(dn);
                System.out.println("\n \n");
            } else {
                if (x == 3) {
                    System.out.println("- Ingreso de donación de juguetes -");
                    sc.nextLine();
                    System.out.println("Ingrese el codigo: ");
                    String cod = sc.nextLine();
                    System.out.println("Ingrese el tipo de juguete: ");
                    String tip = sc.nextLine();
                    System.out.println("Ingrese la cantidad de juguetes: ");
                    int cant = sc.nextInt();
                    Donacion dn = new DonacionJuguetes(cod, tip, cant);
                    donacion.add(dn);
                    System.out.println("\n \n");
                } else {
                    if (x == 4) {
                        MenuPrincipal mp = new MenuPrincipal();
                    } else {
                        System.out.println("Solo puede ingresar del 1 al 4.");
                    }
                }
            }
        }
    }

    @Override
    public void mostrarDonacion() {
       
        int i = 1;
        System.out.println("Existen " + donacion.size() + " donaciones registradas:");
        for (Donacion dn : donacion) {
            System.out.println("Donación " + i + ": ");
            if (dn instanceof DonacionComestibles) {
                DonacionComestibles dc = (DonacionComestibles) dn;
                System.out.println("COMESTIBLE:  " + "Código: " + dc.getCodigo() + "; Tipo: " + dc.getTipodeComestible() + "; Comestible: " + dc.getenlatado() + "; Datos del donante: " + donante.toString());
            } else {
                if (dn instanceof DonacionJuguetes) {
                    DonacionJuguetes dj = (DonacionJuguetes) dn;
                    System.out.println("JUGUETE:  " + "Código: " + dj.getCodigo() + "; Tipo: " + dj.getTipo() + "; Cantidad: " + dj.getCantidad() + "; Datos del donante: " + donante.getApellidos());
                } else {
                    if (dn instanceof DonacionEconomica) {
                        DonacionEconomica de = (DonacionEconomica) dn;
                        System.out.println("ECONÓMICA:  " + "Código: " + de.getCodigo() + "; Divisa: " + de.getDivisa() + "; Banco: " + de.getBanco() + "; Datos del donante: " + donante.getApellidos());
                    }
                }
            }
            i++;
        }
    }
     public void seleccionarDonante(String ced) {
    
         for (Donante don : this.donadores) {
            if (don.getCedula().equals(ced)) {
                System.out.println("Donante Encontrado");
                nom= don.getNombres();
                ape= don.getApellidos();
                cedula= don.getCedula();
                
                
                donante.setNombres(nom);
                donante.setApellidos(ape);
                donante.setCedula(cedula);
                break;
            } else {
                System.out.println("El Donante No Se Encuentra Regristrado ");
                
            }
            
        }
         
     }

    @Override
    public void buscarDonacion(String cod) {
        for (Donacion dn : donacion) {
            if (cod.equals(dn.getCodigo())) {
                System.out.println("Donación encontrada.");
                if (dn instanceof DonacionComestibles) {
                    DonacionComestibles dc = (DonacionComestibles) dn;
                    System.out.println("Código: " + dc.getCodigo() + "; Tipo de comestible: " + dc.getTipodeComestible() + "; Enlatado: " + dc.getenlatado()
                            + "; Motivo: " + dc.getMotivo());
                } else {
                    if (dn instanceof DonacionEconomica) {
                        DonacionEconomica de = (DonacionEconomica) dn;
                        System.out.println("Código: " + de.getCodigo() + "; Banco: " + de.getBanco() + "; Divisa: " + de.getDivisa()
                                + "; Motivo: " + de.getMotivo());
                    } else {
                        if (dn instanceof DonacionJuguetes) {
                            DonacionJuguetes dj = (DonacionJuguetes) dn;
                            System.out.println("Código: " + dj.getCodigo() + "; Tipo de juguete: " + dj.getTipo() + "; Cantidad: " + dj.getCantidad()
                                    + "; Motivo: " + dj.getMotivo());
                        }
                    }
                }
            }
        }
    }
 
    
    public void calcularTotal() {
        double total = 0;
        for (Donacion dn : this.donacion) {
            if (dn instanceof DonacionEconomica) {
                DonacionEconomica de = (DonacionEconomica) dn;
                total = total + de.getMonto();
            }
        }
        System.out.println("El total de monto es: " + total);
    }
}
