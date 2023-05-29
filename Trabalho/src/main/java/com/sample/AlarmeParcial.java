package com.sample;

public class AlarmeParcial {
	Divisao divisao;
	boolean ligado;
	public AlarmeParcial(Divisao divisao, boolean ligado) {
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
        // Lógica para disparar o alarme parcial
        System.out.println("Alarme Parcial disparado na divisão: " + divisao.getNome());
        // Outras ações para disparar o alarme parcial
    }
}
