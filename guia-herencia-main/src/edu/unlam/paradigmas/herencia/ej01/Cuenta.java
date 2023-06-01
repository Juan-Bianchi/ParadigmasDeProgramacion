package edu.unlam.paradigmas.herencia.ej01;

import java.util.ArrayList;
import java.util.List;

public abstract class Cuenta {

	protected double saldo;
	protected List<Transaccion> transacciones = new ArrayList<>();
	protected TarjetaCredito tarjetaCredito;
	protected TarjetaDebito tarjetaDebito;
	
	public Cuenta() {
		this.saldo = 0;
	}
	
	protected boolean movimientoValido(double monto) {
		return monto > 0;
	}
	
	protected boolean haySaldoSuficiente(double monto) {
		
		return monto <= this.saldo;	
	}

	
	/*public void depositar(double movimiento) {
		if(!this.movimientoValido(movimiento)) {
			throw new RuntimeException();
		}
		this.saldo += movimiento;
	}
	
	public void extraerDinero(double movimiento) {
		if(movimiento > saldo && !this.movimientoValido(movimiento)) {
			throw new RuntimeException();
		}
		saldo -= movimiento;
	}
	
	public synchronized void transferir(Cuenta otraCuenta, double monto) {
		if(!movimientoValido(monto) || monto > saldo) {
			throw new RuntimeException();
		}
		this.saldo -= monto;
		otraCuenta.saldo += monto;
	}*/
	
	public boolean depositar(double monto, String motivo) {
		
		boolean esValido = this.movimientoValido(monto);
		if(esValido) {
			this.saldo += monto;
			this.transacciones.add(new Transaccion(TipoMovimiento.CREDITO, TipoTransaccion.DEPOSITO, monto, motivo));
		}
		
		return esValido;
	}
	
	public boolean extraerDinero(double monto, String motivo) {
		
		boolean esValido = this.haySaldoSuficiente(monto) && this.movimientoValido(monto);
		if(esValido) {
			saldo -= monto;
			this.transacciones.add(new Transaccion(TipoMovimiento.DEBITO, TipoTransaccion.RETIRO, monto, motivo));
		}
		
		return esValido;
	}
	
	public synchronized boolean transferir(Cuenta otraCuenta, double monto, String motivo) {
		
		boolean esValido = movimientoValido(monto) && this.haySaldoSuficiente(monto);
		if(esValido) {
			this.saldo -= monto;
			otraCuenta.saldo += monto;
			this.transacciones.add(new Transaccion(TipoMovimiento.DEBITO, TipoTransaccion.TRANSFERENCIA, monto, motivo));
			otraCuenta.transacciones.add(new Transaccion(TipoMovimiento.CREDITO, TipoTransaccion.TRANSFERENCIA, monto, motivo));
		}
		
		return esValido;
	}
	
	protected boolean pagarTarjeta(double monto, String detalle) {
		boolean esValido = movimientoValido(monto) && this.haySaldoSuficiente(monto);
		if(esValido) {
			this.saldo -= monto;
			this.transacciones.add(new Transaccion(TipoMovimiento.DEBITO, TipoTransaccion.PAGO, monto, detalle));
		}
		
		return esValido;
	}

	public double getSaldo() {
		
		return saldo;
	}
	
	//PARTE 4
	
	/*
	 •¿Hubo alguna funcionalidad que pudiera reutilizarse?
	   Si, hay varios metodos private que se reutilizan, también el de getSaldo y en el caso de 
	   la CajaDeAhorro otros public.
	 •¿Qué método tuvo que rehacerse?
	   Los constructores son particulares y además en el caso de CuentaCorriente los metodos de extraer y transferir
 	 •¿Cómo se manejan transferencias entre tipos de cuenta diferentes?
 	   En el caso de CuentaCorriente como tenemos el saldo descubierto hay un Override del método original.
	 */
	
	public boolean agregarTarjeta(TarjetaDebito tarjeta) {
		boolean tarjetaLibre = this.tarjetaDebito == null;
		if(tarjetaLibre) {
			this.tarjetaDebito = tarjeta;
		}
		return tarjetaLibre;
	}
	
	public boolean agregarTarjeta(TarjetaCredito tarjeta) {
		boolean tarjetaLibre = this.tarjetaCredito == null;
		if(tarjetaLibre) {
			this.tarjetaCredito = tarjeta;
		}
		return tarjetaLibre;
	}
}

