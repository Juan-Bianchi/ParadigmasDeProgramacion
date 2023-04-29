package unlam.paradigmas.diagnostico;

import org.junit.Assert;
import org.junit.Test;



public class Ejercicio02Tests {

	@Test
	public void matrizSinCeros() {
		int[][] m = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		boolean esperado = false;
		
		boolean respuesta = Ejercicio02.resolver(m);
		
		Assert.assertEquals(esperado, respuesta);
	}
	
	@Test
	public void matrizConCeros() {
		int[][] m = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 0, 9 } };
		boolean esperado = true;
		
		boolean respuesta = Ejercicio02.resolver(m);
		
		Assert.assertEquals(esperado, respuesta);
	}

}
