package br.com.exploracao.submarino;

import java.util.HashMap;
import java.util.Map;

public class Movimenta {

	public String executarCoordenadas(String coordenadas) throws SubmarinoAcimaDaSuperficieException{
		
		Map<String, Comando> comandos = new HashMap<String, Comando>();
		comandos.put("M", new ComandoMover());
		comandos.put("L", new ComandoEsquerda());
		comandos.put("R", new ComandoDireita());
		comandos.put("U", new ComandoSubir());
		comandos.put("D", new ComandoDescer());
		
		Submarino submarino = new Submarino();
		
		String[] coordenadasSeparadas = coordenadas.split("");
		for (String coordenada : coordenadasSeparadas) {
			comandos.get(coordenada).moverObjeto(submarino);
			
			if(submarino.getZ() > 0)
				throw new SubmarinoAcimaDaSuperficieException("Submarino não tem recursos áreos!");
		}
		
		return submarino.getCoordenadaFinal();
	}

}
