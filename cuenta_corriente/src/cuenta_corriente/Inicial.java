package cuenta_corriente;

public class Inicial {
	public static void main(String[] Args) {
		CuentaVip cuentaVip1 = new CuentaVip(0.0);
		Cuenta cuenta2 = new Cuenta(0.0);

		cuenta2.ingrearDinero(200.0);
		System.out.println(cuenta2.getSaldoCuenta());
		cuenta2.extraerDinero(250.00);
		System.out.println(cuenta2.getSaldoCuenta());
		cuenta2.ingrearDinero(200.0);
		System.out.println(cuenta2.getSaldoCuenta());
		cuenta2.cargarRecibo(200.0);
		System.out.println(cuenta2.getSaldoCuenta());
		
		
		System.out.println();
		
		cuentaVip1.ingrearDinero(200.0);
		System.out.println(cuentaVip1.getSaldoCuenta());
		cuentaVip1.extraerDinero(200.0);
		System.out.println(cuentaVip1.getSaldoCuenta());
		cuentaVip1.cargarRecibo(80.0);
		System.out.println(cuentaVip1.getSaldoCuenta());
		cuentaVip1.cargarRecibo(80.0);
		System.out.println(cuentaVip1.getSaldoCuenta());

	}
}
