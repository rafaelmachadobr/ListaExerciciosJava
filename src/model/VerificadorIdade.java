package model;

// Leia a idade de 20 pessoas e exiba quantas pessoas são maiores de idade.

public class VerificadorIdade {

    private Integer[] idades;

    public VerificadorIdade() {
    }

    public VerificadorIdade(Integer[] idades) {
        this.idades = idades;
    }

    public Integer[] getIdades() {
        return idades;
    }

    public void setIdades(Integer[] idades) {
        this.idades = idades;
    }

public Integer verificarIdade() {
        Integer[] idades = this.getIdades();
        Integer resultado = 0;

        for (int i = 0; i < idades.length; i++) {
            if (idades[i] >= 18) {
                resultado++;
            }
        }

        return resultado;
    }
}
