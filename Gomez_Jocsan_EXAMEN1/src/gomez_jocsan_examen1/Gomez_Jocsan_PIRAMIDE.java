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
public class Gomez_Jocsan_PIRAMIDE {


    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cantidad de filas de la piramide: ");
        int numFilas = scanner.nextInt();

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
}