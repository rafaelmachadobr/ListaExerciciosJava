package controller;

import model.ContadorNumerosMaiores8;

import java.util.Scanner;

public class TesteContadorNumerosMaiores {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[20];

        System.out.println("Digite 20 números inteiros: ");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        ContadorNumerosMaiores8 contadorNumerosMaiores8 = new ContadorNumerosMaiores8(numeros);

        System.out.println("A quantidade de números maiores que 8 é: " +
                contadorNumerosMaiores8.contarNumerosMaiores8());

        scanner.close();
    }
}
