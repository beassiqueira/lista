/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.questa1;

import java.util.Scanner;

/**
 *
 * @author Siqueira
 */
public class Questao2 {

    public static void main(String[] args) {
        int quant;
        double cA,cB;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de livros que você deseja comprar: ");
        quant=scanner.nextInt();
        cB=(0.50*quant)+2.50;
        cA=(0.25*quant)+7.50;
        System.out.println("O custo total para o critério 'A': "+cA);
        System.out.println("Custo total para o critério 'B': "+cB);
        if(cA<cB) {
            System.out.println("A melhor opção de desconto é a do critério 'A'");
        } else 
            if (cB<cA) {
            System.out.println("A melhor opção de desconto é a do critério 'B'");
        } 
    }
}
    

