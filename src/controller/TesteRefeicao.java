package controller;

import model.Refeicao;

import java.util.Scanner;

public class TesteRefeicao {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o prato: ");
        System.out.println("1 - Vegetariano");
        System.out.println("2 - Peixe");
        System.out.println("3 - Frango");
        System.out.println("4 - Carne");
        int prato = scanner.nextInt();

        System.out.println("Informe a sobremesa: ");
        System.out.println("1 - Abacaxi");
        System.out.println("2 - Sorvete diet");
        System.out.println("3 - Mouse diet");
        System.out.println("4 - Mouse chocolate");
        int sobremesa = scanner.nextInt();

        System.out.println("Informe a bebida: ");
        System.out.println("1 - Chá");
        System.out.println("2 - Suco de laranja");
        System.out.println("3 - Suco de melão");
        System.out.println("4 - Refrigerante diet");
        int bebida = scanner.nextInt();

        Refeicao refeicao = new Refeicao();
        refeicao.setPrato(prato);
        refeicao.setSobremesa(sobremesa);
        refeicao.setBebida(bebida);

        int calorias = refeicao.calcularCalorias();

        System.out.println("A quantidade total de calorias da refeição é: " + calorias + " calorias.");

        scanner.close();

    }
}
