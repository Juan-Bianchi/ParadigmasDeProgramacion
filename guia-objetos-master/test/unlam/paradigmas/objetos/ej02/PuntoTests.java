package unlam.paradigmas.objetos.ej02;

import org.junit.Assert;
import org.junit.Test;

public class PuntoTests {

	@Test
	public void creaPuntoOk() {
		double x = 10.0;
		double y = 10.1;
		Punto circulo = new Punto(x, y);
		
		Assert.assertTrue(((Object)circulo.getX()).getClass().getName() == (((Object)x).getClass().getName()) && ((Object)circulo.getY()).getClass().getName() == (((Object)y).getClass().getName()));
	}
	
	
	@Test
	public void estaSobreEjeXOk() {
		boolean esperado = true;
		Punto punto = new Punto(0, 6);
		boolean obtenido = punto.estaSobreEjeX();
		
		Assert.assertEquals(esperado, obtenido);
	}

	@Test
	public void noEstaSobreEjeX() {
		boolean esperado = false;
		Punto punto = new Punto(0.001, 6);
		boolean obtenido = punto.estaSobreEjeX();
		
		Assert.assertEquals(esperado, obtenido);
	}
	
	@Test
	public void estaSobreEjeYOk() {
		boolean esperado = true;
		Punto punto = new Punto(0.01, 0);
		boolean obtenido = punto.estaSobreEjeY();
		
		Assert.assertEquals(esperado, obtenido);
	}

	@Test
	public void noEstaSobreEjeY() {
		boolean esperado = false;
		Punto punto = new Punto(0.001, 1);
		boolean obtenido = punto.estaSobreEjeY();
		
		Assert.assertEquals(esperado, obtenido);
	}
	
	@Test
	public void estaSobreOrigenOk() {
		boolean esperado = true;
		Punto punto = new Punto(0, 0);
		boolean obtenido = punto.esElOrigen();
		
		Assert.assertEquals(esperado, obtenido);
	}

	@Test
	public void noEstaSobreOrigen() {
		boolean esperado = false;
		Punto punto = new Punto(0.001, 0.000001);
		boolean obtenido = punto.esElOrigen();
		
		Assert.assertEquals(esperado, obtenido);
	}
	
	@Test
	public void distanciaAlOrigenOk() {
		double esperado = 5.0;
		Punto punto = new Punto(3, 4);
		double obtenido = punto.distanciaAlOrigen();
		
		Assert.assertEquals(esperado, obtenido, 0.0001);
	}
	
	@Test
	public void distanciaAlOrigenMal() {
		double esperado = 6;
		Punto punto = new Punto(9, 4);
		double obtenido = punto.distanciaAlOrigen();
		
		Assert.assertNotEquals(esperado, obtenido, 0.0001);
	}
	
	
	@Test
	public void distanciaAOtroOk() {
		double esperado = 5.0;
		Punto punto = new Punto(6, 7);
		Punto punto1 = new Punto(3, 3);
		
		double obtenido = punto.distanciaAotroPunto(punto1);
		
		Assert.assertEquals(esperado, obtenido, 0.0001);
	}
	
	@Test
	public void distanciaAOtroMal() {
		double esperado = 5.3;
		Punto punto = new Punto(6, 7);
		Punto punto1 = new Punto(3, 3);
		
		double obtenido = punto.distanciaAotroPunto(punto1);
		
		Assert.assertNotEquals(esperado, obtenido, 0.0001);
	}
	
	
}
