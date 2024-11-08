/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gomez_jocsan_compracanales;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Gomez_Jocsan_COMPRACANALES {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mayorNumero = 0;
        int suma = 0;
        int contador = 0;
        String entrada;

        System.out.println("Ingrese numeros enteros ('X' detenerse):");

        while (true) {
            entrada = scanner.next();
            if (entrada.equalsIgnoreCase("X")) {
                break;
            }

            try {
                int numero = Integer.parseInt(entrada);
                suma += numero;
                contador++;

                if (contador == 1) {
                    mayorNumero = numero; 
                } else if (numero > mayorNumero) {
                    mayorNumero = numero; 
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número entero o 'X' para detenerse.");
            }
        }

        if (contador > 0) {
            double promedio = (double) suma / contador;
            System.out.println("El numero mayor ingresado es: " + mayorNumero);
            System.out.println("El promedio de los numeros ingresados es: " + promedio);
        } else {
            System.out.println("No se ingresaron numeros.");
        }
    }
}

