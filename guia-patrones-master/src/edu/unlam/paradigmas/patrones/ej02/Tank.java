package edu.unlam.paradigmas.patrones.ej02;

public class Tank {

	private TankState tankState;
	private double velocidadOriginal;
	private double alcanceOriginal;
	private double posicionX;
	private double posicionY;
	private double posicionAtaqX;
	private double posicionAtaqY;
	private int danioOriginal;
	
	public Tank(TankState state) {
		this.tankState = state;
		state.setTank(this);
		this.velocidadOriginal = 2;
		this.alcanceOriginal = 4;
		this.danioOriginal = 4;
	}
	
	public void cambiarModo(TankState state) {
		this.tankState = state;
		state.setTank(this);
	}
	
	public void atacar(double posicionAtaqX, double posicionAtaqY) {
		this.tankState.atacar(posicionAtaqX, posicionAtaqY);
	}
	
	public void moverse(double posicionX, double posicionY) {
		this.tankState.moverse(posicionX, posicionY);
	}

	public TankState getTankState() {
		return tankState;
	}

	public void setTankState(TankState tankState) {
		this.tankState = tankState;
	}

	public double getVelocidadOriginal() {
		return velocidadOriginal;
	}

	public void setVelocidadOriginal(double velocidad) {
		this.velocidadOriginal = velocidad;
	}

	public double getAlcanceOriginal() {
		return alcanceOriginal;
	}

	public void setAlcanceOriginal(double alcance) {
		this.alcanceOriginal = alcance;
	}

	public double getPosicionX() {
		return posicionX;
	}

	public void setPosicionX(double posicionX) {
		this.posicionX = posicionX;
	}

	public double getPosicionY() {
		return posicionY;
	}

	public void setPosicionY(double posicionY) {
		this.posicionY = posicionY;
	}

	public double getPosicionAtaqX() {
		return posicionAtaqX;
	}

	public void setPosicionAtaqX(double posicionAtaqX) {
		this.posicionAtaqX = posicionAtaqX;
	}

	public double getPosicionAtaqY() {
		return posicionAtaqY;
	}

	public void setPosicionAtaqY(double posicionAtaqY) {
		this.posicionAtaqY = posicionAtaqY;
	}
	
	public int getDanioOriginal() {
		return danioOriginal;
	}

	public void setDanioOriginal(int danio) {
		this.danioOriginal = danio;
	}
	
	public int getDanioModif() {
		return tankState.getDanio();
	}

	public double getVelocidadModif() {
		return tankState.getVelocidad();
	}
	
	public double getAlcanceModif() {
		return tankState.getAlcance();
	}
}
