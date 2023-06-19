package edu.unlam.paradigmas.patrones.ej01;

public class Cuadrado extends Figura{
	
	private double lado;
	
	public Cuadrado(Color color, double lado) {
		this.color = color;
		this.lado = lado;
		this.area = lado * lado;
	}
	
	public void setLado(double lado) {
		this.lado = lado;
	}
	
	@Override
	public void calcularArea() {
		this.area = lado * lado;
	}
}
