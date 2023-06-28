package model;

// Leia a idade de 20 pessoas e exiba a soma das idades.

public class AcumuladorIdades {

    private Integer[] idades;

    public AcumuladorIdades() {
    }

    public AcumuladorIdades(Integer[] idades) {
        this.idades = idades;
    }

    public Integer[] getIdades() {
        return idades;
    }

    public void setIdades(Integer[] idades) {
        this.idades = idades;
    }

    public int calcularSoma() {
        int soma = 0;
        for (int i = 0; i < this.idades.length; i++) {
            soma += this.idades[i];
        }
        return soma;
    }

}
