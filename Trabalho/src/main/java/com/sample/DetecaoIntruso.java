package com.sample;

public class DetecaoIntruso {
    private boolean ativacaoSensorMovimento;
    private boolean ativacaoSensorAcesso;
    private TipoIntruso tipoIntruso;
    
    public DetecaoIntruso(boolean ativacaoSensorMovimento, boolean ativacaoSensorAcesso, TipoIntruso tipoIntruso) {
        this.ativacaoSensorMovimento = ativacaoSensorMovimento;
        this.ativacaoSensorAcesso = ativacaoSensorAcesso;
        this.tipoIntruso = tipoIntruso;
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
	public TipoIntruso getTipoIntruso() {
		return tipoIntruso;
	}
	public void setTipoIntruso(TipoIntruso tipoIntruso) {
		this.tipoIntruso = tipoIntruso;
	}
	
}
