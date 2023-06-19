package edu.unlam.paradigmas.patrones.ej01;

public class Triangulo extends Figura {
	
	private double base;
	private double altura;

	public Triangulo(Color color, double base, double altura) {
		this.color = color;
		this.base = base;
		this.altura = altura;
		this.area = base * altura / 2;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	@Override
	public void calcularArea() {
		this.area = base * altura / 2;
	}
}
