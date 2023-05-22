package edu.unlam.paradigmas.excepciones.ej04;

public class MovimientosDeCuenta {

	public static void main(String[] args) {
		CuentaBancaria cuenta = new CuentaBancaria();
		double movimiento = 3000;
		
		try {
			cuenta.retirarDinero(movimiento);
		}
		catch(SaldoInsuficienteException e) {
			System.out.println(e.toString());
		}
		
		System.out.println(cuenta.getSaldo());
		

	}

}
