package edu.unlam.paradigmas.herencia.ej01;

public class CuentaDeAhorro extends Cuenta {

	private double saldoSecundario;

	public CuentaDeAhorro() {

		super();
		this.saldo = 0;
	}

	public boolean reservarEnSaldoSecundario(double monto) {

		boolean esValido = this.haySaldoSuficiente(monto) && this.movimientoValido(monto);

		if (esValido) {
			this.saldo -= monto;
			this.saldoSecundario += monto;
			this.transacciones.add(new Transaccion(TipoMovimiento.INTERNA, TipoTransaccion.MOVIMIENTO_SALDO_SECUNDARIO,
					monto, "Reserva en saldo secundario"));
		}

		return esValido;
	}

	public boolean recuperarDeSaldoSecundario() {

		boolean retornaOk = false;
		if (this.saldoSecundario > 0) {
			this.saldo += this.saldoSecundario;
			this.transacciones.add(new Transaccion(TipoMovimiento.INTERNA, TipoTransaccion.MOVIMIENTO_SALDO_SECUNDARIO,
					saldoSecundario, "Recupero de saldo secundario"));
			this.saldoSecundario = 0;
			retornaOk = true;
		}
		return retornaOk;
	}

	public boolean recuperarDeSaldoSecundario(double monto) {

		boolean retornaOk = false;
		if (this.saldoSecundario >= monto) {
			this.saldo += monto;
			this.saldoSecundario -= monto;
			retornaOk = true;
			this.transacciones.add(new Transaccion(TipoMovimiento.INTERNA, TipoTransaccion.MOVIMIENTO_SALDO_SECUNDARIO,
					monto, "Recupero de saldo secundario"));
		}
		return retornaOk;
	}

	public double getSaldoSecudario() {
		return this.saldoSecundario;
	}

}
