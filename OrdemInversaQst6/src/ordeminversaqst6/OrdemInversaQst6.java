/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordeminversaqst6;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class OrdemInversaQst6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dimensao = 10;
        int[] valor = new int[dimensao];

        System.out.println("Digite 10 valores inteiros:");
        for (int i = 0; i < dimensao; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            valor[i] = scanner.nextInt();
        }

        System.out.println("\nValores na ordem inversa:");
        for (int i = dimensao - 1; i >= 0; i--) {
            System.out.println("Valor " + (i + 1) + ": " + valor[i]);
        }

        scanner.close();
    }
    
}
