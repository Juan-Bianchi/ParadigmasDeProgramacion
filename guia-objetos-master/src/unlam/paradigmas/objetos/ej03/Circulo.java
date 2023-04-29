package unlam.paradigmas.objetos.ej03;

public class Circulo {
	private double radio;
	
	public Circulo() {};
	
	public Circulo(double radio) {
		if(radio < 0) {
			throw new RadioException();
		}
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		if(radio < 0) {
			throw new RadioException();
		}
		this.radio = radio;
	}
	
	public double getPerimetro() {
		return 2 * Math.PI * radio;
	}
	
	public void setPerimetro(double perimetro) {
		if(perimetro < 0) {
			throw new PerimetroException();
		}
		this.radio = perimetro / ( 2 * Math.PI);
	}
	
	public double getArea() {
		return Math.PI * radio * radio;
	}
	
	public void setArea(double area) {
		if(area < 0) {
			throw new AreaException();
		}
		this.radio = Math.sqrt(area/Math.PI);
	}
	
	public double getDiametro() {
		return radio * 2;
	}
	
	public void setDiametro(double diametro) {
		if(diametro < 0) {
			throw new DiametroException();
		}
		this.radio = diametro / 2;
	}
	
}
