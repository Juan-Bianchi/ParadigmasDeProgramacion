package unlam.paradigmas.objetos.ej06;

import org.junit.Assert;
import org.junit.Test;


public class CerraduraTests {

	@Test(expected = ValorNegativoException.class)
	public void construyeClaveNegativa() {
		//Arrange //Act
		Cerradura cerradura = new Cerradura(-1, 3);
	}
	
	@Test(expected = ValorNegativoException.class)
	public void construyeCantFallosNegativa() {
		//Arrange //Act
		Cerradura cerradura = new Cerradura(1, -3);
	}
	
	@Test(expected = ValorNegativoException.class)
	public void abreClaveNegativa() {
		//Arrange 
		Cerradura cerradura = new Cerradura(1, 3);
		//Act
		cerradura.abrir(-1);
	}
	
	@Test 
	public void abreOk() {
		//Arrange 
		boolean esperado = true; 
		Cerradura cerradura = new Cerradura(6, 3);
		//Act
		boolean obtenido = cerradura.abrir(6);
		//Assert
		Assert.assertEquals(esperado, obtenido);
	}
	
	@Test
	public void noAbreOk() {
		//Arrange 
		boolean esperado = false; 
		Cerradura cerradura = new Cerradura(6, 3);
		//Act
		boolean obtenido = cerradura.abrir(5);
		//Assert
		Assert.assertEquals(esperado, obtenido);
		//Annihilate
		cerradura = null;
	}
	
	@Test 
	public void sumaFallidas() {
		//Arrange 
		int esperado = 2; 
		Cerradura cerradura = new Cerradura(6, 3);
		//Act
		cerradura.abrir(3);
		cerradura.abrir(5);
		int obtenido = cerradura.contarAperturasFallidas();
		//Assert
		Assert.assertEquals(esperado, obtenido);
		//Annihilate
		cerradura = null;
	}
	
	@Test 
	public void resetaFallidas() {
		//Arrange 
		int esperado = 0; 
		Cerradura cerradura = new Cerradura(6, 3);
		//Act
		cerradura.abrir(3);
		cerradura.abrir(5);
		cerradura.abrir(6);
		int obtenido = cerradura.contarAperturasFallidas();
		//Assert
		Assert.assertEquals(esperado, obtenido);
		//Annihilate
		cerradura = null;
	}
	
	@Test 
	public void sumaCorrectas() {
		//Arrange 
		int esperado = 10; 
		Cerradura cerradura = new Cerradura(6, 3);
		//Act
		for(int i = 0; i < 10; i++) {
			cerradura.abrir(6);
		}
		int obtenido = cerradura.contarAperturasExitosas();
		//Assert
		Assert.assertEquals(esperado, obtenido);
		//Annihilate
		cerradura = null;
	}
	
	@Test
	public void cierraCerraduraOK() {
		//Arrange
		Cerradura cerradura = new Cerradura(6, 3);
		boolean esperado = true;
		//Act
		cerradura.cerrar();
		boolean obtenido = cerradura.estaCerrada();
		//Assert
		Assert.assertEquals(esperado, obtenido);
		//Annihilate
		cerradura = null;
	}
	
	@Test
	public void compruebaAbierta() {
		//Arrange
		Cerradura cerradura = new Cerradura(6, 3);
		boolean esperado = true;
		//Act
		cerradura.abrir(6);
		boolean obtenido = cerradura.estaAbierta();
		//Assert
		Assert.assertEquals(esperado, obtenido);
		//Annihilate
		cerradura = null;
	}
	
	@Test 
	public void compruebaBloqueo() {
		//Arrange 
		boolean esperado = true; 
		Cerradura cerradura = new Cerradura(6, 3);
		//Act
		cerradura.abrir(3);
		cerradura.abrir(5);
		cerradura.abrir(5);
		boolean obtenido = cerradura.fueBloqueada();
		//Assert
		Assert.assertEquals(esperado, obtenido);
		//Annihilate
		cerradura = null;
	}

}
