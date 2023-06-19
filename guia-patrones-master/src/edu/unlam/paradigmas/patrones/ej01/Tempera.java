package edu.unlam.paradigmas.patrones.ej01;

public class Tempera {

	private Color color;
	private final double capacidad;
	
	public Tempera (Color color) {
		capacidad = 100;
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public double getCapacidad() {
		return capacidad;
	}

	@Override
	public String toString() {
		return "Tempera " + color + ", capacidad=" + capacidad + ".\n";
	}
	
	
	
	
}
