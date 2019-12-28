package a03XbuclesDecisiones;

/**
 * 10. Escribe las tablas de multiplicar del 1 al 10.
 * 
 * @author Dionisio Fernández Ortiz
 *
 */
public class A10xTablaMultiplicarUnoDiez {

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
