package br.com.exploracao.submarino;

public class ComandoEsquerda implements Comando{

	@Override
	public void moverObjeto(Submarino submarino) {
		switch (submarino.getDirecao()) {
		case NORTE:
			submarino.setDirecao(TiposDirecao.OESTE);
			break;
		case SUL:
			submarino.setDirecao(TiposDirecao.LESTE);
			break;
		case LESTE:
			submarino.setDirecao(TiposDirecao.NORTE);
			break;
		case OESTE:
			submarino.setDirecao(TiposDirecao.SUL);
			break;
		default:
			break;
		}		
	}

}
