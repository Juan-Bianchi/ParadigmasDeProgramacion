package edu.unlam.paradigmas.colecciones.ej02;

import java.time.LocalDate;
import java.util.LinkedList;

public class VentaServicio implements Registro{
	
	LinkedList<Venta> registroVentas = new LinkedList<>();

	@Override
	public void agregarElementoAlRegistro(Object elemento) {
		this.registroVentas.add((Venta)elemento);
	}

	@Override
	public Venta buscarElementoEnRegistro(int codigo) {
		for (Venta venta : registroVentas) {
			if(venta.getNumero() == codigo) {
				return venta;
			}
		}
		return null;
	}

	@Override
	public void mostrarElementosPorFecha(LocalDate fecha) {
		for (Venta venta : registroVentas) {
			if(venta.getFecha().equals(fecha)) {
				System.out.println(venta.toString());
			}
		}
		
	}
	

}
