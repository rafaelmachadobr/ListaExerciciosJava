package model;

// Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos números 4, 5 e 6. A soma das duas
// médias. A média das médias.

public class MediaAritmetica {

    private Integer[] numeros;
    private Double media;

    public MediaAritmetica() {
    }

    public MediaAritmetica(Integer[] numeros) {
        this.numeros = numeros;
    }

    public Integer[] getNumeros() {
        return numeros;
    }

    public void setNumeros(Integer[] numeros) {
        this.numeros = numeros;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

    public void calcularMedia() {
        Double soma = 0.0;
        for (Integer numero : this.numeros) {
            soma += numero;
        }
        this.media = soma / this.numeros.length;
    }
}
