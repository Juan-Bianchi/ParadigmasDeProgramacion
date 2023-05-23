package edu.unlam.paradigmas.colecciones.ej04;

public class GestionarTienda {

	public void gestionarLibros() {
		Libro libro1 = new Libro("Alicia en el País de las Maravillas");
		Libro libro2 = new Libro("Alicia en el País de las Maravillas");
		Libro libro3 = new Libro("El principito");
		Libro libro4 = new Libro("Juego de Tronos");
		Libro libro5 = new Libro("Alicia en el País de las Maravillas");
		Libro libro6 = new Libro("Juego de Tronos");
		
		Tienda tienda = new Tienda();
		
		tienda.agregarLibroASet(libro1);
		tienda.agregarLibroASet(libro2);
		tienda.agregarLibroASet(libro3);
		tienda.agregarLibroASet(libro4);
		tienda.agregarLibroASet(libro5);
		tienda.agregarLibroASet(libro6);
		
		System.out.println(tienda.getTitulosLibros().toString());
	}

}
