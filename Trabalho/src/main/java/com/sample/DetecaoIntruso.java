package com.sample;

public class DetecaoIntruso {
	private boolean ativacaoSensorMovimento;
	private boolean ativacaoSensorAcesso;
	public DetecaoIntruso(boolean ativacaoSensorMovimento, boolean ativacaoSensorAcesso) {
		super();
		this.ativacaoSensorMovimento = ativacaoSensorMovimento;
		this.ativacaoSensorAcesso = ativacaoSensorAcesso;
	}
	public boolean isAtivacaoSensorMovimento() {
		return ativacaoSensorMovimento;
	}
	public void setAtivacaoSensorMovimento(boolean ativacaoSensorMovimento) {
		this.ativacaoSensorMovimento = ativacaoSensorMovimento;
	}
	public boolean isAtivacaoSensorAcesso() {
		return ativacaoSensorAcesso;
	}
	public void setAtivacaoSensorAcesso(boolean ativacaoSensorAcesso) {
		this.ativacaoSensorAcesso = ativacaoSensorAcesso;
	}
	
}
