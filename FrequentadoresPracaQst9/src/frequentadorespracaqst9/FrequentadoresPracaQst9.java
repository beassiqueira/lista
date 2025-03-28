/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package frequentadorespracaqst9;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class FrequentadoresPracaQst9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = 10;
        int[] idd = new int[size];

        System.out.println("Digite as idades de 10 frequentadores:");
        for (int i = 0; i < size; i++) {
            System.out.print("Idade " + (i + 1) + ": ");
            idd[i] = scanner.nextInt();
        }

        int maiorIdade = idd[0];
        for (int i = 1; i < size; i++) {
            if (idd[i] > maiorIdade) {
                maiorIdade = idd[i];
            }
        }

        int menorIdade = idd[0];
        for (int i = 1; i < size; i++) {
            if (idd[i] < menorIdade) {
                menorIdade = idd[i];
            }
        }

        int somaIdades = 0;
        for (int idade : idd) {
            somaIdades += idade;
        }
        double mediaIdades = (double) somaIdades / size;

        System.out.println("\nResultados:");
        System.out.println("Maior idade: " + maiorIdade);
        System.out.println("Menor idade: " + menorIdade);
        System.out.printf("Média das idades: %.2f\n", mediaIdades);

        scanner.close();
    }
    
}
