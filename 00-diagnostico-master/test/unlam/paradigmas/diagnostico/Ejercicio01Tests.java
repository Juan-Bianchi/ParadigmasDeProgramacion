package unlam.paradigmas.diagnostico;

import org.junit.Assert;
import org.junit.Test;

public class Ejercicio01Tests {
	
	@Test
	public void sumatoriaDiagonalPrincipalMatrizCuadradaOK() {
		// Arrange
		int[][] mat = {{ 1, 2, 3 }, { 4, 1, 6 }, { 7, 8, 2 }};
		boolean esperado = true;
		
		// Act
		boolean obtenido = Ejercicio01.resolver(mat);
		
		// Assert - Comprobar - Verificar
		Assert.assertEquals(esperado, obtenido);
		
		// Annihilate
		// mat = null
		
	}
	
	
	@Test
	public void sumatoriaDiagonalPrincipalMatrizCuadradaFalla() {
		
		int[][] mat = {{ 1, 2, 3 }, { 4, 2, 6 }, { 7, 8, 2 }};
		boolean esperado = false;
		
		boolean obtenido = Ejercicio01.resolver(mat);
		
		Assert.assertEquals(esperado, obtenido);
	}
	
	
	@Test
	public void matrizVacia() {
		
		int[][] m = {};
		boolean esperado = true;
		
		boolean obtenido = Ejercicio01.resolver(m);
		
		Assert.assertEquals(esperado, obtenido);
		
		
	}

}
