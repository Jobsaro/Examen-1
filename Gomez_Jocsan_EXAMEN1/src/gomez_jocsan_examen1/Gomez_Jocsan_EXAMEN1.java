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
public class Gomez_Jocsan_EXAMEN1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        
        do{
            System.out.println("----MENU----"
                + "\n1. PIRAMIDE."
                + "\n2. EL MAYOR."
                + "\n3. COMPRA CANALES."
                + "\n4. CARACTERES VOCALES."
                + "\n5. SALIR");
            System.out.println("Ingrese una opcion: ");
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1:
                    Gomez_Jocsan_PIRAMIDE.ejecutar();
                    break;
                    
                case 2:
                    Gomez_Jocsan_COMPRACANALES.ejecutar();
                    break;
                    
                case 3:
                    Gomez_Jocsan_ELMAYOR.ejecutar();
                    break;
                    
                case 4:
                    Gomez_Jocsan_CARACTERESVOCALES.ejecutar();
                    break;
                    
                case 5:
                    System.out.println("Saliendo...");
                    break;
                    
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
            
        }while (opcion != 5);
        
    }
    
}
