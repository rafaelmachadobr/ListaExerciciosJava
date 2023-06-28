package controller;

import model.EncontrarPessoaMaisNova;

import java.util.Scanner;

public class TesteEncontrarPessoaMaisNova {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[10];
        Integer[] idades = new Integer[10];

        System.out.println("Digite o nome e a idade de 10 pessoas:\n");

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
            System.out.print("Idade " + (i + 1) + ": ");
            idades[i] = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println("\n");

        EncontrarPessoaMaisNova encontrarPessoaMaisNova = new EncontrarPessoaMaisNova(nomes, idades);
        String nomePessoaMaisNova = encontrarPessoaMaisNova.encontrarPessoaMaisNova();

        System.out.println("A pessoa mais nova é: " + nomePessoaMaisNova);

        scanner.close();
    }
}
