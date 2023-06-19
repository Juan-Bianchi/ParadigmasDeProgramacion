package edu.unlam.paradigmas.patrones.ej01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FiguraCompuesta extends Figura{

	private List<Figura> figuras = new ArrayList<>();
	
	public FiguraCompuesta() {};
	
	public List<Figura> getFiguras(){
		return figuras;
	}
	
	@Override
	public Map<Color, Double> pasarDatosAPintor(Map<Color, Double> datos) {
		Map<Color, Double> aux = new HashMap<>();
		for (Figura figura : figuras) {
			aux.clear();
			for(Map.Entry<Color, Double> m : figura.pasarDatosAPintor(aux).entrySet()){    
			    if(datos.containsKey(m.getKey())) {
			    	datos.put(m.getKey(), m.getValue() + datos.get(m.getKey()));
			    }
			    else {
			    	datos.put(m.getKey(), m.getValue());
			    }
			}  
		}
		
		return datos;
	}
	
	@Override
	public double getArea() {
		area = 0;
		for (Figura figura : figuras) {
			area += figura.getArea();
		}
		return area;
	}
}
