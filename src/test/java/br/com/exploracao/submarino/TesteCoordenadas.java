package br.com.exploracao.submarino;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TesteCoordenadas {

	@Rule
	public ExpectedException excecaoEsperada = ExpectedException.none();
	
	@Test
	public void testeMoverAoLeste() throws SubmarinoAcimaDaSuperficieException{
		Movimenta movimenta = new Movimenta();
		String resultado = movimenta.executarCoordenadas("RMM");
		assertEquals("2 0 0 LESTE", resultado);
	}
	
	@Test
	public void testeMoverAoSuLEDescer() throws SubmarinoAcimaDaSuperficieException{
		Movimenta movimenta = new Movimenta();
		String resultado = movimenta.executarCoordenadas("LLMDD");
		assertEquals("0 -1 -2 SUL", resultado);
	}
	
	@Test
	public void testeCasoExemploUm() throws SubmarinoAcimaDaSuperficieException{
		Movimenta movimenta = new Movimenta();
		String resultado = movimenta.executarCoordenadas("LMRDDMMUU");
		assertEquals("-1 2 0 NORTE", resultado);
	}
	
	@Test
	public void testeCasoExemploDois() throws SubmarinoAcimaDaSuperficieException{
		Movimenta movimenta = new Movimenta();
		String resultado = movimenta.executarCoordenadas("RMMLMMMDDLL");
		assertEquals("2 3 -2 SUL", resultado);
	}
	
	@Test
	public void testeExcecao() throws SubmarinoAcimaDaSuperficieException{
		excecaoEsperada.expect(SubmarinoAcimaDaSuperficieException.class);
		Movimenta movimenta = new Movimenta();
		movimenta.executarCoordenadas("UURLL");
	}
}
