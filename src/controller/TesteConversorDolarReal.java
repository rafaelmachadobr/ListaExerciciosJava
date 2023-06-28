package controller;

import model.ConversorDolarReal;

import java.util.Scanner;

public class TesteConversorDolarReal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a cotação do dólar: ");
        double cotacaoDolar = scanner.nextDouble();

        System.out.print("Digite a quantidade de dólares: ");
        double quantidadeDolar = scanner.nextDouble();

        ConversorDolarReal conversorDolarReal = new ConversorDolarReal(cotacaoDolar, quantidadeDolar);

        System.out.println("O valor em reais é: R$" + conversorDolarReal.converterDolarParaReal());

        scanner.close();
    }
}
