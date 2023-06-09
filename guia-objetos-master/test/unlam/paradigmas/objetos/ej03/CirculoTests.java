package unlam.paradigmas.objetos.ej03;


import org.junit.Assert;
import org.junit.Test;

public class CirculoTests {
	
	private final double tolerancia = 0.0001;
	
	@Test(expected = RadioException.class)
	public void radioNegativo() {
		//Arrange
		Circulo circulo = new Circulo(-0.1);
		
	}
	
	@Test
	public void construyeRadioOk() {
		//Arrange
		double esperado = Math.random() * 9 + 1;
		Circulo circulo = new Circulo(esperado);
		//Act
		double obtenido = circulo.getRadio();
		//Assert
		Assert.assertTrue(obtenido >= 0);
		//Annihilate
	}
	
	@Test
	public void porDefectoRadioOk() {
		//Arrange
		Circulo circulo = new Circulo();
		//Act
		double obtenido = circulo.getRadio();
		//Assert
		Assert.assertTrue(obtenido == 0);
		//Annihilate
	}
	
	@Test
	public void seteaRadioOk() {
		//Arrange
		double esperado = Math.random() * 9 + 1;
		Circulo circulo = new Circulo(esperado);
		//Act
		double obtenido = circulo.getRadio();
		//Assert
		Assert.assertTrue(obtenido >= 0);
		//Annihilate
	}
	
	@Test(expected = RadioException.class)
	public void seteaRadioNegativo() {
		//Arrange
		Circulo circulo = new Circulo();
		//Act
		circulo.setRadio(-0.1);
		
	}

	@Test
	public void obtieneRadioOk() {
		//Arrange
		double esperado = Math.random() * 9 + 1;
		Circulo circulo = new Circulo(esperado);
		//Act
		double obtenido = circulo.getRadio();
		//Assert
		Assert.assertEquals(esperado, obtenido, tolerancia);
		//Annihilate
	}
	
	@Test
	public void obtieneRadioMal() {
		//Arrange
		double esperado = Math.random() * 9 + 1;
		Circulo circulo = new Circulo(1);
		//Act
		double obtenido = circulo.getRadio();
		//Assert
		Assert.assertNotEquals(esperado, obtenido, tolerancia);
		//Annihilate
	}
	
	
	@Test(expected = AreaException.class)
	public void areaNegativa() {
		//Arrange
		Circulo circulo = new Circulo(1);
		circulo.setArea(-1);
		
	}
	
	@Test
	public void seteaAreaOk() {
		//Arrange
		double esperado = (Math.random() * 9 + 1) ;
		Circulo circulo = new Circulo(1);
		circulo.setArea(esperado);
		//Act
		double obtenido = circulo.getArea();
		//Assert
		Assert.assertTrue(obtenido >= 0);
		//Annihilate
	}

	@Test
	public void obtieneAreaOk() {
		//Arrange
		double esperado = (Math.random() * 9 + 1) ;
		Circulo circulo = new Circulo(1);
		circulo.setArea(esperado);
		//Act
		double obtenido = circulo.getArea();
		//Assert
		Assert.assertEquals(esperado, obtenido, tolerancia);
		//Annihilate
	}
	
	@Test
	public void obtieneAreaMal() {
		//Arrange
		double esperado = Math.random() * 9 + 1;
		Circulo circulo = new Circulo(esperado + 1);
		//Act
		double obtenido = circulo.getArea();
		//Assert
		Assert.assertNotEquals(esperado, obtenido, tolerancia);
		//Annihilate
	}

	@Test(expected = DiametroException.class)
	public void DiametroNegativo() {
		//Arrange
		Circulo circulo = new Circulo(1);
		circulo.setDiametro(-1);
		
	}
	
	@Test
	public void seteaDiametroOk() {
		//Arrange
		double esperado = (Math.random() * 9 + 1) ;
		Circulo circulo = new Circulo(1);
		circulo.setDiametro(esperado);
		//Act
		double obtenido = circulo.getDiametro();
		//Assert
		Assert.assertTrue(obtenido >= 0);
		//Annihilate
	}

	@Test
	public void obtieneDiametroOk() {
		//Arrange
		double esperado = (Math.random() * 9 + 1) ;
		Circulo circulo = new Circulo(1);
		circulo.setDiametro(esperado);
		//Act
		double obtenido = circulo.getDiametro();
		//Assert
		Assert.assertEquals(esperado, obtenido, tolerancia);
		//Annihilate
	}
	
	@Test
	public void obtieneDiametroMal() {
		//Arrange
		double esperado = Math.random() * 9 + 1;
		Circulo circulo = new Circulo(1);
		circulo.setDiametro(esperado + 1);
		//Act
		double obtenido = circulo.getDiametro();
		//Assert
		Assert.assertNotEquals(esperado, obtenido, tolerancia);
		//Annihilate
	}
	
	@Test(expected = PerimetroException.class)
	public void PerimetroNegativo() {
		//Arrange
		Circulo circulo = new Circulo();
		circulo.setPerimetro(-1);
		
	}
	
	@Test
	public void seteaPerimetroOk() {
		//Arrange
		double esperado = (Math.random() * 9 + 1) ;
		Circulo circulo = new Circulo();
		circulo.setPerimetro(esperado);
		//Act
		double obtenido = circulo.getPerimetro();
		//Assert
		Assert.assertTrue(obtenido >= 0);
		//Annihilate
	}

	@Test
	public void obtienePerimetroOk() {
		//Arrange
		double esperado = (Math.random() * 9 + 1) ;
		Circulo circulo = new Circulo(1);
		circulo.setPerimetro(esperado);
		//Act
		double obtenido = circulo.getPerimetro();
		//Assert
		Assert.assertEquals(esperado, obtenido, tolerancia);
		//Annihilate
	}
	
	@Test
	public void obtienePerimetroMal() {
		//Arrange
		double esperado = Math.random() * 9 + 1;
		Circulo circulo = new Circulo(1);
		circulo.setPerimetro(esperado + 1);
		//Act
		double obtenido = circulo.getPerimetro();
		//Assert
		Assert.assertNotEquals(esperado, obtenido, tolerancia);
		//Annihilate
	}

	
}
