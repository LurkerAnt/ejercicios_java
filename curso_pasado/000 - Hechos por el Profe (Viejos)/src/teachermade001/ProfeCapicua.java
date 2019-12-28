package teachermade001;

import java.util.Scanner;

public class ProfeCapicua {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int numero;
		int unidades;
		int decenas;
		int centenas;
		int miles;
		int numeroinicial;
		boolean capicua = false;

		System.out.println("Da el valor del número: ");
		numero = teclado.nextInt();
		numeroinicial = numero;

		if (numero >= 0 && numero <= 9999) {
			if (numeroinicial < 10)
				capicua = true;
			else {
				unidades = numero % 10;
				numero = numero / 10;
				decenas = numero % 10;
				numero = numero / 10;
				if (numeroinicial < 100) {
					if (unidades == decenas)
						capicua = true;
				} else {
					centenas = numero % 10;
					numero = numero / 10;
					if (numeroinicial < 1000) {
						if (unidades == centenas)
							capicua = true;
					} else {
						miles = numero % 10;
						numero /= 10;
						if ((unidades == miles) && (decenas == centenas))
							capicua = true;
					}
				}
				if (capicua == true)
					System.out.println(numeroinicial + " es capicua");
				else
					System.out.println(numeroinicial + " no es capicua");
			}

			teclado.close();

		} else
			System.out.println("error entrada");
	}

}
