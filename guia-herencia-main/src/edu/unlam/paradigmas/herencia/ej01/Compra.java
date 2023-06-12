package edu.unlam.paradigmas.herencia.ej01;

public class Compra {

	private double monto;
	private String descripcion;
	private Tarjeta tarjeta;
	
	public double getMonto() {
		return monto;
	}
	
	public String getDescripcion() {
		return descripcion;
	}

	public Compra(double monto, String descripcion) {
		this.monto = monto;
		this.descripcion = descripcion;
	}
	
	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}
}
