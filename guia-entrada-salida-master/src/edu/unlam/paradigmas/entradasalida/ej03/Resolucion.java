package edu.unlam.paradigmas.entradasalida.ej03;

import java.lang.reflect.Array;

public class Resolucion {

	public void resolver(String nombreArchivo) {
		
		Archivo archivo = new Archivo(nombreArchivo);
		
		int[][] datos = archivo.leeArchivo();
		int[] salida = new int [datos.length];
		
		for(int luchador = 0; luchador < datos.length; luchador++) {
			int cantidadQueSupera = 0;
			for(int adversario = 0; adversario < datos.length; adversario ++) {
				if(adversario != luchador && 
				   ( datos[luchador][0] > datos[adversario][0] && 
				     datos[luchador][1] >= datos[adversario][1] || 
				     datos[luchador][0] >= datos[adversario][0] && 
				     datos[luchador][1] > datos[adversario][1]
				   )) {
					cantidadQueSupera ++;
				}
			}
			salida[luchador] = cantidadQueSupera;
		}
		
		archivo.grabarArchivo(salida);
	}
}
