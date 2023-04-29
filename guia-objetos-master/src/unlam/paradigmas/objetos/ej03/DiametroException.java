package unlam.paradigmas.objetos.ej03;

public class DiametroException extends RuntimeException{
	public DiametroException() {
		super("El diametro no puede ser negativo");
	}

}
