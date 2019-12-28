package teachermade002;

import java.util.Scanner;

public class TablaMultiplicarProfe {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int mdo; // multiplicando
		int mdor; // multiplicador
		int resultado;
		String salida;
		int primera;
		int ultima;
		int aux;

		do {
			System.out.println("Primera: ");
			primera = Math.abs(teclado.nextInt());
			System.out.println("Última: ");
			ultima = Math.abs(teclado.nextInt());
			if (primera > ultima) {
				aux = primera;
				primera = ultima;
				ultima = aux;
			}
			if (ultima - primera + 1 > 10)
				System.out.println("Valores incorrectos. Máximo <=10");
		} while (ultima - primera + 1 > 10);

		for (mdo = primera; mdo <= ultima; mdo++) {
			System.out.println("Tabla del " + mdo);
			for (mdor = 1; mdor <= 10; mdor++) {
				resultado = mdo * mdor;
				salida = "%3d * %3d = %3d\n";
				System.out.printf(salida, mdo, mdor, resultado);
			}
			System.out.println();
		}
	}
}

// System.out.println("Multiplicando: ");
// mdo= teclado.nextInt();

/*
 * mdor= 1; while (mdor <= 10) { resultado= mdo * mdor; //salida = mdo + " * " +
 * mdor + " = " + resultado; //System.out.println(salida); salida = "%3d" +
 * " * " + "%3d" + " = " + "%4d" + "\n";//este %d sustituye a las ARGUMENTOS que
 * deben ser puestas abajo son COMANDOS DE CONTROL/ EL 3 ES EL ANCHO MÍNIMO
 * NECESARIO AKA 4 CARACTERES PUESTOS A LA DERECHA System.out.printf(salida,
 * mdo, mdor, resultado); // el\n hace que no salga todo en la misma linea.
 * salida aqui es la CADENA DE FORMATO mdor++;
 */
