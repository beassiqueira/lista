/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication9;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite a nota da primeira Prova: ");
            double prova_1 = scanner.nextDouble();
            
            System.out.print("Digite a nota da segunda Prova: ");
            double prova_2 = scanner.nextDouble();
            
            System.out.print("Digite a nota da terceira Prova: ");
            double prova_3 = scanner.nextDouble();
            
            double media = (prova_1 + prova_2 + prova_3) / 3;
            
            System.out.printf("Media inicial: %.2f\n", media);
            
            if (media >= 7.0) {
                System.out.println("Aluno aprovado!");
            } else {
                System.out.println("Aluno em recuperaçao.");
                
                System.out.print("Digite a nota da Recuperaçao: ");
                double recuperacao = scanner.nextDouble();
                
                double mediaFinal = (media + recuperacao) / 2;
                
                System.out.printf("Media final: %.2f\n", mediaFinal);
                if (mediaFinal >= 5.0) {
                    System.out.println("Aluno aprovado apos recuperaçao!");
                } else {
                    System.out.println("Aluno reprovado.");
                }
            }
        }
    }
    
}
