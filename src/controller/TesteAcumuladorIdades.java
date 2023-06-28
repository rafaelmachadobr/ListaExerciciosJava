package controller;

import model.AcumuladorIdades;

import java.util.Scanner;

public class TesteAcumuladorIdades {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Integer[] idades = new Integer[20];

        System.out.println("Digite as idades das 20 pessoas:\n");
        for (int i = 0; i < idades.length; i++) {
            System.out.println("Digite a " + (i + 1) + "ª idade:");
            idades[i] = scanner.nextInt();
        }

        AcumuladorIdades acumuladorIdades = new AcumuladorIdades(idades);
        int soma = acumuladorIdades.calcularSoma();

        System.out.println("A soma das idades é: " + soma);

        scanner.close();

    }
}
