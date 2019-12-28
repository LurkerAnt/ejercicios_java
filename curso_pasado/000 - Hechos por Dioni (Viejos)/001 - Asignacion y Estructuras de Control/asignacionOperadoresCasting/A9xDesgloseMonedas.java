package asignacionOperadoresCasting;
//9.	Programa que lee una cantidad de dinero y la desglosa en las monedas de 1, 5, 10, 20 y 50 euros.

import java.util.Scanner;

public class A9xDesgloseMonedas {

	public static int division(int cantidad) {
		int billete;
		billete = 0;
		if (cantidad > 50) {
			billete = cantidad / 50;
		} else {
			if (cantidad < 50 && cantidad > 20) {
				billete = cantidad / 20;
			} else {
				if (cantidad < 20 && cantidad > 10) {
					billete = cantidad / 10;
				}

				else {
					if (cantidad < 10 && cantidad > 5) {
						billete = cantidad / 5;
					}

					else {
						if (cantidad < 5 && cantidad >= 2) {
							billete = cantidad / 2;
						}
					}
				}
			}
		}
		System.out.println(billete);
		return billete;

	}

	public static int resto(int cantidad) {
		int billete;
		billete = 0;
		if (cantidad > 50) {
			billete = cantidad % 50;
		} else {
			if (cantidad < 50 && cantidad > 20) {
				billete = cantidad % 20;
			} else {
				if (cantidad < 20 && cantidad > 10) {
					billete = cantidad % 10;
				}

				else {
					if (cantidad < 10 && cantidad > 5) {
						billete = cantidad % 5;
					}

					else {
						if (cantidad < 5 && cantidad >= 2) {
							billete = cantidad % 2;
						}
					}
				}
			}
		}
		System.out.println(billete);
		return billete;

	}

	public static int restoDos(int cantidad) {
		cantidad = cantidad % 2;
		return cantidad;
	}

	public static void main(String[] args) {
		Scanner T = new Scanner(System.in);
		int cantidad, uno, dos, cinco, diez, veinte, cincuenta, cantAux;

		System.out.println("introduce la cantidad: ");
		cantidad = T.nextInt();
		cantAux = cantidad;

		cincuenta = division(cantidad);
		cantidad = resto(cantidad);

		veinte = division(cantidad);
		cantidad = resto(cantidad);

		diez = division(cantidad);
		cantidad = resto(cantidad);

		cinco = division(cantidad);
		cantidad = resto(cantidad);

		dos = division(cantidad);
		cantidad = restoDos(cantidad);

		uno = cantidad;

		System.out.printf(
				"En %d€ hay %d Billetes de 50, %d billetes de 20, %d billetes de 10, %d billetes de 5, %d monedas de 2, %d monedas de 1",
				cantAux, cincuenta, veinte, diez, cinco, dos, uno);
	}

}
