package unlam.paradigmas.objetos.ej05;

import org.junit.Assert;
import org.junit.Test;

public class TarjetaBajaTests {
	
	private final double tolerancia = 0.001;

	@Test(expected = valorNegativoException.class)
	public void construyeSaldoNegativo() {
		//Arrange //Act
		TarjetaBaja tarjeta = new TarjetaBaja(-1);
	}
	
	@Test
	public void construyeSaldo() {
		//Arrange
		double esperado = Math.random() * 900 + 0;
		//Act
		TarjetaBaja tarjeta = new TarjetaBaja(esperado);
		//Assert
		Assert.assertTrue(tarjeta.obtenerSaldo() >= 0);
	}
	
	@Test
	public void traeSaldoOk() {
		//Arrange
		double esperado = Math.random() * 900 + 0;
		//Act
		TarjetaBaja tarjeta = new TarjetaBaja(esperado);
		double obtenido = tarjeta.obtenerSaldo();
		//Assert
		Assert.assertEquals(esperado, obtenido, tolerancia);
	}
	
	@Test
	public void traeSaldoMal() {
		//Arrange
		double esperado = Math.random() * 900 + 0;
		//Act
		TarjetaBaja tarjeta = new TarjetaBaja(esperado);
		double obtenido = tarjeta.obtenerSaldo();
		//Assert
		Assert.assertNotEquals(esperado + 1, obtenido, tolerancia);
	}
	
	@Test
	public void cargaSaldoOk() {
		//Arrange
		double esperado = Math.random() * 900 + 0;
		//Act
		TarjetaBaja tarjeta = new TarjetaBaja(esperado);
		tarjeta.cargar(1000.0);
		esperado += 1000.0;
		double obtenido = tarjeta.obtenerSaldo();
		//Assert
		Assert.assertEquals(esperado, obtenido, tolerancia);
	}
	
	@Test(expected = valorNegativoException.class)
	public void cargaSaldoMal() {
		//Arrange
		double esperado = Math.random() * 900 + 0;
		//Act
		TarjetaBaja tarjeta = new TarjetaBaja(esperado);
		tarjeta.cargar(-1.0);
	}
	
	@Test
	public void pagaViajeColectivoOk() {
		//Arrange
		TarjetaBaja tarjeta = new TarjetaBaja(Math.random() * 900 + 0);
		double esperado = tarjeta.obtenerSaldo() - tarjeta.getViajeColectivo();
		//Act
		tarjeta.pagarViajeEnColectivo();
		double obtenido = tarjeta.obtenerSaldo();
		//Assert
		Assert.assertEquals(esperado, obtenido, tolerancia);
	}
	
	@Test(expected = SaldoInsuficienteException.class)
	public void noPagaViajeColectivoSaldoInsuficiente() {
		//Arrange
		TarjetaBaja tarjeta = new TarjetaBaja(10.0);
		//Act
		tarjeta.pagarViajeEnColectivo();
	}
	
	@Test
	public void pagaViajeSubteOk() {
		//Arrange
		TarjetaBaja tarjeta = new TarjetaBaja(Math.random() * 900 + 100);
		double esperado = tarjeta.obtenerSaldo() - tarjeta.getViajeSubte();
		//Act
		tarjeta.pagarViajeEnSubte();
		double obtenido = tarjeta.obtenerSaldo();
		//Assert
		Assert.assertEquals(esperado, obtenido, tolerancia);
	}
	
	@Test(expected = SaldoInsuficienteException.class)
	public void noPagaViajeSubteSaldoInsuficiente() {
		//Arrange
		TarjetaBaja tarjeta = new TarjetaBaja(10.0);
		//Act
		tarjeta.pagarViajeEnSubte();
	}
	
	@Test
	public void contarViajesColectivoOk() {
		//Arrange
		TarjetaBaja tarjeta = new TarjetaBaja(1000);
		int esperado = Math.round((float)Math.random() * 4 + 1);
		//Act
		for(int i = 0; i < esperado; i++) {
			tarjeta.pagarViajeEnColectivo();
		}
		int obtenido = tarjeta.contarViajesEnColectivo();
		//Assert
		Assert.assertEquals(esperado , obtenido);
	}
	
	@Test
	public void contarViajesSubteOk() {
		//Arrange
		TarjetaBaja tarjeta = new TarjetaBaja(1000);
		int esperado = Math.round((float)Math.random() * 4 + 1);
		//Act
		for(int i = 0; i < esperado; i++) {
			tarjeta.pagarViajeEnSubte();
		}
		int obtenido = tarjeta.contarViajesEnSubte();
		//Assert
		Assert.assertEquals(esperado , obtenido);
	}
	
	@Test
	public void contarViajesOk() {
		//Arrange
		TarjetaBaja tarjeta = new TarjetaBaja(1000);
		int esperado = Math.round((float)Math.random() * 4 + 1);
		//Act
		for(int i = 0; i < esperado; i++) {
			tarjeta.pagarViajeEnColectivo();
		}
		for(int i = 0; i < esperado; i++) {
			tarjeta.pagarViajeEnSubte();
		}
		esperado *= 2;
		int obtenido = tarjeta.contarViajes();
		//Assert
		Assert.assertEquals(esperado , obtenido);
	}
}
