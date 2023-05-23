package edu.unlam.paradigmas.colecciones.ej02;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

	public static void main(String[] args) {
		Venta venta1 = new Venta(255, LocalDate.now().plusDays(4), "Pedro", LocalTime.now(), 1356);
		Venta venta2 = new Venta(100, LocalDate.now().plusDays(5), "Luis", LocalTime.now(), 1356.5);
		Venta venta3 = new Venta(253, LocalDate.now().plusDays(7), "Pedro", LocalTime.now(), 2056);
		Venta venta4 = new Venta(25, LocalDate.now().plusDays(7), "Pablo", LocalTime.now(), 13560);
		Venta venta5 = new Venta(55, LocalDate.now().plusDays(7), "Juan", LocalTime.now(), 10000);
		Venta venta6 = new Venta(103, LocalDate.now().plusDays(20), "Lucas", LocalTime.now(), 11356);
		
		
		VentaServicio registroVentas = new VentaServicio();
		
		registroVentas.agregarElementoAlRegistro(venta1);
		registroVentas.agregarElementoAlRegistro(venta2);
		registroVentas.agregarElementoAlRegistro(venta3);
		registroVentas.agregarElementoAlRegistro(venta4);
		registroVentas.agregarElementoAlRegistro(venta5);
		registroVentas.agregarElementoAlRegistro(venta6);
		
		System.out.println(registroVentas.buscarElementoEnRegistro(253).toString());
		
		LocalDate diaDeVenta = LocalDate.now().plusDays(7);
		
		System.out.println("Ventas del dia " + diaDeVenta + "= " );
		registroVentas.mostrarElementosPorFecha(diaDeVenta);

	}

}
