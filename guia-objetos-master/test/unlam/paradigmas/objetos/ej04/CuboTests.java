package unlam.paradigmas.objetos.ej04;

import org.junit.Assert;
import org.junit.Test;



public class CuboTests {
	
	private final double tolerancia = 0.0001;

	@Test(expected = LadoException.class)
	public void construyeLadoNegativo() {
		//Arrange
		Cubo cubo = new Cubo(-1);
	}
	
	@Test
	public void construyeLadoOk() {
		//Arrange
		double esperado = Math.random() * 9 + 1;
		Cubo cubo = new Cubo(esperado);
		//Act
		double obtenido = cubo.obtenerLado();
		//Assert
		Assert.assertEquals(esperado, obtenido, tolerancia);
	}
	
	@Test(expected = LadoException.class)
	public void seteaLadoNegativo() {
		//Arrange
		Cubo cubo = new Cubo(-1);
	}
	
	@Test
	public void seteaLadoOk() {
		//Arrange
		Cubo cubo = new Cubo(1);
		cubo.cambiarLado(Math.random() * 9 + 1);
		//Act
		double obtenido = cubo.obtenerLado();
		//Assert
		Assert.assertTrue(obtenido >= 0);
	}
	
	@Test
	public void obtieneLadoOk() {
		//Arrange
		double esperado = Math.random() * 9 + 1;
		Cubo cubo = new Cubo(esperado);
		//Act
		double obtenido = cubo.obtenerLado();
		//Assert
		Assert.assertEquals(esperado, obtenido, tolerancia);
	}
	
	@Test
	public void obtieneLadoMal() {
		//Arrange
		double esperado = Math.random() * 9 + 1;
		//Act
		Cubo cubo = new Cubo(1);
		double obtenido = cubo.obtenerLado();
		//Assert
		Assert.assertNotEquals(esperado, obtenido, tolerancia);
	}
	
	@Test(expected = AreaException.class)
	public void seteaAreaNegativa() {
		//Arrange
		Cubo cubo = new Cubo(1);
		//Act
		cubo.cambiarAreaCara(-1);
	}
	
	@Test
	public void seteaAreaOk() {
		//Arrange
		Cubo cubo = new Cubo(1);
		//Act
		cubo.cambiarAreaCara(Math.random() * 9 + 1);
		double obtenido = cubo.obtenerAreaCara();
		//Assert
		Assert.assertTrue(obtenido >= 0);
	}
	
	@Test
	public void obtieneAreaOk() {
		//Arrange
		double esperado = Math.random() * 9 + 1;
		Cubo cubo = new Cubo(1);
		//Act
		cubo.cambiarAreaCara(esperado);
		double obtenido = cubo.obtenerAreaCara();
		//Assert
		Assert.assertEquals(esperado, obtenido, tolerancia);
	}
	
	@Test
	public void obtieneAreaMal() {
		//Arrange
		double esperado = Math.random() * 9 + 1;
		//Act
		Cubo cubo = new Cubo(1);
		cubo.cambiarAreaCara(1);
		double obtenido = cubo.obtenerAreaCara();
		//Assert
		Assert.assertNotEquals(esperado, obtenido, tolerancia);
	}
	
	
	@Test(expected = VolumenException.class)
	public void seteaVolumenNegativo() {
		//Arrange
		Cubo cubo = new Cubo(1);
		//Act
		cubo.cambiarVolumen(-1);
	}
	
	@Test
	public void seteaVolumenOk() {
		//Arrange
		Cubo cubo = new Cubo(1);
		//Act
		cubo.cambiarVolumen(Math.random() * 9 + 1);
		double obtenido = cubo.obtenerVolumen();
		//Assert
		Assert.assertTrue(obtenido >= 0);
	}
	
	@Test
	public void obtieneVolumenOk() {
		//Arrange
		double esperado = Math.random() * 9 + 1;
		Cubo cubo = new Cubo(1);
		//Act
		cubo.cambiarVolumen(esperado);
		double obtenido = cubo.obtenerVolumen();
		//Assert
		Assert.assertEquals(esperado, obtenido, tolerancia);
	}
	
	@Test
	public void obtieneVolumenMal() {
		//Arrange
		double esperado = Math.random() * 9 + 1;
		//Act
		Cubo cubo = new Cubo(1);
		cubo.cambiarVolumen(1);
		double obtenido = cubo.obtenerVolumen();
		//Assert
		Assert.assertNotEquals(esperado, obtenido, tolerancia);
	}
	
	

}
