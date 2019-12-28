package asignacionOperadoresCasting;

public class A7xEstructuraBucleFor {

	public static void main(String[] args) {
		int mdo, mdor, producto, contador;

		for (mdo = 1; mdo <= 10; mdo++) {
			System.out.println("Tabla de multiplicar: " + " " + mdo);
			for (mdor = 1; mdor <= 10; mdor++) {
				producto = 0;
				for (contador = 1; contador <= mdor; contador++) {
					producto += mdo;
				}
				System.out.printf("%3d *%3d =%4d\n", mdo, mdor, producto);
			}
		}
	}
}

/*
 * for(inicialización;condición;modificación) { Este ejercicio es igual que
 * A6xTablasMultiplicarWhile pero usando bucles for. En un bucle for se sabe
 * exactamente el numero de iteraciones que va a dar el bucle.
 */
