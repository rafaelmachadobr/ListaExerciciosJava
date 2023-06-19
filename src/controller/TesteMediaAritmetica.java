package controller;

import model.MediaAritmetica;

import java.util.Scanner;

public class TesteMediaAritmetica {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de números: ");
        int quantidade = scanner.nextInt();

        Integer[] numeros = new Integer[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        MediaAritmetica mediaAritmetica = new MediaAritmetica(numeros);

        mediaAritmetica.calcularMedia();

        System.out.println("Média: " + mediaAritmetica.getMedia());
    }
}
