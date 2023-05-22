package edu.unlam.paradigmas.colecciones.ej01;

public class Main {

	public static void main(String[] args) throws Exception{
		Registro registro = new Registro();
		Paquete paquete1 = new Paquete(1, "Dir1", "Dir2", 25);
		Paquete paquete2 = new Paquete(2, "Dir8", "Dir20", 35);
		Paquete paquete3 = new Paquete(3, "Dir10", "Dir2", 5);
		Paquete paquete4 = new Paquete(4, "Dir11", "Dir2", 10);
		Paquete paquete5 = new Paquete(5, "Dir13", "Dir2", 15);

		
		registro.agregarARegistro(paquete1);
		registro.agregarARegistro(paquete2);
		registro.agregarARegistro(paquete3);
		registro.agregarARegistro(paquete4);
		registro.agregarARegistro(paquete5);
		
		System.out.println(registro.mostrarRegistroDePaquetesDeMasDe(13));
	}

}
