package edu.unlam.paradigmas.excepciones.ej05;

public class CuentaBancaria {

	private double saldo;
	
	public CuentaBancaria() {
		this.saldo = 0;
	}
	
	public CuentaBancaria(double saldo) {
		if(saldo < 0) {
			throw new SeteaSaldoNegativoException("No se puede crear una cuenta con saldo negativo");
		}
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void retirarDinero(double monto) {
		if(monto > this.saldo) {
			throw new SaldoInsuficienteException("El saldo debe ser mayor al monto que se sacará de la cuenta");
		}
		if(monto < 0) {
			throw new RetiraMontoNegativoException("El monto a retirar debe ser mayor a cero");
		}
		this.saldo -= monto;
	}
	
	public void depositarDinero(double monto) {
		if(monto < 0) {
			throw new DepositaMontoNegativoException("El monto a depositar no puede menor a cero");
		}
		this.saldo += monto;
	}
	
	
	
	
}
