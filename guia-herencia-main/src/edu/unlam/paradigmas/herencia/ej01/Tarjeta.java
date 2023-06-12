package edu.unlam.paradigmas.herencia.ej01;

public abstract class Tarjeta {
	
	protected String numero;
	protected Cuenta cuenta;
	

	protected Tarjeta() {
		this.numero = String.format("%04d", (int)(Math.random()*9999)) + "-" +
	                  String.format("%04d", (int)(Math.random()*9999)) + "-" +
	                  String.format("%04d", (int)(Math.random()*9999)) + "-" +
	                  String.format("%04d", (int)(Math.random()*9999));
	}

	public String getNumero() {
		return numero;
	}

	public Cuenta getCuenta() {
		return cuenta;
	}
	

	
}