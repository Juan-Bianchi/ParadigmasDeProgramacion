package edu.unlam.paradigmas.herencia.ej01;

public class TarjetaDebito extends Tarjeta{

	public TarjetaDebito() {
		super();
	}

	private boolean debitarCompra(double monto) {
		boolean pagoOk = this.cuenta.pagarTarjeta(monto, "Pago movimiento con tarjeta de débito");
		if(pagoOk) {
			
		}
		
		return true;
	}
}
