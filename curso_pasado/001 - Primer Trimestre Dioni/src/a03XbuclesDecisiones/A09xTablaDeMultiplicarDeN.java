package a03XbuclesDecisiones;

/**
 * 9. Visualiza la tabla de multiplicar de un n�mero N (1..10).z
 * 
 * @author Dionisio Fern�ndez Ortiz
 *
 */

public class A09xTablaDeMultiplicarDeN {

	public static void main(String[] args) {
		int multiplicador, multiplicando, producto;
		for (multiplicando = 0; multiplicando <= 10; multiplicando++) {
			for (multiplicador = 1, producto = 0; multiplicador <= 10; multiplicador++) {
				producto = multiplicando * multiplicador;
				System.out.printf("%3d *%3d =%4d\n", multiplicando, multiplicador, producto);
			}
		}
	}

}
