package edu.unlam.paradigmas.herencia.ej01;

import java.time.LocalDateTime;

public class Transaccion {

	private double monto;
	private String motivo;
	private TipoMovimiento tipoMovimiento;
	private LocalDateTime fecha;
	private TipoTransaccion tipoTransaccion;
	
	public Transaccion(TipoMovimiento tipoMovimiento, TipoTransaccion tipoTransaccion, double monto, String motivo) {
		this.monto = monto;
		this.motivo = motivo;
		this.tipoMovimiento = tipoMovimiento;
		this.tipoTransaccion = tipoTransaccion;
		this.fecha = LocalDateTime.now();
	}

	public TipoTransaccion obtenerTipoTransaccion() {
		return tipoTransaccion;
	}

	public double obtenerMonto() {
		return monto;
	}

	public String obtenerMotivo() {
		return motivo;
	}

	public TipoMovimiento obtenerTipoMovimiento() {
		return tipoMovimiento;
	}
	
	public LocalDateTime obtenerFecha() {
		return fecha;
	}
	
	
	
	
}
