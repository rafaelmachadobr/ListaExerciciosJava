package model;

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
