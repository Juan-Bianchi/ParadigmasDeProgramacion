package edu.unlam.paradigmas.colecciones.ej01;

public class Paquete {

	private int numeroSeguimiento;
	private String direccionOrigen;
	private String direccionDestino;
	private double peso;
	private Registro registro;
	
	
	public Paquete(int numeroSeguimiento, String direccionOrigen, String direccionDestion, double peso) throws Exception{
		
		if(numeroSeguimiento < 0) {
			throw new NumeroSeguimientoIncorrectoException("El numero de seguimiento no puede ser menor a cero");
		}
		if(peso < 0) {
			throw new PesoNoValidoException("El peso no puede ser menor a cero");
		}
		if(direccionDestion.toLowerCase().equals(direccionOrigen.toLowerCase())) {
			throw new DireccionErroneaException("La direccion de origen no puede ser igual a la de destino");
		}
		if(registro != null && !registro.getRegistro().stream().filter(paquete -> paquete.getNumeroSeguimiento() == numeroSeguimiento).toList().isEmpty()) {
			throw new NumeroSeguimientoIncorrectoException("El numero de seguimiento ya ha sido utilizado");
		}
		this.numeroSeguimiento = numeroSeguimiento;
		this.direccionOrigen = direccionOrigen;
		this.direccionDestino = direccionDestion;
		this.peso = peso;
	}

	public int getNumeroSeguimiento() {
		return numeroSeguimiento;
	}
	
	public void setNumeroSeguimiento(int numeroSeguimiento) throws NumeroSeguimientoIncorrectoException{
	if(numeroSeguimiento < 0) {
		throw new NumeroSeguimientoIncorrectoException("El numero de seguimiento no puede ser menor a cero");
	}
		this.numeroSeguimiento = numeroSeguimiento;
	}
	
	public String getDireccionOrigen() {
		return direccionOrigen;
	}
	
	public void setDireccionOrigen(String direccionOrigen) throws DireccionErroneaException{
		if(this.direccionDestino.toLowerCase().equals(direccionOrigen.toLowerCase())) {
			throw new DireccionErroneaException("La direccion de origen no puede ser igual a la de destino");
		}
		this.direccionOrigen = direccionOrigen;
	}
	
	public String getDireccionDestino() {
		return direccionDestino;
	}
	
	public void setDireccionDestino(String direccionDestion) throws DireccionErroneaException{
		if(direccionDestion.toLowerCase().equals(direccionOrigen.toLowerCase())) {
			throw new DireccionErroneaException("La direccion de origen no puede ser igual a la de destino");
		}
		this.direccionDestino = direccionDestion;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) throws PesoNoValidoException{
		if(peso < 0) {
			throw new PesoNoValidoException("El peso no puede ser menor a cero");
		}
		this.peso = peso;
	}

	public Registro getRegistro() {
		return registro;
	}

	public void setRegistro(Registro registro) {
		this.registro = registro;
	}

	public boolean pesaMasDe(double peso) throws PesoNoValidoException{
		if(peso < 0) {
			throw new PesoNoValidoException("El peso no puede ser menor a cero");
		}
		return peso < this.peso;
	}

	@Override
	public String toString() {
		return "Paquete [numeroSeguimiento=" + numeroSeguimiento + ", direccionOrigen=" + direccionOrigen
				+ ", direccionDestino=" + direccionDestino + ", peso=" + peso + "]\n";
	}
	
	
	
}
