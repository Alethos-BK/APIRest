package br.com.namenotfound.api.model;

public enum EstadoCivil {
	
	SOLTEIRO("Solteiro(a)"), CASADO("Casado(a)"), DIVORCIADO("Divorciado(a)");
	
	
	private String valor;
	
	private EstadoCivil(String valor){
		this.valor = valor;
	}
	
	public String getValor(){
		return valor;
	}

}
