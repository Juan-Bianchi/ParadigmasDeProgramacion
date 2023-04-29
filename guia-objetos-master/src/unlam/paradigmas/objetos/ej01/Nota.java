package unlam.paradigmas.objetos.ej01;

public class Nota {
	
	private int nota;
	
    /**
     * pre : valorInicial está comprendido entre 0 y 10.
     * post: inicializa la Nota con el valor indicado.
     * @throws NotaException 
     */
    public Nota(int valorInicial) throws NotaException {
    	if(valorInicial < 0 || valorInicial > 10) {
    		throw new NotaException("Valor fuera de rango");
    	}
    	this.nota = valorInicial;
    }
    
    /**
     * post: devuelve el valor numérico de la Nota,
     *       comprendido entre 0 y 10.
     */
    public int obtenerValor() {
    	return this.nota > 0 && this.nota < 11? this.nota: -1;
    }
    
    /**
     * post: indica si la Nota permite o no la aprobación.
     */
    public boolean aprobado() {
    	
    	return this.nota >= 4;
    }
    
    /**
     * post: indica si la Nota implica desaprobación.
     */
    public boolean desaprobado() {
   
    	return this.nota < 4;
    }
}
