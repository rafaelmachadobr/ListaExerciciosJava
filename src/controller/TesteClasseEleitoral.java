package controller;

import model.ClasseEleitoral;

import java.util.Scanner;
import java.time.LocalDate;

public class TesteClasseEleitoral {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        int anoAtual = LocalDate.now().getYear();

        int idade = anoAtual - anoNascimento;

        System.out.println("Idade: " + idade);

        ClasseEleitoral classeEleitoral = new ClasseEleitoral(idade);

        classeEleitoral.verificar();
    }
}
