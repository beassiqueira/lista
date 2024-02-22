/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.questa1;

import java.util.Scanner;


public class Questao3 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o 1º intervalo de tempo:");
        System.out.print("Horas: ");
        int h1 = scanner.nextInt();
        System.out.print("Minutos: ");
        int m1 = scanner.nextInt();
        System.out.print("Segundos: ");
        int s1 = scanner.nextInt();

        System.out.println("Digite o 2º intervalo de tempo:")  ;
        System.out.print("Horas: ");
        int h2 = scanner.nextInt();
        System.out.print("Minutos: ");
        int m2 = scanner.nextInt();
        System.out.print("Segundos: ");
        int s2 = scanner.nextInt();

        int sh = h1 + h2;
        int sm = m1 + m2;
        int ss = s1 + s2;

        int dh = h2 - h1;
        int dm = m2 - m1;
        int ds = s2 - s1;

        if(ss >=60){
            ss -=60;
            sm +=1;
        }
        if(sm >=60){
            sm -=60;
            sh +=1;
        }
        if(ds <=-1){
            ss +=60;
            sm -=1;
        }
        if(dm <=-1){
            dm +=60;
            dh -=1;
        }
        if(dh <=-1){
            dh +=24;
            
        }
        // Exibe os resultados
        System.out.println("\nSoma dos intervalos de tempo:");
        System.out.printf("%02d:%02d:%02d\n", sh, sm, ss);

        System.out.println("\nDiferença dos intervalos de tempo:");
        System.out.printf("%02d:%02d:%02d\n", dh, dm, ds);  
        
    }
    }
