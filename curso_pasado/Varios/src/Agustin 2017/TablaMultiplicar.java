import java.util.Scanner;

public class TablaMultiplicar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int mdo;
		int mdor;
		int resultado;
		String salida;

		int primera;
		int ultima;

		do {
			System.out.print("Primera: ");
			primera = Math.abs(teclado.nextInt());
			System.out.print("Última: ");
			ultima = Math.abs(teclado.nextInt());
			
			if (primera > ultima) {
				int aux = primera;
				primera = ultima;
				ultima = aux;
			}
			if (ultima - primera + 1 > 10)
				System.out.println("Valores incorrectos. Otra vez ...");
		} while (ultima - primera + 1 > 10);
	
		for (mdo = primera; mdo <= ultima; mdo++) {
			System.out.println("Tabla del " + mdo);
			for (mdor = 1; mdor <= 10; mdor++) {
				resultado = mdo * mdor;
				salida = "%3d * %3d = %3d";
				System.out.printf(salida, mdo, mdor, resultado);
				System.out.println();
			}
			System.out.println();
		}
		// salida= mdo + " * " + mdor + " = " + resultado;
		// System.out.println(salida);

		/*
		 * 
		 * 1 * 1 = 1 1 * 2 = 2 1 * 3 = 3 ... 1 * 10 = 10
		 * 
		 */
		/*
		 * 
		 * 2 * 1 = 1 2 * 2 = 2 2 * 3 = 3 ... 2 * 10 = 10
		 * 
		 */

		/*
		 * 
		 * 3 * 1 = 1 3 * 2 = 2 3 * 3 = 3 ... 3 * 10 = 10
		 * 
		 */

		/*
		 * 
		 * 7 * 1 = 7 7 * 2 = 14 7 * 3 = 21 ... 7 * 10 = 70
		 * 
		 */

		/*
		 * 
		 * 10 * 1 = 1 10 * 2 = 2 10 * 3 = 3 ... 10 * 10 = 10
		 * 
		 */

	}

}
