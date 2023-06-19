package edu.unlam.paradigmas.patrones.ej01;

import java.util.HashMap;
import java.util.Map;

public class CalculoDeTemperas {
	
	public void calcular() {
		var trianguloRojo = new Triangulo(Color.ROJO, 2, 2);
		var trianguloAzul = new Triangulo(Color.AZUL, 4, 4);
		var rectanguloAmarillo = new Rectangulo(Color.AMARILLO, 20, 40);
		var casaPequenia = new FiguraCompuesta();
		
		casaPequenia.getFiguras().add(trianguloRojo);
		casaPequenia.getFiguras().add(trianguloAzul);
		casaPequenia.getFiguras().add(rectanguloAmarillo);
		
		var trianguloAmarillo = new Triangulo(Color.AMARILLO, 10, 20);
		var cuadradoRojo = new Cuadrado(Color.ROJO, 10);
		var casaPequenia2 = new FiguraCompuesta();
		
		casaPequenia2.getFiguras().add(trianguloAmarillo);
		casaPequenia2.getFiguras().add(cuadradoRojo);
		
		var barrioPrivado = new FiguraCompuesta();
		barrioPrivado.getFiguras().add(casaPequenia);
		barrioPrivado.getFiguras().add(casaPequenia2);
		
		var pintor = new Pintor();
		
		Map<Color, Integer> listaTemperas = new HashMap<>();
		pintor.calcularCantidadTemperas(casaPequenia);
		listaTemperas = pintor.getTemperasNecesarias();
		System.out.println("Cantidad de temperas para casa pequeña: ");
		System.out.println("---------------------------------------");
		for(Color tempera: listaTemperas.keySet()) {
			System.out.println(tempera + ": " + listaTemperas.get(tempera) + " pomos.");
		}
		
		pintor.calcularCantidadTemperas(barrioPrivado);
		listaTemperas = pintor.getTemperasNecesarias();
		System.out.println();
		System.out.println();
		System.out.println("Cantidad de temperas para barrio privado: ");
		System.out.println("---------------------------------------");
		for(Color tempera: listaTemperas.keySet()) {
			System.out.println(tempera + ": " + listaTemperas.get(tempera) + " pomos.");
		}

		
	}

}
