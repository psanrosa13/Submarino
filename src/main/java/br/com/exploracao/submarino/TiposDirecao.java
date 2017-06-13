package br.com.exploracao.submarino;

public enum TiposDirecao {

	NORTE("NORTE"),
	SUL("SUL"),
	LESTE("LESTE"),
	OESTE("OESTE");
	 
	private String tipoDirecao;
	
	TiposDirecao(String tipoDirecao){
		this.tipoDirecao = tipoDirecao;
	}
	
	public String getTipoDirecao(){
		return tipoDirecao;
	}
}
