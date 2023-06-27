package controller;

import model.SomaNumeros;

public class TesteSomaNumeros {

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        int resultado = somaNumeros.calcularSoma();
        System.out.println("A soma dos números de 1 a 15 é: " + resultado);
    }
}
