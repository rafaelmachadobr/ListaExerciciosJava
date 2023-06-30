package controller;

import model.ContadorNumerosIntervalo;

import java.util.Scanner;

public class TesteContadorNumerosIntervalo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[20];

        System.out.println("Digite 20 números inteiros: ");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        ContadorNumerosIntervalo contadorNumerosIntervalo = new ContadorNumerosIntervalo(numeros);

        int quantidadeNumerosIntervalo = contadorNumerosIntervalo.contarNumerosIntervalo(0, 100);

        System.out.println("A quantidade de números no intervalo de 0 a 100 é: " +
                quantidadeNumerosIntervalo);

        scanner.close();
    }
}
