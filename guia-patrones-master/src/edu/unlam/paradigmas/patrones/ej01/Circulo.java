package edu.unlam.paradigmas.patrones.ej01;

public class Circulo extends Figura{
	
	private double radio;

	public Circulo(Color color, double radio) {
		this.color = color;
		this.radio = radio;
		this.area = radio * radio * Math.PI;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	@Override
	public void calcularArea() {
		this.area = radio * radio * Math.PI;
	}
	
}
