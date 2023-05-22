package edu.unlam.paradigmas.excepciones.ej04;

public class CuentaBancaria {

	private double saldo;
	
	public CuentaBancaria() {
		this.saldo = 0;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void retirarDinero(double monto) {
		if(monto > this.saldo) {
			System.out.println("Hola");
			throw new SaldoInsuficienteException("El saldo debe ser mayor al monto que se sacará de la cuenta");
		}
		this.saldo -= monto;
	}
	
	
}
