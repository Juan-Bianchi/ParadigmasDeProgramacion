package unlam.paradigmas.diagnostico;

import org.junit.Assert;
import org.junit.Test;

public class Ejercicio05Tests {

	@Test
	public void esMatrizVacia() {
		int[][] entrada = { };
		int[][] esperado = { };
		
		int[][] resultado = Ejercicio05.resolver(entrada);
		
		Assert.assertArrayEquals(esperado, resultado);		
	}
	
	
	@Test
	public void creaMatrizDiagonales() {
		int[][] entrada = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int[][] esperado = { { 13 }, { 9, 14 }, { 5, 10, 15 }, { 1, 6, 11, 16 }, { 2, 7, 12 }, { 3, 8 }, { 4 } };
		
		int[][] resultado = Ejercicio05.resolver(entrada);
		
		Assert.assertArrayEquals(esperado, resultado);		
	}
	
	@Test
	public void creaMatriz2NMenos1() {
		int[][] entrada = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int esperado = 7;
		
		int resultado = Ejercicio05.resolver(entrada).length;
		
		Assert.assertEquals(esperado, resultado);		
	}

}
