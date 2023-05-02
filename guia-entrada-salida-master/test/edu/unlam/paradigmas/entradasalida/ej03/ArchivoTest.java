package edu.unlam.paradigmas.entradasalida.ej03;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.Assert;
import org.junit.Test;


public class ArchivoTest {

	@Test
	public void casoRandom() {
		Resolucion resolucion = new Resolucion();
		resolucion.resolver("ejemploDado");

		// Es una solución que contempla comparar en cualquier ejercicio
		// Pero que es estricto a que sea exactamente igual
		try {
			byte[] f1 = Files.readAllBytes(Paths.get("casos de prueba/ejercicio03/out/ejemploDado.out"));
			byte[] f2 = Files.readAllBytes(Paths.get("casos de prueba/ejercicio03/out esperado/ejemploDado.out"));
			Assert.assertArrayEquals(f1, f2);
		} catch (IOException e) {
			Assert.fail();
			e.getStackTrace();
		}
	}
	
	@Test
	public void todosEmpatan() {
		Resolucion resolucion = new Resolucion();
		resolucion.resolver("todosEmpatan");

		// Es una solución que contempla comparar en cualquier ejercicio
		// Pero que es estricto a que sea exactamente igual
		try {
			byte[] f1 = Files.readAllBytes(Paths.get("casos de prueba/ejercicio03/out/todosEmpatan.out"));
			byte[] f2 = Files.readAllBytes(Paths.get("casos de prueba/ejercicio03/out esperado/todosEmpatan.out"));
			Assert.assertArrayEquals(f1, f2);
		} catch (IOException e) {
			Assert.fail();
			e.getStackTrace();
		}
	}
	
	@Test
	public void unoGana() {
		Resolucion resolucion = new Resolucion();
		resolucion.resolver("elMasFuerte");

		// Es una solución que contempla comparar en cualquier ejercicio
		// Pero que es estricto a que sea exactamente igual
		try {
			byte[] f1 = Files.readAllBytes(Paths.get("casos de prueba/ejercicio03/out/elMasFuerte.out"));
			byte[] f2 = Files.readAllBytes(Paths.get("casos de prueba/ejercicio03/out esperado/elMasFuerte.out"));
			Assert.assertArrayEquals(f1, f2);
		} catch (IOException e) {
			Assert.fail();
			e.getStackTrace();
		}
	}

}
