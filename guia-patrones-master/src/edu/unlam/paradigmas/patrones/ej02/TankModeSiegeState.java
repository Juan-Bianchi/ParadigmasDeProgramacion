package edu.unlam.paradigmas.patrones.ej02;

public class TankModeSiegeState implements TankState{
	
	private Tank tank;
	private byte bonusDistancia;
	private byte bonusDanio;
	private byte penalizacionVelocidad;
	
	public TankModeSiegeState() {
		bonusDanio = 3;
		bonusDistancia = 3;
		penalizacionVelocidad = 3;
	}
	
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
			System.out.println("El tanque ha atacado a el punto (" + posicionAtaqX + ", " + posicionAtaqY + ") con un alcance de " + tank.getAlcanceModif() * 3 + " y daño " + tank.getDanioModif());
		}
		else {
			System.out.println("El tanque no tiene alcance para atacar ese punto");
		}
		
	}

	@Override
	public double getVelocidad() {
		return tank.getVelocidadOriginal() / this.penalizacionVelocidad;
	}

	@Override
	public double getAlcance() {
		return tank.getAlcanceOriginal() * this.bonusDistancia;
	}

	@Override
	public int getDanio() {
		return tank.getDanioOriginal() * this.bonusDanio;
	}

}
