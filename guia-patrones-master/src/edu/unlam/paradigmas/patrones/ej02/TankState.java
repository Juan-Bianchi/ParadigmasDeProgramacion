package edu.unlam.paradigmas.patrones.ej02;

public interface TankState {

	public void moverse(double posicionX, double posicionY);
	public void atacar(double posicionAtaqX, double posicionAtaqY);
	public double getVelocidad();
	public double getAlcance();
	public int getDanio();
	public void setTank(Tank tank);
}
