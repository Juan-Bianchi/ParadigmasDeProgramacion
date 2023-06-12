package edu.unlam.paradigmas.herencia.ej01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TarjetaCredito extends Tarjeta{
	
	private double comision;
	private List<LocalDateTime> cronogramaPagos;
	private LocalDateTime fechaPago;
	private List<Compra> compras = new ArrayList<Compra>();
	
	public TarjetaCredito() {
		super();
		this.comision = 0.3;
		this.cronogramaPagos = this.crearCronograma();
		this.fechaPago = this.asignarFechaVencimientoActual();
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}
	
	public List<LocalDateTime> getCronogramaPagos() {
		return cronogramaPagos;
	}

	public LocalDateTime getFechaVencimiento() {
		return fechaPago;
	}

	public List<Compra> getCompras() {
		return compras;
	}

	private List<LocalDateTime> crearCronograma() {
		int anio = LocalDate.now().getYear();
		int mes;
		List<LocalDateTime> cronogramaPagos = new ArrayList<>();
		
		for(mes =LocalDate.now().getMonthValue(); mes <= 12; mes++) {
			cronogramaPagos.add(LocalDateTime.of(anio, mes, 1, 1, 1));
		}
		
		return cronogramaPagos;
	}
	
	private LocalDateTime asignarFechaVencimientoActual() {
		LocalDateTime hoy = LocalDateTime.now();
		int i;
		for(i = 0; i < this.cronogramaPagos.size() && hoy.isBefore(this.cronogramaPagos.get(i)); i++) {
		}
		return this.cronogramaPagos.get(i);
	}
	
	public void efectuarCompra(Compra compra) {
		this.compras.add(compra);
		compra.setTarjeta(this);
	}
	
	public boolean realizarPago() {
		double pago = 0;
		for (Compra compra : compras) {
			pago += compra.getMonto();
		}

		pago += pago * this.comision;
		boolean pagoEfectuado = this.cuenta.pagarTarjeta(pago, "Pago tarjeta de crédito");
		if(pagoEfectuado) {
			this.compras.clear();
		}
		
		return pagoEfectuado;
	}
}
