package br.com.exploracao.submarino;

public class ComandoSubir implements Comando {

	@Override
	public void moverObjeto(Submarino submarino) {
		submarino.setZ(submarino.getZ()+1);			
	}

}
