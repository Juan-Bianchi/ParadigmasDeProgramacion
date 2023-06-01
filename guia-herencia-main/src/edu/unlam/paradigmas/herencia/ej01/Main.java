package edu.unlam.paradigmas.herencia.ej01;

public class Main {

	public static void main(String[] args) {
		CuentaCorriente miCuenta = new CuentaCorriente(5000);
		System.out.println(miCuenta.getSaldo()); // 0
		miCuenta.depositar(1000, "varios");
		System.out.println(miCuenta.getSaldo()); // 1000
		miCuenta.extraerDinero(550, "extraccion");
		System.out.println(miCuenta.getSaldo()); // 450

		CuentaDeAhorro cuentaOrigen = new CuentaDeAhorro();
		cuentaOrigen.depositar(10000, "varios");
		System.out.println(cuentaOrigen.getSaldo()); // 10000 
		CuentaDeAhorro cuentaDestino = new CuentaDeAhorro();//
		System.out.println(cuentaDestino.getSaldo()); // 0
		cuentaOrigen.transferir(cuentaDestino, 550, "varios");
		System.out.println(cuentaOrigen.getSaldo()); //9450 
		System.out.println(cuentaDestino.getSaldo()); // 550 `
		cuentaOrigen.reservarEnSaldoSecundario(4000);
		System.out.println(cuentaOrigen.getSaldo()); //5450
		
		miCuenta.transferir(cuentaDestino, 1000, "Compra bicicleta");
		System.out.println(miCuenta.getSaldo()); //-550
		System.out.println(cuentaDestino.getSaldo()); // 1550 `
		
		miCuenta.agregarTarjeta(new TarjetaCredito());
		miCuenta.pagarTarjeta(300, "Pago tarjeta de credito");
		System.out.println(miCuenta.getSaldo());
		
	}

}
