package banco;

import java.util.Calendar;

/*
Nota 1: Al imprimir por pantalla un Titular saldrá su nombre, apellidos y edad. 
Nota 2: Para comparar dos String utiliza compareTo(String) que devuelve 0 si son iguales.
 */

public class Cuenta {

	/*
	 * Los atributos private: uno de tipo Titular, otro de tipo fecha (fecha de
	 * apertura), otro de tipo String (el número de cuenta) y el otro de tipo double
	 * (el saldo). Asegúrate de que la fecha es correcta.
	 */
	private Titular titularCuenta;
	private Fecha fechaAperturaCuenta;
	private String numeroCuenta;
	private Double saldoCuenta;

	// Un constructor con parámetros de tipo Titular, String, Fecha y double.

	public Cuenta(Titular titularNuevo, Fecha fechaApertura, String numeroDeCuenta, Double saldoDeCuenta) {
		this.titularCuenta = titularNuevo;
		this.fechaAperturaCuenta = fechaApertura;
		this.numeroCuenta = numeroDeCuenta;
		this.saldoCuenta = saldoDeCuenta;
	}

	// Un constructor con parámetros de tipo Titular, y String. El saldo se
	// inicializará a un mínimo establecido.

	public Cuenta(Titular titularNuevo, String numeroDeCuenta) {
		this.titularCuenta = titularNuevo;
		this.fechaAperturaCuenta = new Fecha(Calendar.DAY_OF_MONTH, Calendar.MONTH, Calendar.YEAR);
		this.numeroCuenta = numeroDeCuenta;
		this.saldoCuenta = 0.0;
	}

	// Un getter para cada uno de los atributos.

	public Titular getTitular() {
		return this.titularCuenta;
	}

	public Fecha getFechaAperturaCuenta() {
		return this.fechaAperturaCuenta;
	}

	public String getNumeroDeCuenta() {
		return this.numeroCuenta;
	}

	public Double getSaldoCuenta() {
		return this.saldoCuenta;
	}

	// Un setter solo para el saldo.

	public void setSaldoCuenta(Double saldo) {
		this.saldoCuenta = saldo;
	}

	// Un método ingresar que incremente el saldo en una cantidad.

	public void ingresarDineroCuenta(Double dineroParaIngresar) {
		Movimiento ingreso = new Movimiento('i', dineroParaIngresar);
		this.saldoCuenta += ingreso.getSaldoCuenta();

	}

	// Un método reintegro que decremente el saldo en una cantidad.
	// Sólo si hay saldo.

	public void retirarDineroCuenta(Double cantidadParaRetirar) {

		if (this.saldoSuficiente(cantidadParaRetirar) == true) {
			Movimiento retirada = new Movimiento('r', cantidadParaRetirar);
			this.saldoCuenta += retirada.getSaldoCuenta();
		} else if (this.saldoSuficiente(cantidadParaRetirar) == false) {
			System.out.println("Saldo Insuficiente Para Realizar Operacion.");
		}

	}

	public boolean saldoSuficiente(Double cantidadParaRetirar) {
		if (this.saldoCuenta - cantidadParaRetirar >= 0) {
			return true;
		} else {
			return false;
		}
	}

	// Método para hacer una transferencia a otra cuenta.
	// Los parámetros son la cuenta destino y el importe.

	public void realizarTransferencia(Cuenta cuentaDestino, Double importeTransferencia) {
		if (this.saldoSuficiente(importeTransferencia) == true) {
			this.retirarDineroCuenta(importeTransferencia);
			cuentaDestino.ingresarDineroCuenta(importeTransferencia);
		} else {
			System.out.println("Saldo Insuficiente Para Realizar Operacion.");
		}
	}

	// Método para recibir una transferencia desde otra cuenta.
	// Los parámetros son la cuenta origen y el importe.

	public void recibirTransferencia(Cuenta cuentaOrigen, Double importeTransferencia) {
		if (cuentaOrigen.saldoSuficiente(importeTransferencia) == true) {
			cuentaOrigen.retirarDineroCuenta(importeTransferencia);
			this.ingresarDineroCuenta(importeTransferencia);
		} else {
			System.out.println("Saldo Insuficiente Para Realizar Operacion.");
		}
	}

	// Un método para que al imprimir la cuenta salga por pantalla el número de
	// cuenta y su saldo.

	@Override

	public String toString() {
		return "Número de cuenta: " + this.numeroCuenta + "\n Nombre del Titular: " + this.titularCuenta.getNombre()
				+ "\n Apellidos del Titular: " + this.titularCuenta.getApellidos() + "\n Edad Titular: "
				+ this.titularCuenta.getEdad() + "\n Saldo de la cuenta: " + this.saldoCuenta;
	}

	// Un método para comparar cuentas, sabiendo que dos cuentas serán iguales si
	// sus números de cuenta son iguales.

	public boolean compararConCuenta(Cuenta cuentaParaComparar) {
		if (this.numeroCuenta.compareTo(cuentaParaComparar.numeroCuenta) == 0) {
			return true;
		} else {
			return false;
		}
	}
}
