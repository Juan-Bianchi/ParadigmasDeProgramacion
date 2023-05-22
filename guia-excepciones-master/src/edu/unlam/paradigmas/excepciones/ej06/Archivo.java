package edu.unlam.paradigmas.excepciones.ej06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Archivo {

	private String nombre;
	private Scanner file;
	
	public Archivo(String nombre) {
		this.nombre = nombre;
	}
	
	public Scanner getFile() {
		return file;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String leerArchivo() throws FileNotFoundException {
		Scanner scanner = new Scanner( new File("casos de prueba/" + this.nombre));
		StringBuilder mensaje = new StringBuilder();
		while(scanner.hasNext()) {
			mensaje.append(scanner.nextLine());
		}
		scanner.close();
		System.out.println("Archivo " + this.nombre + " cerrado");
		return mensaje.toString();
	}
}
