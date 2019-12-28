package banco;

/*
 * **Desarrolla una clase llamada Movimiento que tenga:

Los atributos fecha (Fecha o Date), tipo de movimiento (char (R o I)), importe (real) y saldo (real). 
Constructor que inicialice y cree el objeto. Asegúrate de que la fecha es correcta. 
Otros que creas que puedes necesitar.

 */

import java.util.Scanner;

public class Movimiento {
	
	Scanner teclado= new Scanner (System.in);
	private Fecha fechaTransaccion;
	private Character tipoMovimiento;
	private Double importeMovimiento;
	private Double saldoCuenta;
	
	
	public Movimiento (Fecha fechaTransaccion, Character tipoMov, Double importeMov) {
		this.fechaTransaccion=fechaTransaccion;
		this.tipoMovimiento=tipoMov;
		this.importeMovimiento=importeMov;
		this.setSaldoCuenta(this.tipoMovimiento, this.importeMovimiento);
	}
	
	public Movimiento(Character tipoMov, Double importeMov) {
		this.fechaTransaccion= new Fecha();
		this.tipoMovimiento=tipoMov;
		this.importeMovimiento=importeMov;
		this.setSaldoCuenta(this.tipoMovimiento, this.importeMovimiento);
	}
	
	public Movimiento() {
		this.fechaTransaccion= new Fecha();
		this.setTipoMovimiento();
		this.setImporteMovimiento();
		this.setSaldoCuenta(this.tipoMovimiento, this.importeMovimiento);
		}
	
	public void setFechaTransaccion(Fecha fecha) {
		this.fechaTransaccion=fecha;
	}
	
	public void setFechaTransaccion() {
		this.fechaTransaccion=new Fecha();
	}
	
	public Fecha getFechaTransaccion() {
		return this.fechaTransaccion;
	}
	
	public void setTipoMovimiento(Character tipoMov) {
		this.tipoMovimiento=tipoMov;
	}
	
	public void setTipoMovimiento() {
		System.out.println("¿Que tipo de Movimiento es, una Retirada o un Ingreso?");
		this.tipoMovimiento=teclado.next().charAt(0);
	}
	
	public Character getTipoMovimiento() {
		return this.tipoMovimiento;
	}
	
	public void setSaldoCuenta(Double saldo) {
		this.saldoCuenta=saldo;
	}
	
	public void setSaldoCuenta(Character tipoTrans, Double saldoTrans) {
		tipoTrans=Character.toLowerCase(tipoTrans);
		if(tipoTrans.compareTo('r')==0) {
			this.saldoCuenta-=saldoTrans;
		} else if (tipoTrans.compareTo('i')==0) {
			this.saldoCuenta+=saldoTrans;
		}
	}
	
	public Double getSaldoCuenta() {
		return this.saldoCuenta;
	}
	
	public Double getSaldoCuenta(Character tipoTrans, Double saldoTrans) {
		tipoTrans=Character.toLowerCase(tipoTrans);
		if(tipoTrans.compareTo('r')==0) {
			this.saldoCuenta-=saldoTrans;
		} else if (tipoTrans.compareTo('i')==0) {
			this.saldoCuenta+=saldoTrans;
		}
		
		return this.saldoCuenta;
	}
	
	public void setImporteMovimiento() {
		System.out.println("¿Cual es el importe de la transacción?");
		this.importeMovimiento=teclado.nextDouble();
	}
	
	public Double getImporteMovimiento() {
		return this.importeMovimiento;
	}
	
}

