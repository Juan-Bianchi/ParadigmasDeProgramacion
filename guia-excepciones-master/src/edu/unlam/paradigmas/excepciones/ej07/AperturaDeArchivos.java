package edu.unlam.paradigmas.excepciones.ej07;

import java.io.FileNotFoundException;

public class AperturaDeArchivos {

	public static void main(String[] args) throws Exception {
		
		try (Archivo archivoTres = new Archivo("noExiste.in"); Archivo archivoUno = new Archivo("archivoUno.in")) {
			String rutaArchDos = archivoTres.leerArchivo();
			try(Archivo archivoDos = new Archivo(rutaArchDos)) {
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
