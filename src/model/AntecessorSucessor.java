package model;

public class AntecessorSucessor {

    private int numero;
    private int antecessor;
    private int sucessor;

    public AntecessorSucessor() {
    }

    public AntecessorSucessor(int numero) {
        this.numero = numero;
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

    public int getSucessor() {
        return sucessor;
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
