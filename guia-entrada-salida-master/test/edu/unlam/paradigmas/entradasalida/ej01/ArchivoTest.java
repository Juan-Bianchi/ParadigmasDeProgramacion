package edu.unlam.paradigmas.entradasalida.ej01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.Assert;
import org.junit.Test;

public class ArchivoTest {

	@Test
	public void algunosRepetidos() {
		Resolucion resolucion = new Resolucion();
		resolucion.resolver("algunosRepetidos");

		// Es una solución que contempla comparar en cualquier ejercicio
		// Pero que es estricto a que sea exactamente igual
		try {
			byte[] f1 = Files.readAllBytes(Paths.get("casos de prueba/ejercicio01/out/algunosRepetidos.out"));
			byte[] f2 = Files.readAllBytes(Paths.get("casos de prueba/ejercicio01/out esperado/algunosRepetidos.out"));
			Assert.assertArrayEquals(f1, f2);
		} catch (IOException e) {
			Assert.fail();
			e.getStackTrace();
		}
	}
	
	@Test
	public void sinRepetidos() {
		Resolucion resolucion = new Resolucion();
		resolucion.resolver("algunosRepetidos");

		// Es una solución que contempla comparar en cualquier ejercicio
		// Pero que es estricto a que sea exactamente igual
		try {
			byte[] f1 = Files.readAllBytes(Paths.get("casos de prueba/ejercicio01/out/sinRepetidos.out"));
			byte[] f2 = Files.readAllBytes(Paths.get("casos de prueba/ejercicio01/out esperado/sinRepetidos.out"));
			Assert.assertArrayEquals(f1, f2);
		} catch (IOException e) {
			Assert.fail();
			e.getStackTrace();
		}
	}
	
	@Test
	public void todosRepetidos() {
		Resolucion resolucion = new Resolucion();
		resolucion.resolver("todosRepetidos");

		// Es una solución que contempla comparar en cualquier ejercicio
		// Pero que es estricto a que sea exactamente igual
		try {
			byte[] f1 = Files.readAllBytes(Paths.get("casos de prueba/ejercicio01/out/todosRepetidos.out"));
			byte[] f2 = Files.readAllBytes(Paths.get("casos de prueba/ejercicio01/out esperado/todosRepetidos.out"));
			Assert.assertArrayEquals(f1, f2);
		} catch (IOException e) {
			Assert.fail();
			e.getStackTrace();
		}
	}
	
	@Test
	public void sinNumeros() {
		Resolucion resolucion = new Resolucion();
		resolucion.resolver("sinNumeros");

		// Es una solución que contempla comparar en cualquier ejercicio
		// Pero que es estricto a que sea exactamente igual
		try {
			byte[] f1 = Files.readAllBytes(Paths.get("casos de prueba/ejercicio01/out/sinNumeros.out"));
			byte[] f2 = Files.readAllBytes(Paths.get("casos de prueba/ejercicio01/out esperado/sinNumeros.out"));
			Assert.assertArrayEquals(f1, f2);
		} catch (IOException e) {
			Assert.fail();
			e.getStackTrace();
		}
	}
}
