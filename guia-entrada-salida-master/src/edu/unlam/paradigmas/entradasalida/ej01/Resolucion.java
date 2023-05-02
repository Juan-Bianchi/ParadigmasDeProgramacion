package edu.unlam.paradigmas.entradasalida.ej01;

import java.util.ArrayList;

public class Resolucion {
	
	public void resolver(String nombreArchivo) {
		Archivo archivo = new Archivo(nombreArchivo);
		ArrayList<Integer> respuesta = new ArrayList<>();
		
		respuesta = archivo.leerArchivo();
		
		respuesta.sort((a, b)-> a-b);
		respuesta.add(0, respuesta.size());
		
		archivo.guardarArchivo(respuesta);
	}

}
