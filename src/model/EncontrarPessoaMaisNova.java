package model;

// Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova.

public class EncontrarPessoaMaisNova {
    private String[] nomes;
    private Integer[] idades;

    public EncontrarPessoaMaisNova() {
    }

    public EncontrarPessoaMaisNova(String[] nomes, Integer[] idades) {
        this.nomes = nomes;
        this.idades = idades;
    }

    public String[] getNomes() {
        return nomes;
    }

    public void setNomes(String[] nomes) {
        this.nomes = nomes;
    }

    public Integer[] getIdades() {
        return idades;
    }

    public void setIdades(Integer[] idades) {
        this.idades = idades;
    }

    public String encontrarPessoaMaisNova() {
        String[] nomes = this.getNomes();
        Integer[] idades = this.getIdades();
        Integer menorIdade = idades[0];
        String nomePessoaMaisNova = nomes[0];

        for (int i = 0; i < idades.length; i++) {
            if (idades[i] < menorIdade) {
                menorIdade = idades[i];
                nomePessoaMaisNova = nomes[i];
            }
        }

        return nomePessoaMaisNova;
    }
}
