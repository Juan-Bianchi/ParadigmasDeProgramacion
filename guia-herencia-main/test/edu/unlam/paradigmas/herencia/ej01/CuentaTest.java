package edu.unlam.paradigmas.herencia.ej01;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaTest {

	@Test
	public void test() {
		Cuenta miCuenta = new Cuenta();
		assertEquals(0, miCuenta.getSaldo(), 0.0);
		assertTrue(miCuenta.depositar(10_000));

		Cuenta otraCuenta = new Cuenta();
		assertEquals(0, otraCuenta.getSaldo(), 0.0);

		assertTrue(miCuenta.transferir(otraCuenta, 550));
		assertEquals(9_450, miCuenta.getSaldo(), 0.0);
		assertEquals(550, otraCuenta.getSaldo(), 0.0);
	}

}
