package model;

// Crie um programa em JAVA que leia a idade de uma pessoa e informe a sua classe eleitoral:
//• não eleitor (abaixo de 16 anos);
//• eleitor obrigatório (entre a faixa de 18 e menor de 65 anos);
//• eleitor facultativo (de 16 até 18 anos e maior de 65 anos, inclusive).

public class ClasseEleitoral {
    private int idade;

    public ClasseEleitoral() {
    }

    public ClasseEleitoral(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void verificar() {
        if (getIdade() < 16) {
            System.out.println("Não eleitor.");
        } else if (getIdade() >= 16 && getIdade() < 18 || getIdade() >= 65) {
            System.out.println("Eleitor facultativo.");
        } else {
            System.out.println("Eleitor obrigatório.");
        }
    }
}
