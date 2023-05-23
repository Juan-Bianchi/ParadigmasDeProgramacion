package edu.unlam.paradigmas.colecciones.ej02;

import java.time.LocalDate;
import java.time.LocalTime;

public class Venta {

	private int numero;
	private LocalDate fecha;
	private String nombreCliente;
	private LocalTime hora;
	private double monto;
	
	public Venta(int numero, LocalDate fecha, String nombreCliente, LocalTime hora, double monto) {

		this.numero = numero;
		this.fecha = fecha;
		this.nombreCliente = nombreCliente;
		this.hora = hora;
		this.monto = monto;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	@Override
	public String toString() {
		return "Venta { numero = " + numero + ",\n        fecha = " + fecha + ",\n        nombreCliente = " + nombreCliente + ",\n        hora = " + hora
				+ ",\n        monto = " + monto + "\n      }";
	}
	
	
	
	
	
	
}
