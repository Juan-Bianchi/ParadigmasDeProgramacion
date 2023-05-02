package edu.unlam.paradigmas.entradasalida.ej02;

public class Resolucion {

	public void resolver(String nombreArchivo) {
		Archivo archivo = new Archivo(nombreArchivo);
		int[] datos = archivo.leerArchivo();
		
		archivo.crearArchivoEstadisticas(datos);
	}
}
