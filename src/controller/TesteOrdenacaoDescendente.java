package controller;

import model.OrdenacaoDescendente;

import java.util.Scanner;

public class TesteOrdenacaoDescendente {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        int valorA = scanner.nextInt();

        System.out.println("Digite o valor de B: ");
        int valorB = scanner.nextInt();

        System.out.println("Digite o valor de C: ");
        int valorC = scanner.nextInt();

        OrdenacaoDescendente ordenacaoDescendente = new OrdenacaoDescendente(valorA, valorB, valorC);

        System.out.println("\nOrdem decrescente: ");
        ordenacaoDescendente.ordenar();

        scanner.close();
    }
}
