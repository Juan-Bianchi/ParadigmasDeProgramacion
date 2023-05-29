package edu.unlam.paradigmas.colecciones.ej08;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Cola {

	LinkedList<Object> cola = new LinkedList<>();
	
	public boolean agregarElemento(Object o) {
		return cola.add(o);
	}
	
	public void agregarElementos(int[] numeros) {
		for (Object object : numeros) {
			cola.add(object);
		}
	}
	
	public void eliminarElemento() {
		cola.remove();
	}
	
	public void invertirElementos() {
		Object aux;
		int tam = cola.size();
		
		for(int i = 0; i < tam / 2; i++) {
			aux = cola.remove(i);
			cola.add(i,cola.remove(tam-2-i));
			cola.add(tam-1-i, aux);
		}
	}


	private List<String> string() {
		List<String> stringsList = new ArrayList<String>(cola.size()); 
		for (Object object : cola) {
		    stringsList.add(object.toString());   
		}
		return stringsList;
	}
	
	public void mostrarCola() {
		System.out.println(string());
	}
	
	
}
