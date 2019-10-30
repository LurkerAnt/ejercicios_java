package cuenta_corriente;

import java.util.Scanner;

public class CuentaVip {
	Scanner teclado = new Scanner(System.in);
	private Double saldoCuenta;

	public CuentaVip() {
		this.saldoCuenta = 0.0;
	}

	public CuentaVip(Double saldo) {
		this.saldoCuenta = saldo;
	}

	// Se pide representar el saldo de la cuenta mediante un int que exprese su
	// valor en céntimos.

	public Integer getSaldoCuentaEnCentimos() {
		return this.saldoCuenta.intValue();
	}

	public Double getSaldoCuenta() {
		return saldoCuenta;
	}

	public void setSaldoCuenta() {
		System.out.println("Dame el saldo inicial de la cuenta:");
		this.saldoCuenta = Double.parseDouble(teclado.next());
	}

	public void setSaldoCuenta(Double saldoCuenta) {
		this.saldoCuenta = saldoCuenta;
	}

	public void ingrearDinero(Double ingreso) {
		this.saldoCuenta += ingreso;
	}

	public void extraerDinero(Double extracto) {
		try {
			if (this.saldoCuenta - extracto >= -100) {
				this.saldoCuenta = this.saldoCuenta - extracto;
			} else {
				throw new RuntimeException("Descubierto superado.");
			}
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}

	public void cargarRecibo(Double recibo) {
		try {
			if (this.saldoCuenta - recibo >= -100) {
				this.saldoCuenta = this.saldoCuenta - recibo;
			} else {
				throw new RuntimeException("Descubierto superado.");
			}
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}

}
