package unlam.paradigmas.objetos.ej03;

public class PerimetroException extends RuntimeException{
	public PerimetroException() {
		super("El perimetro no puede ser negativo");
	}

}
