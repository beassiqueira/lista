/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package telefoneqst7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class TelefoneQst7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas deseja cadastrar? ");
        int qtd = scanner.nextInt();
        scanner.nextLine();

        Map<String, String> agenda = new HashMap<>();

        for (int i = 0; i < qtd; i++) {
            System.out.println("\nCadastro " + (i + 1) + ":");
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Telefone: ");
            String tel = scanner.nextLine();
            agenda.put(nome, tel);
        }

        System.out.print("\nDigite o nome para consultar o telefone: ");
        String nomeConsulta = scanner.nextLine();

        if (agenda.containsKey(nomeConsulta)) {
            System.out.println("Telefone de " + nomeConsulta + ": " + agenda.get(nomeConsulta));
        } else {
            System.out.println("Nome não encontrado na agenda.");
        }

        scanner.close();
    }
    
}
