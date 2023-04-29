package unlam.paradigmas.objetos.ej06;

class Cerradura {
	
	private int clave;
	private int cantFallos;
	private boolean fueBloqueada;
	private int cantApExitosas;
	private int cantApFallidas;
	private boolean abierta;
	
    public Cerradura(int claveDeApertura,int cantidadDeFallosConsecutivosQueLaBloquean) {
    	if(claveDeApertura < 0 || cantidadDeFallosConsecutivosQueLaBloquean < 0) {
    		throw new ValorNegativoException();
    	}
    	this.cantFallos = cantidadDeFallosConsecutivosQueLaBloquean;
    	this.clave = claveDeApertura;
    	this.abierta = true;
    	this.fueBloqueada = false;
    	this.cantApExitosas = 0;
    	this.cantApFallidas = 0;
    }
    
    public boolean abrir(int clave) {
    	if(clave < 0) {
    		throw new ValorNegativoException();
    	}
    	boolean abierta = false;
    	if(!this.fueBloqueada) {
    		abierta = clave == this.clave;
        	if(abierta) {
        		this.cantApFallidas = 0;
        		this.cantApExitosas ++;
        		if(!this.abierta) {
        			this.abierta = true;
        		}
        	}
        	else {	
        		this.cantApFallidas ++;
        		if(this.cantApFallidas >= this.cantFallos) {
        			this.cerrar();
        			this.fueBloqueada = true;
        		}
        	}
    	}
    	
    	return abierta;
    }
    
    public void cerrar() {
    	this.abierta = false;
    }
    
    
    public boolean estaAbierta() {
    	return this.abierta;
    }
    
    public boolean estaCerrada() {
    	return !this.abierta;
    }
    
    public boolean fueBloqueada() {
    	return this.fueBloqueada;
    }
    
    public int contarAperturasExitosas() {
    	return this.cantApExitosas;
    }
    
    public int contarAperturasFallidas() {
    	return this.cantApFallidas;
    }
}
