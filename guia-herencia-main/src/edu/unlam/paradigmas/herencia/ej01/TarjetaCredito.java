package edu.unlam.paradigmas.herencia.ej01;

public class TarjetaCredito extends Tarjeta{
	
	private double comision;
	
	public TarjetaCredito() {
		super();
		this.comision = 0.3;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}
	
	
}
