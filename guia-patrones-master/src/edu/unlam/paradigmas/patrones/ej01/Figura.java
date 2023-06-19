package edu.unlam.paradigmas.patrones.ej01;

import java.util.Map;

public abstract class Figura {

	protected double area;
	protected Color color;
	
	public double getArea() {
		this.calcularArea();
		return area;
	}
	
	public Color getColor() {
		return color;
	}
	
	public Map<Color, Double> pasarDatosAPintor(Map<Color, Double> datos){
		datos.put(this.color, this.getArea());
		return datos;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public void calcularArea() {
		
	}

	
}
