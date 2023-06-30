package model;

// Escreva um programa que leia uma sequência de números do usuário e realize a soma desses números. Encerre a execução
// quando um número negativo for digitado.

import java.util.Scanner;

public class SomadorNumerosDigitados {
    private int soma;
    private int contador;

    public SomadorNumerosDigitados() {
        this.soma = 0;
        this.contador = 0;
    }

    public void somarNumeros() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Digite um número (ou um número negativo para encerrar):");
            int numero = scanner.nextInt();

            if (numero < 0) {
                break;
            }

            soma += numero;
            contador++;
        }

        scanner.close();
    }

    public int getSoma() {
        return soma;
    }

    public int getContador() {
        return contador;
    }
}
