package edu.unlam.paradigmas.basicas.ej01;

import java.util.Collection;

public class Rango {
	
	private final boolean limiteIzqAbierto; 
	private final boolean limiteDerAbierto;
	private final double inicio;
	private final double fin;
	
	
	private Rango(boolean abiertoAIzq, boolean abiertoADer, double inicio, double fin) {
		if(fin < inicio) {
			throw new LimiteIncorrectoRango();
		}
		this.limiteDerAbierto = abiertoADer;
		this.limiteIzqAbierto = abiertoAIzq;
		this.inicio = inicio;
		this.fin = fin;
	}
	
	public double getInicio() {
		return inicio;
	}

	public double getFin() {
		return fin;
	}


	private boolean getLimiteIzqAbierto() {
		return limiteIzqAbierto;
	}

	private boolean getLimiteDerAbierto() {
		return limiteDerAbierto;
	}

	public boolean estaDentroDelRango(double numero) {
		boolean dentroDelRango;
		if(numero > this.inicio && numero < fin) {
			dentroDelRango = true;
		}
		else if(numero > this.inicio && numero == this.fin && ( esCerrado() || esAbiertoAIzquierda()) ){
			dentroDelRango = true;
		}
		else if(numero == this.inicio && numero < this.fin && ( esCerrado() || esAbiertoADerecha()) ) {
			dentroDelRango = true;
		}
		else {
			dentroDelRango = false;
		}
		
		return dentroDelRango;			
	}
	
	
	public boolean estaDentroDelRango(Rango rango) {
		boolean dentroDelRango;
		if( rango.getInicio() > this.inicio && rango.getFin() < fin) {
			dentroDelRango = true;
		}
		else if(rango.getInicio() == this.getInicio() && rango.getFin() == this.getFin() && rango.getLimiteDerAbierto() == this.getLimiteDerAbierto() && rango.getLimiteIzqAbierto() == this.getLimiteIzqAbierto()) {
			dentroDelRango = true;
		}
		else if(rango.getInicio() > this.inicio && rango.getFin() == this.fin && ( esCerrado() || esAbiertoAIzquierda()) ){
			dentroDelRango = true;
		}
		else if(rango.getInicio() == this.inicio && rango.getFin() < this.fin && ( esCerrado() || esAbiertoADerecha()) ) {
			dentroDelRango = true;
		}
		else {
			dentroDelRango = false;
		}
		
		return dentroDelRango;			
	}
	
	public boolean hayInterseccion(Rango rango) {
		boolean hayInterseccion = false;
		if( this.getInicio() > rango.getInicio() && this.getInicio() < rango.getFin()) {
			hayInterseccion = true; 
		}
		else if(this.getFin() > rango.getInicio() && this.getFin() < rango.getFin()) {
			hayInterseccion = true;
		}
		else if( rango.getInicio() > this.getInicio() && rango.getInicio() < this.getFin()) {
			hayInterseccion = true; 
		}
		else if(rango.getFin() > this.getInicio() && rango.getFin() < this.getFin()) {
			hayInterseccion = true;
		}

		else if(this.getInicio() == rango.getInicio() && this.limiteIzqAbierto == rango.limiteIzqAbierto) {
			hayInterseccion = true;
		}
		else if(this.getFin() == rango.getFin() && this.limiteDerAbierto == rango.limiteDerAbierto) {
			hayInterseccion = true;
		}
			
		return hayInterseccion;
	}
	
	public boolean esIgualRango(Rango rango) {
		return this.getInicio() == rango.getInicio() && 
			   this.getFin() == rango.getFin() && 
			   this.getLimiteDerAbierto() == rango.getLimiteDerAbierto() && 
			   this.getLimiteDerAbierto() == rango.getLimiteIzqAbierto();
	}
	
	public double ordenaRango(Rango rango) {
		double comparacion = this.getInicio() - rango.getInicio();
		if(comparacion == 0) {
			comparacion = this.getFin() - rango.getFin();
			if(comparacion == 0) {
				if(!this.getLimiteIzqAbierto() && rango.getLimiteIzqAbierto()) {
					comparacion = -1;
				}
				else if(this.getLimiteIzqAbierto() && !rango.getLimiteIzqAbierto()) {
					comparacion = 1;
				}
			}
			if(comparacion == 0) {
				if(!this.getLimiteDerAbierto() && rango.getLimiteDerAbierto()) {
					comparacion = 1;
				}
				else if(this.getLimiteDerAbierto() && !rango.getLimiteDerAbierto()) {
					comparacion = -1;
				}
			}
		}
		return comparacion ;
	}
	
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder().append("Rango: ");
		builder.append(this.esAbiertoAIzquierda() || this.esAbierto()? "(": "[");
		builder.append(this.inicio);
		builder.append(", ");
		builder.append(this.fin);
		builder.append(this.esAbiertoADerecha() || this.esAbierto()? ")": "]");
		
		return  builder.toString();
	}
	
	

	public boolean esCerrado() {
		boolean cerrado = limiteDerAbierto == false && limiteIzqAbierto == false;
		return cerrado;
	}
	
	public boolean esAbierto() {
		return limiteDerAbierto == limiteIzqAbierto == true;
	}
	
	public boolean esAbiertoADerecha() {
		return limiteDerAbierto == true && limiteIzqAbierto == false;
	}
	
	public boolean esAbiertoAIzquierda() {
		return limiteDerAbierto == false && limiteIzqAbierto == true;
	}
	
	public static Rango crearRangoCerrado(double inicio, double fin) {
		return new Rango(false, false, inicio, fin);
	}
	
	public static Rango crearRangoAbierto(double inicio, double fin) {
		return new Rango(true, true, inicio, fin);
	}
	
	public static Rango crearRangoAbiertoADerecha(double inicio, double fin) {
		return new Rango(false, true, inicio, fin);
	}
	
	public static Rango crearRangoAbiertoAIzquierda(double inicio, double fin) {
		return new Rango(true, false, inicio, fin);
	}
	
	public static Rango creaRangoMaximo(Collection<Rango> rangos) {
		double limInf = 0;
		double limSup = 0;
		boolean abiertoDer = true;
		boolean abiertoIzq = true;
		
		for(Rango rango: rangos) {
			if(rango.getInicio() < limInf || (rango.getInicio() == limInf && abiertoIzq && !rango.getLimiteIzqAbierto()) ) {
				limInf = rango.getInicio();
				abiertoIzq = rango.getLimiteIzqAbierto();
			}
			if(rango.getFin() > limSup || (rango.getFin() == limSup && abiertoDer && !rango.getLimiteDerAbierto())) {
				limSup = rango.getFin();
				abiertoDer = rango.getLimiteDerAbierto();
			}
		};
		
		if(abiertoDer && abiertoIzq)
			return crearRangoAbierto(limInf, limSup);
		else if(!abiertoDer && !abiertoIzq)
			return crearRangoCerrado(limInf, limSup);
		else if(abiertoDer && !abiertoIzq)
			return crearRangoAbiertoADerecha(limInf, limSup);
		else
			return crearRangoAbiertoAIzquierda(limInf, limSup);
	}
	
	
	public Rango calcularInterseccion(Rango rango) {
		double limInf = 0;
		double limSup = 0;
		boolean abiertoDer = true;
		boolean abiertoIzq = true;
		
		if(this.hayInterseccion(rango)) {
			if(rango.getInicio() < this.getInicio() || (rango.getInicio() == this.getInicio() && rango.getLimiteIzqAbierto() && !rango.getLimiteIzqAbierto()) ) {
				limInf = this.getInicio();
				abiertoDer = this.getLimiteDerAbierto();
			}
			else {
				limInf = rango.getInicio();
				abiertoDer = rango.getLimiteDerAbierto();
			}
			if(rango.getFin() > this.getFin() || (rango.getFin() == this.getFin() && !rango.getLimiteDerAbierto() && this.getLimiteDerAbierto()) ) {
				limSup = this.getFin();
				abiertoIzq = this.getLimiteIzqAbierto();
			}
			else {
				limSup = rango.getFin();
				abiertoIzq = rango.getLimiteIzqAbierto();
			}
		}

		
		if(abiertoDer && abiertoIzq)
			return crearRangoAbierto(limInf, limSup);
		else if(!abiertoDer && !abiertoIzq)
			return crearRangoCerrado(limInf, limSup);
		else if(abiertoDer && !abiertoIzq)
			return crearRangoAbiertoADerecha(limInf, limSup);
		else
			return crearRangoAbiertoAIzquierda(limInf, limSup);
	}
	
	public Rango desplazarRango(double desplazamiento) {
		if(this.limiteDerAbierto && this.limiteIzqAbierto)
			return crearRangoAbierto(this.getInicio() + desplazamiento, this.getFin() + desplazamiento);
		else if(!this.limiteDerAbierto && !this.limiteIzqAbierto)
			return crearRangoCerrado(this.getInicio() + desplazamiento, this.getFin() + desplazamiento);
		else if(this.limiteDerAbierto && !this.limiteIzqAbierto)
			return crearRangoAbiertoADerecha(this.getInicio() + desplazamiento, this.getFin() + desplazamiento);
		else
			return crearRangoAbiertoAIzquierda(this.getInicio() + desplazamiento, this.getFin() + desplazamiento);
	}
	
}
