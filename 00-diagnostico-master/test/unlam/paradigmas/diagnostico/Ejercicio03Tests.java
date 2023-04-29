package unlam.paradigmas.diagnostico;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;


public class Ejercicio03Tests {

	@Test
	public void matrizVacia() {
		
		int[][] m = {};
		
		int[][] respuesta = Ejercicio03.resolver(m);
		
		Assert.assertTrue(Arrays.deepEquals(m, respuesta));
		
	}
	
	
	@Test
	public void matrizRegularEsSumaAdyacentes() {
		
		int[][] m = { { 8, 2, -3, 4 }, { 5, -6, -6, 20 }, { 21, 1, -5, 0 } };
		int[][] esperado = { { 15, 1, -3, 21 }, { 28, -4, 0, 18 }, { 27, 11, -10, 15 } };
		
		int[][] respuesta = Ejercicio03.resolver(m);
		
		Assert.assertTrue(Arrays.deepEquals(esperado, respuesta));
		
	}
	
	@Test
	public void matrizNoSumaAdyacentes() {
		
		int[][] m = { { 8, 2, -3, 4 }, { 5, -6, -6, 20 }, { 21, 1, -5, 0 } };
		int[][] respuestaErronea = { { 15, 1, -3, 21 }, { 28, -4, 0, 18 }, { 27, 11, -10, 1 } };
		
		int[][] respuesta = Ejercicio03.resolver(m);
		
		Assert.assertFalse(Arrays.deepEquals(respuestaErronea, respuesta));
		
	}
	
	@Test
	public void matrizIrregularEsSumaAdyacentes() {
		
		int[][] m = { { 8, 2, -3 }, { 5, -6, -6, 20 }, { 21, 1 } };
		int[][] esperado = { { 15, 1, -7 }, { 28, -4, 5, 14 }, { 27, 16 } };
		
		int[][] respuesta = Ejercicio03.resolver(m);
		
		Assert.assertTrue(Arrays.deepEquals(esperado, respuesta));
		
	}

}
