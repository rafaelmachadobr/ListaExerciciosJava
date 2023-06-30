package controller;

import model.CalculadoraPrestacoes;

import java.util.Scanner;

public class TesteCalculadoraPrestacoes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double valorCompra = scanner.nextDouble();

        CalculadoraPrestacoes calculadoraPrestacoes = new CalculadoraPrestacoes(valorCompra);

        System.out.println("O valor das prestações é: R$" + calculadoraPrestacoes.calcularValorPrestacoes());

        scanner.close();
    }
}
