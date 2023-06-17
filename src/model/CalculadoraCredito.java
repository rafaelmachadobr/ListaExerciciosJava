package model;

public class CalculadoraCredito {
    private double saldoMedio;
    private double valorCredito;

    public CalculadoraCredito() {
    }

    public CalculadoraCredito(double saldoMedio) {
        this.saldoMedio = saldoMedio;
    }

    public double getSaldoMedio() {
        return saldoMedio;
    }

    public void setSaldoMedio(double saldoMedio) {
        this.saldoMedio = saldoMedio;
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public void calcularCredito() {
        if (saldoMedio <= 500) {
            valorCredito = saldoMedio * 0.3;
        } else if (saldoMedio <= 1000) {
            valorCredito = saldoMedio * 0.4;
        } else if (saldoMedio <= 3000) {
            valorCredito = saldoMedio * 0.5;
        } else {
            valorCredito = 0;
        }
    }
}

