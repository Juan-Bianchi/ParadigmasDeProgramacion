package unlam.paradigmas.objetos.ej02;

public class Punto {
	private double x;
	private double y;
	
	public Punto() {};
	
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public boolean estaSobreEjeX() {
		return x == 0;
	}
	 
	public boolean estaSobreEjeY() {
		return y == 0;
	}
	
	public boolean esElOrigen() {
		return y == 0 && x == 0;
	}
	
	public double distanciaAlOrigen() { 
		return Math.hypot(x, y);
	}
	
	public double distanciaAotroPunto(Punto otro) { 
		return Math.sqrt(Math.abs(otro.getX() - x) * Math.abs(otro.getX() - x) + Math.abs(otro.getY() - y) * Math.abs(otro.getY() - y));
	}
	 
	 
	
	
	
}
