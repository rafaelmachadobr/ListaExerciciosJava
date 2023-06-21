package model;

// Informar um saldo e imprimir o saldo com reajuste de 1.5%.

public class ReajusteSalarial {

    private double salarioAtual;
    private double percentualReajuste;

    public ReajusteSalarial() {
    }

    public ReajusteSalarial(double salarioAtual, double percentualReajuste) {
        this.salarioAtual = salarioAtual;
        this.percentualReajuste = percentualReajuste;
    }

    public double getSalarioAtual() {
        return salarioAtual;
    }

    public void setSalarioAtual(double salarioAtual) {
        this.salarioAtual = salarioAtual;
    }

    public double getPercentualReajuste() {
        return percentualReajuste;
    }

    public void setPercentualReajuste(double percentualReajuste) {
        this.percentualReajuste = percentualReajuste;
    }

    public double calcularValorReajuste() {
        return this.salarioAtual * (this.percentualReajuste / 100);
    }

    public double calcularValorNovoSalario() {
        return this.salarioAtual + this.calcularValorReajuste();
    }
}
