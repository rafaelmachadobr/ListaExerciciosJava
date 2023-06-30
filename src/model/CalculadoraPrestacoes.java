package model;

// A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco) prestações sem juros. Faça um programa que receba
// um valor de uma compra e mostre o valor das prestações.

public class CalculadoraPrestacoes {
    private double valorCompra;

    public CalculadoraPrestacoes() {
    }

    public CalculadoraPrestacoes(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double calcularValorPrestacoes() {
        return this.valorCompra / 5;
    }
}
