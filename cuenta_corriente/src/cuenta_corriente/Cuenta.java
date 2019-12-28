package cuenta_corriente;
import java.util.Scanner;

/*
 * Se pide hacer una clase Cuenta que tenga un saldo en un momento dado y sobre la que se pueda ingresar, extraer y cargarRecibo.
 * */
public class Cuenta {
	Scanner teclado= new Scanner (System.in);
	private Double saldoCuenta;
	
	public Cuenta(){
		this.saldoCuenta=0.0;
	}
	
	public Cuenta (Double saldo) {
		this.saldoCuenta=saldo;
	}
	
	//Se pide representar el saldo de la cuenta mediante un int que exprese su valor en céntimos.
	
	public Integer getSaldoCuentaEnCentimos() {
		return this.saldoCuenta.intValue();
	}
	
	public Double getSaldoCuenta() {
		return saldoCuenta;
	}
	
	public void setSaldoCuenta() {
		System.out.println("Dame el saldo inicial de la cuenta:");
		this.saldoCuenta=Double.parseDouble(teclado.next());
	}
	
	public void setSaldoCuenta(Double saldoCuenta) {
		this.saldoCuenta = saldoCuenta;
	}

	public void ingrearDinero(Double ingreso) {
		this.saldoCuenta += ingreso;
	}

	public void extraerDinero(Double extracto) {
		try {
			if (this.saldoCuenta - extracto >= 0) {
				this.saldoCuenta -= extracto;
			} else {
				throw new RuntimeException("Saldo insuficiente en la cuenta.");
			}
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}

	public void cargarRecibo(Double recibo) {
		try {
			if (this.saldoCuenta - recibo >= 0) {
				this.saldoCuenta -= recibo;
			} else {
				throw new RuntimeException("Saldo insuficiente en la cuenta.");
			}
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}

}
