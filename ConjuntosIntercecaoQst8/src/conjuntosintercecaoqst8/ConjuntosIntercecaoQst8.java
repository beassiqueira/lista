/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conjuntosintercecaoqst8;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author aluno
 */
public class ConjuntosIntercecaoQst8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

     
        System.out.print("Quantos numeros cada conjunto tera? ");
        int qtd = scanner.nextInt();

        Set<Integer> conjunto_1 = new HashSet<>();
        Set<Integer> conjunto_2 = new HashSet<>();

        System.out.println("\nDigite os numeros do primeiro conjunto:");
        for (int i = 0; i < qtd; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            conjunto_1.add(scanner.nextInt());
        }

        System.out.println("\nDigite os numeros do segundo conjunto:");
        for (int i = 0; i < qtd; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            conjunto_2.add(scanner.nextInt());
        }

        // Calcula a interseção dos conjuntos
        Set<Integer> intersecao = new HashSet<>(conjunto_1);
        intersecao.retainAll(conjunto_2); 

        if (intersecao.isEmpty()) {
            System.out.println("\nNão há números repetidos nos dois conjuntos.");
        } else {
            System.out.println("\nNúmeros repetidos nos dois conjuntos (interseçao):");
            for (int numero : intersecao) {
                System.out.println(numero);
            }
        }

        scanner.close();
    }
    
}
