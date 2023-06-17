package model;

// Criar um programa em Java, que informe a quantidade total de calorias de uma refeição a partir do usuário que
// deverá informar o prato, a sobremesa e a bebida (veja a tabela a seguir).

public class Refeicao {
    private int prato;
    private int sobremesa;
    private int bebida;

    public Refeicao() {
    }

    public Refeicao(int prato, int sobremesa, int bebida) {
        this.prato = prato;
        this.sobremesa = sobremesa;
        this.bebida = bebida;
    }

    public int getPrato() {
        return prato;
    }

    public void setPrato(int prato) {
        this.prato = prato;
    }

    public int getSobremesa() {
        return sobremesa;
    }

    public void setSobremesa(int sobremesa) {
        this.sobremesa = sobremesa;
    }

    public int getBebida() {
        return bebida;
    }

    public void setBebida(int bebida) {
        this.bebida = bebida;
    }

    public int calcularCalorias() {
        int caloriasPrato = obterCaloriasPrato();
        int caloriasSobremesa = obterCaloriasSobremesa();
        int caloriasBebida = obterCaloriasBebida();
        return caloriasPrato + caloriasSobremesa + caloriasBebida;
    }

    private int obterCaloriasPrato() {
        return switch (getPrato()) {
            case 1 -> 180;
            case 2 -> 230;
            case 3 -> 250;
            case 4 -> 350;
            default -> 0;
        };
    }

    private int obterCaloriasSobremesa() {
        return switch (sobremesa) {
            case 1 -> 75;
            case 2 -> 110;
            case 3 -> 170;
            case 4 -> 200;
            default -> 0;
        };
    }

    private int obterCaloriasBebida() {
        return switch (bebida) {
            case 1 -> 20;
            case 2 -> 70;
            case 3 -> 100;
            case 4 -> 65;
            default -> 0;
        };
    }
}
