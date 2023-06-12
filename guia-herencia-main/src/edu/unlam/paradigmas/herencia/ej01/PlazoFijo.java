package edu.unlam.paradigmas.herencia.ej01;

public class PlazoFijo {

	private double interes;
	private double montoInicial;
	private String descripcion;
	private byte plazoEnMeses;
	private double montoFinal;
	private Cuenta cuenta;
	
	
	public PlazoFijo(Cuenta cuenta, double monto, String descripcion, byte plazoEnMeses) {
		this.interes = 0.36;
		this.montoInicial = monto;
		this.descripcion = descripcion;
		this.plazoEnMeses = plazoEnMeses;
		this.montoFinal = monto + monto * this.interes / 12 * this.plazoEnMeses;
		this.cuenta = cuenta;
	}


	public double getInteres() {
		return interes;
	}


	public double getMonto() {
		return montoInicial;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public byte getPlazoEnMeses() {
		return plazoEnMeses;
	}


	public double getMontoFinal() {
		return montoFinal;
	}
	
	public Cuenta getCuenta() {
		return cuenta;
	}
	
}
