package edu.unlam.paradigmas.basicas.ej01;
import static edu.unlam.paradigmas.basicas.ej01.Rango.creaRangoMaximo;
import static edu.unlam.paradigmas.basicas.ej01.Rango.crearRangoAbierto;
import static edu.unlam.paradigmas.basicas.ej01.Rango.crearRangoAbiertoADerecha;
import static edu.unlam.paradigmas.basicas.ej01.Rango.crearRangoAbiertoAIzquierda;
import static edu.unlam.paradigmas.basicas.ej01.Rango.crearRangoCerrado;

import java.util.HashSet;
import java.util.Set;

public class Resolucion {
	
	public void resolver() {
		Rango rangoAbierto = crearRangoAbierto( -2.5, 3);
		Rango rangoCerrado = crearRangoCerrado(3, 4.5);
		Rango rangoAbIzq = crearRangoAbiertoAIzquierda(2.5, 3.5);
		Rango rangoAbDer = crearRangoAbiertoADerecha(0, 10);
		Set<Rango> rangos = new HashSet<>();
		rangos.add(rangoAbDer);
		rangos.add(rangoAbierto);
		rangos.add(rangoCerrado);
		int desplazamiento = 1;
		
		
		System.out.println("Mostrando Rango Abierto: " + rangoAbierto.toString());
		System.out.println("Mostrando Rango Cerrado: " + rangoCerrado.toString());
		System.out.println("Mostrando Rango Abierto a derecha: " + rangoAbDer.toString());
		System.out.println("Mostrando Rango Abierto a izquierda: " + rangoAbIzq.toString());
		
		System.out.println("Intersección " + rangoCerrado.toString() + " y " + rangoAbIzq.toString() + " es =  " + rangoCerrado.calcularInterseccion(rangoAbIzq).toString());
		System.out.println("El rango máximo entre " + rangoAbDer + " , " + rangoCerrado + " y " + rangoAbierto + " es = " + creaRangoMaximo(rangos).toString());
		System.out.println("Si desplazamos a " + rangoAbDer + " " + desplazamiento + " unidad, obtenemos a = " + rangoAbDer.desplazarRango(desplazamiento));
	}

	
	
	
	
}
