package model;

// Desenvolva um programa em Java que leia um número inteiro e imprima o seu antecessor e seu sucessor.

public class AntecessorSucessor {

    private int numero;
    private int antecessor;
    private int sucessor;

    public AntecessorSucessor() {
    }

    public AntecessorSucessor(int numero) {
        this.numero = numero;
    }

    public AntecessorSucessor(int numero, int antecessor, int sucessor) {
        this.numero = numero;
        this.antecessor = antecessor;
        this.sucessor = sucessor;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAntecessor() {
        return antecessor;
    }

    public void setAntecessor(int antecessor) {
        this.antecessor = antecessor;
    }

    public int getSucessor() {
        return sucessor;
    }

    public void setSucessor(int sucessor) {
        this.sucessor = sucessor;
    }

    private void calcularAntecessor() {
        this.antecessor = this.numero - 1;
    }

    private void calcularSucessor() {
        this.sucessor = this.numero + 1;
    }

    public void calcularAntecessorSucessor() {
        this.calcularAntecessor();
        this.calcularSucessor();
    }
}
