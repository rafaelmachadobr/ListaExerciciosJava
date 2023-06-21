package controller;

import model.ReajusteSalarial;

import java.util.Scanner;

public class TesteReajusteSalarial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do salário atual:");
        double salarioAtual = scanner.nextDouble();

        System.out.println("Digite o valor do percentual de reajuste:");
        double percentualReajuste = scanner.nextDouble();

        ReajusteSalarial rs = new model.ReajusteSalarial(salarioAtual, percentualReajuste);

        System.out.println("O valor do reajuste é de R$" + rs.calcularValorNovoSalario());
    }
}
