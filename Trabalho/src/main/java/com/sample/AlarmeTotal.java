package com.sample;

public class AlarmeTotal {
    Divisao divisao;
    boolean ligado;

    public AlarmeTotal(Divisao divisao, boolean ligado) {
        super();
        this.divisao = divisao;
        this.ligado = ligado;
    }

    public Divisao getDivisao() {
        return divisao;
    }

    public void setDivisao(Divisao divisao) {
        this.divisao = divisao;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void disparar() {
        // Lógica para disparar o alarme total
        System.out.println("Alarme Total disparado!");
    }
}

