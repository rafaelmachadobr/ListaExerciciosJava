package controller;

import model.Divisibilidade;

import java.util.Scanner;

public class TesteDivisibilidade {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número: ");
        int numero = scanner.nextInt();

        Divisibilidade divisibilidade = new Divisibilidade();
        divisibilidade.setNumero(numero);

        divisibilidade.verificarDivisibilidade();
    }
}
