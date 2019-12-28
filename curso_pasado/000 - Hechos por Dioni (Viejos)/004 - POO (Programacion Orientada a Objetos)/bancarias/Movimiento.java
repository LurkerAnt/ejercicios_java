package bancarias;

public class Movimiento {
	private int movimiento;
	private int importe;
	private int saldo;

	public int getMovimiento() {
		return movimiento;
	}

	public void setMovimiento(int movimiento) {
		this.movimiento = movimiento;
	}

	public int getImporte() {
		return importe;
	}

	public void setImporte(int importe) {
		this.importe = importe;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public int realizarMovimiento(int cantidad) {
		int saldo;
		if (getSaldo() + cantidad > 0)
			;
		{
			saldo = getSaldo() + cantidad;
			return saldo;
		}

	}
}
