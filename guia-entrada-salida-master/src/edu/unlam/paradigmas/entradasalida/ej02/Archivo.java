package edu.unlam.paradigmas.entradasalida.ej02;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Archivo {

	private String nombre;
	
	public Archivo(String nombre) {
		this.nombre = nombre;	
		this.generarArchivoIn(this.nombre);
	}
	
	
	private void generarArchivoIn(String nombre){
		
		FileWriter writer = null;
		PrintWriter printWrinter = null;
		
		try {
			writer = new FileWriter("casos de prueba/ejercicio02/in/" + nombre + ".in");
			printWrinter = new PrintWriter(writer);
			int tam = new Random().nextInt(10_001) + 10_000; 
			
			for(int i = 0; i < tam; i++) {
				if(i == 9 || (i + 1) % 10 == 0) 
					printWrinter.print(String.format("%5d", new Random().nextInt(12_000)) + "\n");
				else
					printWrinter.print(String.format("%5d", new Random().nextInt(12_000)) + " ");
			}
		}
		catch(Exception e) {
			e.getStackTrace();
		}
		finally {
			if(writer != null) {
				try {
					writer.close();
				}
				catch(IOException e) {
					e.printStackTrace();
				}
				
			}
		}
	}
	
	
	public int[] leerArchivo() {
		
		Scanner scanner = null;
		int[] datos = new int[3];
		int promedio = 0;
		int min = 0;
		int max = 0;
		int suma = 0;
		int cantidad = 0;
		int numero;
		
		try {
			File file = new File("casos de prueba/ejercicio02/in/" + this.nombre + ".in");
			scanner = new Scanner(file);
			
			if(scanner.hasNext()) {
				numero = scanner.nextInt();
				min = max = numero;
				suma += numero;
				cantidad ++;
			}
			
			while(scanner.hasNext()) {
				numero = scanner.nextInt();
				
				if(numero > max)
					max = numero;
				if(numero < min)
					min = numero;
				
				suma += numero;
				cantidad ++;
			}
			
			promedio = suma / cantidad;
		}
		catch(Exception e) {
			e.getStackTrace();
		}
		
		scanner.close();
		datos[0] = max;
		datos[1] = min;
		datos[2] = promedio;
		
		return datos;
	}
	
	
	public void crearArchivoEstadisticas(int[] datos) {
		
		FileWriter file = null;
		PrintWriter pf = null;
		
		try {
			file = new FileWriter("casos de prueba/ejercicio02/out/" + nombre + ".out");
			pf = new PrintWriter(file);
			
			for(int i = 0; i < 7; i++) {
				if(i == 1) {
					pf.print("| Máximo   | " + String.format("%5d", datos[0]) + " |\n");
				}	
				else if(i == 3){
					pf.print("| Mínimo   | " + String.format("%5d", datos[1]) + " |\n");
				}
				else if(i == 5) {
					pf.print("| Promedio | " + String.format("%5d", datos[2]) + " |\n");
				}
				else {
					pf.print("+----------+-------+\n");		
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(file != null) {
				try {
					file.close();
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}


