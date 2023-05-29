package edu.unlam.paradigmas.colecciones.ej08;


public class InversionCola {
	
	public void invertir() {
		int[] numeros = {1, 2 , 3, 4, 5, 6, 7, 8, 9};
		Cola cola = new Cola();
		
		cola.agregarElementos(numeros);
		cola.invertirElementos();
		cola.mostrarCola();
		
	}

}
