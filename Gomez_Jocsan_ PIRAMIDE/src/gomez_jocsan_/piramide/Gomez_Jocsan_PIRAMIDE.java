/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gomez_jocsan_.piramide;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Gomez_Jocsan_PIRAMIDE {

    /**
     * @param args the command line arguments
     */
    public static void mostrarPiramide(int numFilas) {
        int numero = 1;
        
        for (int fila = 1; fila <= numFilas; fila++) {
            int sumaFila = 0;
            StringBuilder numerosFila = new StringBuilder();

            for (int i = 0; i < fila; i++) {
                numerosFila.append(numero).append(" ");
                sumaFila += numero;
                numero += 2;
            }
            
            System.out.println(numerosFila.toString() + "= " + sumaFila);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Cantidad de fila de la piramide: ");
        int nFilas = scanner.nextInt();
        
        mostrarPiramide(nFilas);
        
        scanner.close();
    }
}