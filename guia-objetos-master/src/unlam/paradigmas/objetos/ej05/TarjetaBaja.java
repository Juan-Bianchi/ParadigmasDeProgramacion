package unlam.paradigmas.objetos.ej05;

public class TarjetaBaja {
	private double saldo;
	private double viajeColectivo = 39.59;
	private double viajeSubte = 34.50;
	private int cantViajesColectivo = 0;
	private int cantViajesSubte = 0;
	
	
	/**
	 * post: saldo de la Tarjeta en saldoInicial.
	 */
	public TarjetaBaja(double saldoInicial) {
		if(saldoInicial < 0) {
			throw new valorNegativoException();
		}
		this.saldo = saldoInicial;
	}

	/**
	 * post: devuelve el saldo actual de la Tarjeta
	 */
	public double obtenerSaldo() {
		return this.saldo;
	}

	/**
	 * post: agrega el monto al saldo de la Tarjeta.
	 */
	public void cargar(double monto) {
		if(monto < 0) {
			throw new valorNegativoException();
		}
		this.saldo += monto;
	}

	/**
	 * pre : saldo suficiente. post: utiliza 39.59 del saldo para un viaje en
	 * colectivo.
	 */
	public void pagarViajeEnColectivo() {
		if(this.saldo < this.viajeColectivo) {
			throw new SaldoInsuficienteException();
		}
		this.saldo -= this.viajeColectivo;
		this.sumarViajesColectivo();
	}

	/**
	 * pre : saldo suficiente. post: utiliza 34.50 del saldo para un viaje en subte.
	 */
	public void pagarViajeEnSubte() {
		if(this.saldo < this.viajeSubte) {
			throw new SaldoInsuficienteException();
		}
		this.saldo -= this.viajeSubte;
		this.sumarViajesSubte();
	}

	/**
	 * post: devuelve la cantidad de viajes realizados.
	 */
	public int contarViajes() {
		return this.cantViajesSubte + this.cantViajesColectivo;
	}

	/**
	 * post: devuelve la cantidad de viajes en colectivo.
	 */
	public int contarViajesEnColectivo() {
		return this.cantViajesColectivo;
	}

	/**
	 * post: devuelve la cantidad de viajes en subte.
	 */
	public int contarViajesEnSubte() {
		return this.cantViajesSubte;
	}
	
	private void sumarViajesSubte() {
		this.cantViajesSubte ++;
	}
	
	private void sumarViajesColectivo() {
		this.cantViajesColectivo ++;
	}

	public double getViajeColectivo() {
		return viajeColectivo;
	}

	public void setViajeColectivo(double viajeColectivo) {
		this.viajeColectivo = viajeColectivo;
	}

	public double getViajeSubte() {
		return viajeSubte;
	}

	public void setViajeSubte(double viajeSubte) {
		this.viajeSubte = viajeSubte;
	}

	
}
