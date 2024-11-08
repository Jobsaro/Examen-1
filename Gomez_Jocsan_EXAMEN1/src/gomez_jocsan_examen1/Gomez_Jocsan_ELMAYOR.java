/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gomez_jocsan_examen1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Gomez_Jocsan_ELMAYOR {

    /**
     * @param args the command line arguments
     */
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        
        // nombre del cliente
        System.out.print("Nombre de Cliente: ");
        String nombreCliente = scanner.nextLine();
        
        int canalesHD = 0;
        int canalesNormales = 0;
        String respuesta = "SI";
        
        // bucle de ingreso de canales
        while (respuesta.equalsIgnoreCase("SI")) {
            String tipoCanal = "";
            
            // validar el tipo de canal 
            while (true) {
                System.out.print("Ingrese el tipo de canal (HD, NORMAL o CANCELAR): ");
                tipoCanal = scanner.nextLine().toUpperCase();
                
                if (tipoCanal.equals("HD")) {
                    canalesHD++;
                    break; 
                } else if (tipoCanal.equals("NORMAL")) {
                    canalesNormales++;
                    break; 
                } else if (tipoCanal.equals("CANCELAR")) {
                    System.out.println("Operacion cancelada.");
                    scanner.close();
                    return; 
                } else {
                    System.out.println("Canal no valido. Intente de nuevo.");
                }
            }
            
            //preguntar si desea agregar otro canal
            System.out.print("Desea ingresar otro canal? (SI, NO o CANCELAR): ");
            respuesta = scanner.nextLine().toUpperCase();
            if (respuesta.equals("CANCELAR")) {
                System.out.println("Operación cancelada por el usuario.");
                scanner.close();
                return; 
            }
        }

        String tipoCaja = "";
        
        // Validar el tipo de caja digital
        while (true) {
            System.out.print("Ingrese el tipo de Caja Digital (LIGHTBOX, HDBOX, DVRBOX o CANCELAR): ");
            tipoCaja = scanner.nextLine().toUpperCase();
            
            if (tipoCaja.equals("LIGHTBOX") || tipoCaja.equals("HDBOX") || tipoCaja.equals("DVRBOX")) {
                break; 
            } else if (tipoCaja.equals("CANCELAR")) {
                System.out.println("Operacion cancelada .");
                scanner.close();
                return; 
            } else {
                System.out.println("Tipo de caja no valido. Intente de nuevo.");
            }
        }
        
        // calcular el costo de la caja 
        int costoCaja = 0;
        if (tipoCaja.equals("LIGHTBOX")) {
            costoCaja = 50;
        } else if (tipoCaja.equals("HDBOX")) {
            costoCaja = 100;
        } else if (tipoCaja.equals("DVRBOX")) {
            costoCaja = 150;
        }
        
        // calcular el subtotal
        int costoCanalesNormales = canalesNormales * 20;
        int costoCanalesHD = canalesHD * 30; 
        int subtotal = costoCanalesNormales + costoCanalesHD + costoCaja;
        
        // calcular el impuesto 15%
        double impuesto = subtotal * 0.15;
        
        // calcular el total a pagar
        double total = subtotal + impuesto;
        
        // Mstrar el resultado
        System.out.println("\nResumen de Pago:");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Canales Normales: " + canalesNormales);
        System.out.println("Canales HD: " + canalesHD);
        System.out.println("Subtotal: " + subtotal + " Lps");
        System.out.println("Impuesto (15%): " + impuesto + " Lps");
        System.out.println("Total a Pagar: " + total + " Lps");

    }
}