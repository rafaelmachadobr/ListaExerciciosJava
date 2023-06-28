package controller;

import model.VerificadorIdade;

import java.util.Scanner;

public class TesteVerificadorIdade {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as idades das 20 pessoas:\n");
        Integer[] idades = new Integer[20];

        for (int i = 0; i < idades.length; i++) {
            System.out.print("Idade " + (i + 1) + ": ");
            idades[i] = scanner.nextInt();
        }

        VerificadorIdade verificadorIdade = new VerificadorIdade(idades);
        int resultado = verificadorIdade.verificarIdade();

        System.out.println("O número de pessoas com idade maior ou igual a 18 anos é: " + resultado);

        scanner.close();
    }
}
