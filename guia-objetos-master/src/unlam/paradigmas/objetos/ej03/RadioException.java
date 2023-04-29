package unlam.paradigmas.objetos.ej03;

public class RadioException extends RuntimeException{
	public RadioException() {
		super("El radio no puede ser negativo");
	}
}
