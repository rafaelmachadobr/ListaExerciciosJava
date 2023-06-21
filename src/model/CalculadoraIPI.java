package model;

// Escrever um programa que leia:
//- a porcentagem do IPI a ser acrescido no valor das peças
//- o código da peça 1, valor unitário da peça 1, quantidade de peças 1
//- o código da peça 2, valor unitário da peça 2, quantidade de peças 2
//O programa deve calcular o valor total a ser pago e apresentar o resultado.
//Cálculo : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)

public class CalculadoraIPI {

    private Double porcentagemIPI;
    private Double valorPeca1;
    private Double valorPeca2;
    private Integer quantidadePeca1;
    private Integer quantidadePeca2;

    public CalculadoraIPI() {
    }

    public CalculadoraIPI(Double porcentagemIPI, Double valorPeca1, Double valorPeca2, Integer quantidadePeca1, Integer quantidadePeca2) {
        this.porcentagemIPI = porcentagemIPI;
        this.valorPeca1 = valorPeca1;
        this.valorPeca2 = valorPeca2;
        this.quantidadePeca1 = quantidadePeca1;
        this.quantidadePeca2 = quantidadePeca2;
    }

    public Double getPorcentagemIPI() {
        return porcentagemIPI;
    }

    public void setPorcentagemIPI(Double porcentagemIPI) {
        this.porcentagemIPI = porcentagemIPI;
    }

    public Double getValorPeca1() {
        return valorPeca1;
    }

    public void setValorPeca1(Double valorPeca1) {
        this.valorPeca1 = valorPeca1;
    }

    public Double getValorPeca2() {
        return valorPeca2;
    }

    public void setValorPeca2(Double valorPeca2) {
        this.valorPeca2 = valorPeca2;
    }

    public Integer getQuantidadePeca1() {
        return quantidadePeca1;
    }

    public void setQuantidadePeca1(Integer quantidadePeca1) {
        this.quantidadePeca1 = quantidadePeca1;
    }

    public Integer getQuantidadePeca2() {
        return quantidadePeca2;
    }

    public void setQuantidadePeca2(Integer quantidadePeca2) {
        this.quantidadePeca2 = quantidadePeca2;
    }

    public Double calcularValorTotal() {
        double totalPeca1 = this.valorPeca1 * this.quantidadePeca1;
        double totalPeca2 = this.valorPeca2 * this.quantidadePeca2;
        double totalSemIPI = totalPeca1 + totalPeca2;
        double valorIPI = totalSemIPI * (this.porcentagemIPI / 100 + 1);
        return totalSemIPI + valorIPI;
    }
}
