package model;

public class Divisibilidade {

    private int numero;

    public Divisibilidade() {
    }

    public Divisibilidade(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void verificarDivisibilidade() {
        if (numero % 10 == 0) {
            System.out.println("O número " + numero + " é divisível por 10.");
        } else if (numero % 5 == 0) {
            System.out.println("O número " + numero + " é divisível por 5.");
        } else if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é divisível por 2.");
        } else {
            System.out.println("O número " + numero + " não é divisível por 10, 5 ou 2.");
        }
    }
}
