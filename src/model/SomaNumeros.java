package model;

// Escreva um programa que calcule a soma dos números de 1 a 15.

public class SomaNumeros {

    public int calcularSoma() {
        int soma = 0;
        for (int i = 1; i <= 15; i++) {
            soma += i;
        }
        return soma;
    }
}
