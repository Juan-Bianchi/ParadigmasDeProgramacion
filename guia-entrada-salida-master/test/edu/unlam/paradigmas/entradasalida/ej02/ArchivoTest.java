package edu.unlam.paradigmas.entradasalida.ej02;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;


public class ArchivoTest {

	@Test
	public void cantidadDentroDelRango() {
		//Arrange
		File file = new File("casos de prueba/ejercicio02/in/arrayEnteros.in");
		Scanner scanner = null;
		ArrayList<Integer> datos = new ArrayList<>();
		boolean esperado = true;
		//Act
		try {
			scanner = new Scanner(file);
			while(scanner.hasNext()) {
				datos.add(scanner.nextInt());
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		boolean obtenido = datos.size() >= 10_000 && datos.size() <= 20_0000;
		//Assert
		Assert.assertEquals(esperado, obtenido);
		//Annihilate
		scanner.close();
		datos = null;
	}
	
	
	@Test
	public void numerosDentroDelRango() {
		//Arrange
		File file = new File("casos de prueba/ejercicio02/in/arrayEnteros.in");
		Scanner scanner = null;
		ArrayList<Integer> datos = new ArrayList<>();
		boolean esperado = true;
		//Act
		try {
			scanner = new Scanner(file);
			while(scanner.hasNext()) {
				datos.add(scanner.nextInt());
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		boolean obtenido = datos.stream().allMatch(number -> number <= 12_000);
		//Assert
		Assert.assertEquals(esperado, obtenido);
		//Annihilate
		scanner.close();
		datos = null;
	}

}
