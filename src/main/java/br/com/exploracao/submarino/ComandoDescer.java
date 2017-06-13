package br.com.exploracao.submarino;

public class ComandoDescer implements Comando{

	@Override
	public void moverObjeto(Submarino submarino) {
		submarino.setZ(submarino.getZ()-1);		
	}

}
