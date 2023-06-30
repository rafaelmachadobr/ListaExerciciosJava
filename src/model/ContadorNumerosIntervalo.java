package model;

// Faça um programa que leia 20 números e, ao final, escreva quantos estão entre 0 e 100.
// Faça um programa que leia 20 números e, ao final, escreva quantos estão entre 0 e 100, quantos estão entre 101 e 200
// e quantos são maiores de 200.

public class ContadorNumerosIntervalo {
    private int[] numeros;

    public ContadorNumerosIntervalo() {
    }

    public ContadorNumerosIntervalo(int[] numeros) {
        this.numeros = numeros;
    }

    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }

    public int contarNumerosIntervalo(int inicio, int fim) {
        int contador = 0;

        for (int i = 0; i < this.numeros.length; i++) {
            if (this.numeros[i] >= inicio && this.numeros[i] <= fim) {
                contador++;
            }
        }

        return contador;
    }
}
