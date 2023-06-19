package controller;

import model.AntecessorSucessor;

import java.util.Scanner;

public class TesteAntecessorSucessor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        AntecessorSucessor antecessorSucessor = new AntecessorSucessor();
        antecessorSucessor.setNumero(numero);

        antecessorSucessor.calcularAntecessorSucessor();

        System.out.println("Antecessor: " + antecessorSucessor.getAntecessor());
        System.out.println("Número: " + antecessorSucessor.getNumero());
        System.out.println("Sucessor: " + antecessorSucessor.getSucessor());
    }
}
