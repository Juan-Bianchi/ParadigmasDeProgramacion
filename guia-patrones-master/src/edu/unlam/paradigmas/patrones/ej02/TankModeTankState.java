package edu.unlam.paradigmas.patrones.ej02;

public class TankModeTankState implements TankState{
	
	private Tank tank;
	
	@Override
	public void setTank(Tank tank) {
		this.tank = tank;
	}

	@Override
	public void moverse(double posicionX, double posicionY) {
		tank.setPosicionX(posicionX);
		tank.setPosicionY(posicionY);
		System.out.println(String.format("El tanque se ha movido a una velocidad de %.2f", tank.getVelocidadModif()) + " a el punto (" + posicionX + ", " + posicionY + ")");
	}

	@Override
	public void atacar(double posicionAtaqX, double posicionAtaqY) {
		double distanciaX = Math.abs(posicionAtaqX - tank.getPosicionX());
		double distanciaY = Math.abs(posicionAtaqY - tank.getPosicionX());
		double distanciaAotroPunto = Math.sqrt( distanciaX * distanciaX +  distanciaY * distanciaY);
		
		if(tank.getAlcanceModif() >= distanciaAotroPunto) {
			tank.setPosicionAtaqX(posicionAtaqX);
			tank.setPosicionAtaqY(posicionAtaqY);
			System.out.println("El tanque ha atacado a el punto (" + posicionAtaqX + ", " + posicionAtaqY + String.format(") a una distancia de %.2f", distanciaAotroPunto) + " con un alcance de " + tank.getAlcanceModif() + " y daño " + tank.getDanioModif());
		}
		else {
			System.out.println(String.format("El tanque no tiene alcance para atacar ese punto. Distancia %.2f", distanciaAotroPunto) + " y alcance de " + tank.getAlcanceModif());
		}
		
	}

	@Override
	public double getVelocidad() {
		return tank.getVelocidadOriginal();
	}

	@Override
	public double getAlcance() {
		return tank.getAlcanceOriginal();
	}

	@Override
	public int getDanio() {
		return tank.getDanioOriginal();
	}

}
