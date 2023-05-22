package edu.unlam.paradigmas.excepciones.ej05;

public class MovimientosDeCuenta {

	public static void main(String[] args) {
		CuentaBancaria cuenta = new CuentaBancaria();
		double deposito = 2000;
		double retiro = 3000;
		
		try {
			cuenta.depositarDinero(deposito);
			cuenta.retirarDinero(retiro);
		}
		catch(DepositaMontoNegativoException | SaldoInsuficienteException | RetiraMontoNegativoException e) {
			System.out.println(e.toString());
		}
		
		System.out.println(cuenta.getSaldo());
		

	}

}
