package com.sample;

public class AlarmeParcial {
	private Divisao divisao;
	private boolean ligado;
	private boolean disparadoPorAlarmeTotal;
	public AlarmeParcial(Divisao divisao, boolean ligado, boolean disparadoPorAlarmeTotal) {
		super();
		this.divisao = divisao;
		this.ligado = ligado;
		this.disparadoPorAlarmeTotal = disparadoPorAlarmeTotal;
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
	public boolean isDisparadoPorAlarmeTotal() {
		return disparadoPorAlarmeTotal;
	}
	public void setDisparadoPorAlarmeTotal(boolean disparadoPorAlarmeTotal) {
		this.disparadoPorAlarmeTotal = disparadoPorAlarmeTotal;
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
