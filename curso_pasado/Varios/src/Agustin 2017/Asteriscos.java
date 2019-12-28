
public class Asteriscos {
	static int pinta(int altura) {
		//int altura = 20;
		for (int fila = altura; fila >= 1; fila--) {
			for (int columna = 1; columna <= fila; columna++) {
				System.out.print("*");
			}
			System.out.println();
		}
		return altura;
	}

	public static void main(String[] args) {
		int altura;
		String cadenaAsteriscos;

		cadenaAsteriscos = "*";
		altura = 10;
		for (int fila = 1; fila <= altura; fila++) {
			System.out.println(cadenaAsteriscos);
			cadenaAsteriscos = cadenaAsteriscos + "*";
		}

		altura = 10;
		for (int fila = 1; fila <= altura; fila++) {
			int columna = 1;
			while (columna <= fila) {
				System.out.print("*");
				columna++;
			}
			System.out.println();
		}
		altura = 10;
		for (int fila = 1; fila <= altura; fila++) {
			for (int columna = 1; columna <= fila; columna++) {
				System.out.print("*");
			}
			System.out.println();
		}

		altura = 10;
		for (int fila = 1; fila <= altura; fila++) {
			for (int columna = altura; columna >= fila; columna--) {
				System.out.print("*");
			}
			System.out.println();
		}

		int posicion;
		altura = 10;

		for (int fila = 1; fila <= altura; fila++) {
			for (int columna = 1; columna <= altura; columna++) {
				if (columna == fila || columna + fila == altura + 1)
					System.out.print("+");
				else
					System.out.print("*");
				/*
				 * if(columna + fila == altura + 1) System.out.print("+"); else
				 * System.out.print("*");
				 */
			}

			System.out.println();
		}
		System.out.println(pinta(30));
	}

}
