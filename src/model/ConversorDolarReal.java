package model;

// Elaborar um programa que efetue a apresentação do valor da conversão em real (R$) de um valor lido em dólar (US$).
// O programa deverá solicitar o valor da cotação do dólar e também a quantidade de dólares disponíveis com o usuário.

public class ConversorDolarReal {
    private double cotacaoDolar;
    private double quantidadeDolar;

    public ConversorDolarReal() {
    }

    public ConversorDolarReal(double cotacaoDolar, double quantidadeDolar) {
        this.cotacaoDolar = cotacaoDolar;
        this.quantidadeDolar = quantidadeDolar;
    }

    public double getCotacaoDolar() {
        return cotacaoDolar;
    }

    public void setCotacaoDolar(double cotacaoDolar) {
        this.cotacaoDolar = cotacaoDolar;
    }

    public double getQuantidadeDolar() {
        return quantidadeDolar;
    }

    public void setQuantidadeDolar(double quantidadeDolar) {
        this.quantidadeDolar = quantidadeDolar;
    }

    public double converterDolarParaReal() {
        return this.cotacaoDolar * this.quantidadeDolar;
    }
}
