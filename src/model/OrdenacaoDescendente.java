package model;

import java.util.List;

public class OrdenacaoDescendente {

    private int valorA;
    private int valorB;
    private int valorC;

    public OrdenacaoDescendente() {
    }

    public OrdenacaoDescendente(int valorA, int valorB, int valorC) {
        this.valorA = valorA;
        this.valorB = valorB;
        this.valorC = valorC;
    }

    public int getValorA() {
        return valorA;
    }

    public void setValorA(int valorA) {
        this.valorA = valorA;
    }

    public int getValorB() {
        return valorB;
    }

    public void setValorB(int valorB) {
        this.valorB = valorB;
    }

    public int getValorC() {
        return valorC;
    }

    public void setValorC(int valorC) {
        this.valorC = valorC;
    }

    public void ordenar() {
        if (getValorA() >= getValorB() && getValorA() >= valorC) {
            System.out.println(getValorA());
        } else if (getValorB() >= getValorA() && getValorB() >= getValorC()) {
            System.out.println(getValorB());
        } else {
            System.out.println(getValorC());
        }

        if (getValorA() <= getValorB() && getValorA() <= getValorC()) {
            System.out.println(getValorA());
        } else if (getValorB() <= getValorA() && getValorB() <= getValorC()) {
            System.out.println(getValorB());
        } else {
            System.out.println(getValorC());
        }

        if (getValorA() >= getValorB() && getValorA() <= getValorC()) {
            System.out.println(getValorA());
        } else if (getValorB() >= getValorA() && getValorB() <= getValorC()) {
            System.out.println(getValorB());
        } else {
            System.out.println(getValorC());
        }
    }

}
