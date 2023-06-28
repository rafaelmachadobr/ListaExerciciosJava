package model;

// Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses números.

public class CalculadoraSoma {

    private Integer[] numeros;

    public CalculadoraSoma() {
    }

    public CalculadoraSoma(Integer[] numeros) {
        this.numeros = numeros;
    }

    public Integer[] getNumeros() {
        return numeros;
    }

    public void setNumeros(Integer[] numeros) {
        this.numeros = numeros;
    }

    public int calcularSoma() {
        int soma = 0;
        for (int i = 0; i < this.numeros.length; i++) {
            soma += this.numeros[i];
        }
        return soma;
    }

}
