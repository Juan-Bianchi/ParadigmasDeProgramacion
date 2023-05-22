package edu.unlam.paradigmas.excepciones.ej06;

import java.io.FileNotFoundException;

public class AperturaDeArchivos {

	public static void main(String[] args) {
		
		try {
			Archivo archivoTres = new Archivo("noExiste.in");
			Archivo archivoUno = new Archivo("archivoUno.in");
			Archivo archivoDos;
			String rutaArchDos = archivoUno.leerArchivo();
			archivoDos = new Archivo("noExiste.in");
			try {
				String contenido = archivoDos.leerArchivo();
				System.out.println(contenido);
			}
			catch(FileNotFoundException e) {
				System.out.println("Error al abrir segundo archivo");
				e.printStackTrace();
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("Error al abrir primer archivo");
			e.printStackTrace();
		}
	}

}
