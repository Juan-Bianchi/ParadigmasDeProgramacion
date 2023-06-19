package edu.unlam.paradigmas.patrones.ej01;

import java.util.HashMap;
import java.util.Map;

public class Pintor {

	private Map<Color, Integer> cantidadTemperas = new HashMap<>();
	private Map<Color, Double> areaYColor = new HashMap<>();
	
	public Pintor() {}
	
	public Map<Color, Integer> getTemperasNecesarias(){
		return cantidadTemperas;
	}
	
	public void calcularCantidadTemperas(Figura figura) {
		this.areaYColor = figura.pasarDatosAPintor(areaYColor);
		
		for (Color color : areaYColor.keySet()) {
			Tempera tempera = new Tempera(color);
			cantidadTemperas.put(tempera.getColor(), (int) Math.ceil(areaYColor.get(color) / tempera.getCapacidad()));
		}
	}
}
