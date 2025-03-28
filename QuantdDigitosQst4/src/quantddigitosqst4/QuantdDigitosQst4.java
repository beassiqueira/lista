/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quantddigitosqst4;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class QuantdDigitosQst4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);

        System.out.print("Escreva um numero inteiro maior ou igual a 0: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Inválido. Por favor, insira um numero maior ou igual a 0.");
           
        } else {
            int qtddigitos = contarDigitos(numero);

            System.out.println("O numero de dígitos é: " + qtddigitos);
        }

        scanner.close();
    }


    private static int contarDigitos(int numero) {
        if (numero == 0) {
            return 1; // o
        }

        int contador = 0;
        while (numero != 0) {
            numero /= 10; 
            contador++;
        }

        return contador;
    }
    
}
