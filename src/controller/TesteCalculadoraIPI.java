package controller;

import model.CalculadoraIPI;

import java.util.Scanner;

public class TesteCalculadoraIPI {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a porcentagem do IPI: ");
        Double porcentagemIPI = scanner.nextDouble();

        System.out.print("Digite o valor da peça 1: ");
        Double valorPeca1 = scanner.nextDouble();

        System.out.print("Digite a quantidade da peça 1: ");
        Integer quantidadePeca1 = scanner.nextInt();

        System.out.print("Digite o valor da peça 2: ");
        Double valorPeca2 = scanner.nextDouble();

        System.out.print("Digite a quantidade da peça 2: ");
        Integer quantidadePeca2 = scanner.nextInt();

        CalculadoraIPI calculadoraIPI = new CalculadoraIPI(porcentagemIPI, valorPeca1, valorPeca2, quantidadePeca1, quantidadePeca2);

        double valorTotal = calculadoraIPI.calcularValorTotal();

        System.out.println("Valor total a ser pago: R$" + valorTotal);
    }
}
