package edu.unlam.paradigmas.colecciones.ej05;

import java.time.Month;
import java.util.HashMap;
import java.util.Map;

public class EstadisticaVenta {
	
	private Map<Month, Double> ventasPorMes = new HashMap<>();
	
	public void agregarVenta(Venta venta) {
	
		ventasPorMes.put(venta.getFecha().getMonth(), ventasPorMes.getOrDefault(venta.getFecha().getMonth(), 0.0) + venta.getValor()); 
	}
	
	
	public void mostrarVentasDeMes(Month mes) {
		
		if(ventasPorMes.containsKey(mes)) {
			System.out.println("Las ventas del mes de " + mes + " son: $" + ventasPorMes.get(mes));
		}
		else {
			System.err.println("No hay ventas realizadas para el mes de " + mes);
		}
	}
	
	
	

}
