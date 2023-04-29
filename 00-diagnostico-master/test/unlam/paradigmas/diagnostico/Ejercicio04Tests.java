package unlam.paradigmas.diagnostico;

import org.junit.Assert;
import org.junit.Test;

public class Ejercicio04Tests {

	@Test
	public void esMatrizVacia() {
		int[][] entrada = { };
		int[] esperado = {};
		
		int[] resultado = Ejercicio04.resolver(entrada);
		
		Assert.assertArrayEquals(esperado, resultado);		
	}
	
	@Test
	public void modaFilaMatriz() {
		int[][] entrada = { { 1, 2, 3, 4 }, { 5, -6, -6, 20 }, { 1, 1, 10, 10 } };
		int[] esperado = {4, -6, 10};
		
		int[] resultado = Ejercicio04.resolver(entrada);
		
		Assert.assertArrayEquals(esperado, resultado);		
	}

}
