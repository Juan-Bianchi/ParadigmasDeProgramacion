package edu.unlam.paradigmas.herencia.ej01;

public class CuentaCorriente extends Cuenta{

	private final double descubierto;

	
	public CuentaCorriente(double descubierto) {
		
		super();
		this.descubierto = descubierto;
	}
	
	@Override
	public synchronized boolean transferir(Cuenta otraCuenta, double monto, String motivo) {
		
		boolean esValido = false;
		if(this.movimientoValido(monto) && this.haySaldoSuficiente(monto)) {
			this.saldo -= monto;
			otraCuenta.saldo += monto;
			esValido = true;
			this.transacciones.add(new Transaccion(TipoMovimiento.DEBITO, TipoTransaccion.TRANSFERENCIA, monto, motivo));
			otraCuenta.transacciones.add(new Transaccion(TipoMovimiento.CREDITO, TipoTransaccion.TRANSFERENCIA, monto, motivo));
		}
		else if(this.movimientoValido(monto) && monto <= this.saldo + this.descubierto) {
			this.saldo -= monto;
			otraCuenta.saldo += monto;
			esValido = true;
			this.transacciones.add(new Transaccion(TipoMovimiento.DEBITO, TipoTransaccion.TRANSFERENCIA, monto, motivo));
			otraCuenta.transacciones.add(new Transaccion(TipoMovimiento.CREDITO, TipoTransaccion.TRANSFERENCIA, monto, motivo));
		}
		
		return esValido;
	}
	
	
	@Override
	public boolean extraerDinero(double monto, String motivo) {
		
		boolean esValido = false;
		if(this.movimientoValido(monto) && this.haySaldoSuficiente(monto)) {
			saldo -= monto;
			esValido = true;
			this.transacciones.add(new Transaccion(TipoMovimiento.DEBITO, TipoTransaccion.RETIRO, monto, motivo));
		}
		else if(this.movimientoValido(monto) && monto <= this.saldo + this.descubierto) {
			this.saldo -= monto;
			esValido = true;
			this.transacciones.add(new Transaccion(TipoMovimiento.DEBITO, TipoTransaccion.RETIRO, monto, motivo));
		}
		
		return esValido;
	}
	
	@Override
	public boolean pagarTarjeta(double monto, String detalle) {
		boolean esValido = movimientoValido(monto) && this.haySaldoSuficiente(monto);
		if(esValido) {
			this.saldo -= monto;
			this.transacciones.add(new Transaccion(TipoMovimiento.DEBITO, TipoTransaccion.PAGO, monto, detalle));
		}
		else if(this.movimientoValido(monto) && monto <= this.saldo + this.descubierto) {
			this.saldo -= monto;
			esValido = true;
			this.transacciones.add(new Transaccion(TipoMovimiento.DEBITO, TipoTransaccion.PAGO, monto, detalle));
		}
		
		return esValido;
	}
	

	public double getDescubierto() {
		
		return descubierto;
	}
	
}
