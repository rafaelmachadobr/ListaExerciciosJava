package controller;

import model.SomadorNumerosDigitados;

public class TesteSomadorNumerosDigitados {

    public static void main(String[] args) {

        SomadorNumerosDigitados somadorNumerosDigitados = new SomadorNumerosDigitados();
        somadorNumerosDigitados.somarNumeros();

        System.out.println("A soma dos números digitados é: " + somadorNumerosDigitados.getSoma());
        System.out.println("Foram digitados " + somadorNumerosDigitados.getContador() + " números.");
    }
}
