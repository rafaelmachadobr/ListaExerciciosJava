package model;

// Crie um programa que leia o valor do salário mínimo e o valor do salário de um usuário, calcule a quantidade de
// salários mínimos esse usuário ganha e imprima o resultado. (Salário mínimo = R$1.212,00).

public class SalarioMinimo {

    private double salarioMinimo;
    private double salarioUsuario;

    public SalarioMinimo() {
    }

    public SalarioMinimo(double salarioMinimo, double salarioUsuario) {
        this.salarioMinimo = salarioMinimo;
        this.salarioUsuario = salarioUsuario;
    }

    public double getSalarioMinimo() {
        return salarioMinimo;
    }

    public void setSalarioMinimo(double salarioMinimo) {
        this.salarioMinimo = salarioMinimo;
    }

    public double getSalarioUsuario() {
        return salarioUsuario;
    }

    public void setSalarioUsuario(double salarioUsuario) {
        this.salarioUsuario = salarioUsuario;
    }

    public double calcularQuantidadeSalariosMinimos() {
        return this.salarioUsuario / this.salarioMinimo;
    }
}
