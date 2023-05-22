package edu.unlam.paradigmas.excepciones.ej07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Archivo implements AutoCloseable{

	private String nombre;
	
	public Archivo(String nombre) {
		this.nombre = nombre;
	}
	
	public String leerArchivo() throws FileNotFoundException {
		File file = new File("casos de prueba/" + this.nombre);
		Scanner scanner = new Scanner(file);
		StringBuilder mensaje = new StringBuilder();
		while(scanner.hasNext()) {
			mensaje.append(scanner.nextLine());
		}
		scanner.close();
		return mensaje.toString();
	}

	@Override
	public void close() throws Exception {
		System.out.println("archivo " + this.nombre + " cerrado");
		
	}
}
