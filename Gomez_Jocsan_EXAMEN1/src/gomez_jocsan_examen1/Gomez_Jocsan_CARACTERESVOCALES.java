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
public class Gomez_Jocsan_CARACTERESVOCALES {

    /**
     * @param args the command line arguments
     */
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        
        //ingrese una cadena
        System.out.print("Ingresa una cadena: ");
        String input = scanner.nextLine();
       
        int count = 0;
        
        // recorrer caracter de la cadena
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            
            //  verificar si el caracter es una vocal minúscula
            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                    break;
                default:
                    break;
            }
        }
        
        System.out.println("La cadena contiene " + count + " vocal(es).");
        
    }
}