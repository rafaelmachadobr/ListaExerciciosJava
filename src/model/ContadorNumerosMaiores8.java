package model;

// Escreva um programa que leia 20 números do usuário e exiba quantos números são maiores do que 8.

public class ContadorNumerosMaiores8 {

    private int[] numeros;

    public ContadorNumerosMaiores8() {
    }

    public ContadorNumerosMaiores8(int[] numeros) {
        this.numeros = numeros;
    }

    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }

    public int contarNumerosMaiores8() {
        int contador = 0;

        for (int i = 0; i < this.numeros.length; i++) {
            if (this.numeros[i] > 8) {
                contador++;
            }
        }

        return contador;
    }
}
