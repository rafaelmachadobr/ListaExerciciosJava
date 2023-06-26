package controller;

import model.ComissaoVendedor;

import java.util.Scanner;

public class TesteComissaoVendedor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do vendedor:");
        String nomeVendedor = scanner.nextLine();

        System.out.println("Digite o valor fixo:");
        double valorFixo = scanner.nextDouble();

        System.out.println("Digite o total de vendas:");
        int totalVendas = scanner.nextInt();

        System.out.println("Digite o percentual de comissão:");
        double percentualComissao = scanner.nextDouble();

        ComissaoVendedor comissaoVendedor = new ComissaoVendedor(nomeVendedor, valorFixo, totalVendas, percentualComissao);

        System.out.println("O valor da comissão é de R$" + comissaoVendedor.calcularSalarioFinal());

        scanner.close();

    }
}
