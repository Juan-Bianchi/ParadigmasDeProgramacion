package edu.unlam.paradigmas.patrones.ej02;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
	private List<Tank> tanques = new ArrayList<>(); 
	
	public void crearTanque() {
		TankModeTankState initialState = new TankModeTankState();
		tanques.add(new Tank(initialState));
	}
	
	public List<Tank> getTanques(){
		return tanques;
	}

}
