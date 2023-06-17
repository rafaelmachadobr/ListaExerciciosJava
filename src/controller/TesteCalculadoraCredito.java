package controller;

import model.CalculadoraCredito;

import java.util.Scanner;

public class TesteCalculadoraCredito {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o saldo médio: ");
        double saldoMedio = scanner.nextDouble();

        CalculadoraCredito calculadoraCredito = new CalculadoraCredito();

        calculadoraCredito.setSaldoMedio(saldoMedio);

        calculadoraCredito.calcularCredito();

        double valorCredito = calculadoraCredito.getValorCredito();

        System.out.println("O valor do crédito é: " + valorCredito + " reais.");
        System.out.println("O saldo médio é: " + calculadoraCredito.getSaldoMedio() + " reais.");

        scanner.close();
    }
}
