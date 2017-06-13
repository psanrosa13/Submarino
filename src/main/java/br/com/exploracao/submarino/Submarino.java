package br.com.exploracao.submarino;

public class Submarino {

	private int x;
	private int y;
	private int z;
	private TiposDirecao direcao;
	
	public Submarino(){
		this.x= 0;
		this.y= 0;
		this.z= 0;
		this.direcao = TiposDirecao.NORTE;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setZ(int z) {
		this.z = z;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getZ() {
		return z;
	}

	public TiposDirecao getDirecao() {
		return direcao;
	}

	public void setDirecao(TiposDirecao direcao) {
		this.direcao = direcao;
	}

	public String getCoordenadaFinal(){
		return this.x + " " + this.y + " " + this.z + " " + this.direcao.getTipoDirecao();
	}
}
