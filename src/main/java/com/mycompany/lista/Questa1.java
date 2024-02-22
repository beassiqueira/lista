/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.questa1;

import java.util.Scanner;



public class Questa1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua 1ºnota:");
        double p1 = scanner.nextDouble();
        System.out.println("Digite sua 2ºnota:");
        double p2 = scanner.nextDouble();
        System.out.println("Digite sua 3ºnota:");
        double p3 = scanner.nextDouble();
        double m = (p1+p2+p3)/3;
        if (7.0 < m) {
            System.out.println("Média: " + m);
            System.out.println("Aprovado!");
        }
        else {
            System.out.println("Média: "+m);
            System.out.println("Você está de recuperação.");
            System.out.println("Digite sua nota da recpar: ");
            double rec = scanner.nextDouble();
            double mf = (m+rec)/2;
            if (mf >= 5) {
                System.out.println("Média Final: " + mf);
                System.out.println("Aprovado pelo conselho.");
            }
            else {
                System.out.println("Média Final: " + mf);
                System.out.println("Reprovado :/ ");}
            }
        }
    }

