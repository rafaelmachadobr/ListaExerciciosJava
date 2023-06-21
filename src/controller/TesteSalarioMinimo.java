package controller;

import model.SalarioMinimo;

import java.util.Scanner;

public class TesteSalarioMinimo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do salário mínimo:");
        double salarioMinimo = scanner.nextDouble();

        System.out.println("Digite o valor do salário do usuário:");
        double salarioUsuario = scanner.nextDouble();

        SalarioMinimo salarioMinimoObj = new SalarioMinimo(salarioMinimo, salarioUsuario);

        System.out.println("O usuário recebe " + salarioMinimoObj.calcularQuantidadeSalariosMinimos() + " salários mínimos.");
    }
}
