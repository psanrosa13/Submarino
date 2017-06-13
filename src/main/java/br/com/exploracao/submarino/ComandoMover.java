package br.com.exploracao.submarino;

public class ComandoMover implements Comando {

	@Override
	public void moverObjeto(Submarino submarino) {
		switch (submarino.getDirecao()) {
		case NORTE:
			submarino.setY(submarino.getY()+1);
			break;
		case SUL:
			submarino.setY(submarino.getY()-1);
			break;
		case LESTE:
			submarino.setX(submarino.getX()+1);
			break;
		case OESTE:
			submarino.setX(submarino.getX()-1);
			break;
		default:
			break;
		}
	}

}
