package model;

// Escrever um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês
// (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o seu nome, o
// salário fixo e salário no final do mês.

public class ComissaoVendedor {

    private String nomeVendedor;
    private double valorFixo;
    private int totalVendas;
    private double percentualComissao;

    public ComissaoVendedor() {
    }

    public ComissaoVendedor(String nomeVendedor, double valorFixo, int totalVendas, double percentualComissao) {
        this.nomeVendedor = nomeVendedor;
        this.valorFixo = valorFixo;
        this.totalVendas = totalVendas;
        this.percentualComissao = percentualComissao;
    }

    public String getNomeVendedor() {
        return nomeVendedor;
    }

    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }

    public double getValorFixo() {
        return valorFixo;
    }

    public void setValorFixo(double valorFixo) {
        this.valorFixo = valorFixo;
    }

    public int getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(int totalVendas) {
        this.totalVendas = totalVendas;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public double calcularSalarioFinal() {
        double valorComissao = this.totalVendas * this.percentualComissao;
        return this.valorFixo + valorComissao;
    }
}
