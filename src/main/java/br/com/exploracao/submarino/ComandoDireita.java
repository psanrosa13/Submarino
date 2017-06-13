package br.com.exploracao.submarino;

public class ComandoDireita implements Comando{

	@Override
	public void moverObjeto(Submarino submarino) {
		switch (submarino.getDirecao()) {
		case NORTE:
			submarino.setDirecao(TiposDirecao.LESTE);
			break;
		case SUL:
			submarino.setDirecao(TiposDirecao.OESTE);
			break;
		case LESTE:
			submarino.setDirecao(TiposDirecao.SUL);
			break;
		case OESTE:
			submarino.setDirecao(TiposDirecao.NORTE);
			break;
		default:
			break;
		}
	}

}
