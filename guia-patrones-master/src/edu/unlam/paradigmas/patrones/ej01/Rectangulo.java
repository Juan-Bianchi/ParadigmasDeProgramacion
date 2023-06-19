package edu.unlam.paradigmas.patrones.ej01;
public class Rectangulo extends Figura{
	
	private double alto;
	private double largo;

	public Rectangulo(Color color, double alto, double largo) {
		this.color = color;
		this.alto = alto;
		this.largo = largo;
		this.area = alto * largo;
	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	public double getLargo() {
		return largo;
	}

	public void setLargo(double largo) {
		this.largo = largo;
	}
	
	@Override
	public void calcularArea() {
		this.area = alto * largo;
	}
	
}
