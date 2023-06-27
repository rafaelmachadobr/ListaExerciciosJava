package controller;

import model.ConversorTemperatura;

import java.util.Scanner;

public class TesteConversorTemperatura {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius:");
        double temperaturaCelsius = scanner.nextDouble();

        ConversorTemperatura conversorTemperatura = new ConversorTemperatura();
        conversorTemperatura.setTemperaturaCelsius(temperaturaCelsius);

        System.out.println("A temperatura em Fahrenheit é: " + conversorTemperatura.calcularTemperaturaFahrenheit());
    }
}
