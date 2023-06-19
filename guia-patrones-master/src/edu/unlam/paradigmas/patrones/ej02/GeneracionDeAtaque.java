package edu.unlam.paradigmas.patrones.ej02;

import java.util.List;

public class GeneracionDeAtaque {
	
	Usuario usuario = new Usuario();
	
	public void atacar() {
		for(int i=0; i<5; i++) {
			usuario.crearTanque();
		}
		
		List<Tank> tanks = usuario.getTanques();
		
		for (int i = 0; i < tanks.size(); i++) {
			if (i < tanks.size() / 2) {
				tanks.get(i).cambiarModo(new TankModeSiegeState());
				tanks.get(i).moverse(2, i);
				tanks.get(i).atacar(10, i);
			}
			else {
				tanks.get(i).moverse(4, i);
				tanks.get(i).atacar(5, i);
			}
		}
	}
	

}
