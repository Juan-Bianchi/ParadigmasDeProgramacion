package edu.unlam.paradigmas.colecciones.ej05;

import java.time.LocalDate;
import java.time.Month;

public class ResolucionVentas {

	public void resolver() {
		
		Venta venta1 = new Venta("AB102", 3568, LocalDate.now().minusMonths(2));
		Venta venta2 = new Venta("AB108", 5000, LocalDate.now().minusMonths(2));
		Venta venta3 = new Venta("AB110", 30000, LocalDate.now().minusMonths(3));
		Venta venta4 = new Venta("AB112", 25000, LocalDate.now().minusMonths(3));
		Venta venta5 = new Venta("AB125", 35680, LocalDate.now().minusMonths(5));
		Venta venta6 = new Venta("AB148", 3600, LocalDate.now().minusMonths(5));
		Venta venta7 = new Venta("AB170", 300, LocalDate.now().minusMonths(7));
		
		EstadisticaVenta estadistica = new EstadisticaVenta();
		
		estadistica.agregarVenta(venta1);
		estadistica.agregarVenta(venta2);
		estadistica.agregarVenta(venta3);
		estadistica.agregarVenta(venta4);
		estadistica.agregarVenta(venta5);
		estadistica.agregarVenta(venta6);
		estadistica.agregarVenta(venta7);
		
		estadistica.mostrarVentasDeMes(Month.MARCH);
		estadistica.mostrarVentasDeMes(Month.OCTOBER);
		
	}
}
