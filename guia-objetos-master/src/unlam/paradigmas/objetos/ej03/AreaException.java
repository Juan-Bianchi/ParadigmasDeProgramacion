package unlam.paradigmas.objetos.ej03;

public class AreaException extends RuntimeException{
	
	public AreaException() {
		super("El area no puede ser negativa");
	}

}
