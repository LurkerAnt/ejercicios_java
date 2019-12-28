package teachermade002;

import java.util.Scanner;

public class TablasMult {

	public static void main(String[] args) {
		int mdo;
		int mdor;
		int resultado;
		int multiplicadoraux;
		int multiplicandoaux;
		int primerofor;
		String salida;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce la primera tabla: ");
		multiplicadoraux = teclado.nextInt();
		System.out.println("Introduce la última tabla: ");
		multiplicandoaux = teclado.nextInt();
		for (primerofor = multiplicadoraux; primerofor <= multiplicandoaux; primerofor++) {
			System.out.println("Tabla del: " + multiplicadoraux);
			for (mdor = 1; mdor <= 10; mdor++) {
				mdo = primerofor;
				resultado = mdo * mdor;
				salida = "%3d * %3d = %d\n";
				System.out.printf(salida, mdo, mdor, resultado);
			}

		}

	}

}