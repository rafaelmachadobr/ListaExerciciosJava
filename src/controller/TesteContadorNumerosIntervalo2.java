package controller;

import model.ContadorNumerosIntervalo;

import java.util.Scanner;

public class TesteContadorNumerosIntervalo2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[20];

        System.out.println("Digite 20 números inteiros: ");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        ContadorNumerosIntervalo contadorNumerosIntervalo = new ContadorNumerosIntervalo(numeros);

        int numerosEntre0e100 = contadorNumerosIntervalo.contarNumerosIntervalo(0, 100);
        int numerosEntre101e200 = contadorNumerosIntervalo.contarNumerosIntervalo(101, 200);
        int numerosMaioresDe200 = contadorNumerosIntervalo.contarNumerosIntervalo(201, Integer.MAX_VALUE);

        System.out.println("A quantidade de números no intervalo de 0 a 100 é: " +
                numerosEntre0e100);

        System.out.println("A quantidade de números no intervalo de 101 a 200 é: " +
                numerosEntre101e200);

        System.out.println("A quantidade de números maiores que 200 é: " +
                numerosMaioresDe200);

        scanner.close();
    }
}
