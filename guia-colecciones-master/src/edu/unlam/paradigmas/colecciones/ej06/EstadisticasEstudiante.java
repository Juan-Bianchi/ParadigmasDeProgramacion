package edu.unlam.paradigmas.colecciones.ej06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EstadisticasEstudiante {
	
	private Map<String, List<Integer> > estadisticaNotas = new HashMap<>();
	
	public void agregarEstudiante(Estudiante estudiante) {
		estadisticaNotas.put(estudiante.getNombre(), estudiante.getNotas());
	}
	
	public double CalcularPromedio(String nombre) {
		double promedio = 0;
		double suma = 0;
		if(!estadisticaNotas.containsKey(nombre)) {
			throw new EstudianteNoExistenteException("El nombre proporcionado no pertenece a un estudiante");
		}
		int cantidad = estadisticaNotas.get(nombre).size();
		if(cantidad > 0) {
			for (Integer nota : estadisticaNotas.get(nombre)) {
				suma += nota;
			}
			promedio = suma / cantidad;
		}
		
		return promedio;
	}
	
	
	public Map<Double, ArrayList<String> > generarEstadisticaPorPromedio(){
		
		Map<Double, ArrayList<String> >estadisticaPorPromedio = new HashMap<>();
		for (String nombre : this.estadisticaNotas.keySet()) {
			if(estadisticaPorPromedio.containsKey(this.CalcularPromedio(nombre))) {
				estadisticaPorPromedio.get(this.CalcularPromedio(nombre)).add(nombre);
			}
			else {
				ArrayList<String> nuevaLista = new ArrayList<>();
				nuevaLista.add(nombre);
				estadisticaPorPromedio.put(this.CalcularPromedio(nombre), nuevaLista);
			}
		}
		return estadisticaPorPromedio;
	}
	
}
