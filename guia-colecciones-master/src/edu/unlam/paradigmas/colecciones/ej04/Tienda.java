package edu.unlam.paradigmas.colecciones.ej04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Tienda {
	
	Set<Libro> titulosLibros = new HashSet<>();
	
	public boolean agregarLibroASet(Libro libroNuevo) {
		boolean estaEnElSet = false;
		Iterator<Libro> iterator = this.titulosLibros.iterator();
		
		while (!estaEnElSet && iterator.hasNext()) {
			if(libroNuevo.getNombre().toLowerCase().equals(iterator.next().getNombre().toLowerCase())) {
				estaEnElSet = true;
			}	
		}
		if(!estaEnElSet) {
			this.titulosLibros.add(libroNuevo);
		}
		
		return estaEnElSet;
	}
	
	public Set<Libro> getTitulosLibros(){
		return this.titulosLibros;
	}

	@Override
	public String toString() {
		return "Tienda [titulosLibros=" + titulosLibros + "]";
	}
	
	

}
