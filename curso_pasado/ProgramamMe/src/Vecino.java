
import java.util.Scanner;

public class Vecino {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int casos;
		int p, bomba1, bomba2, dist;

		casos = teclado.nextInt();
		while (casos > 0) {
			dist = 0;
			p = teclado.nextInt();
			bomba1 = teclado.nextInt();
			bomba2 = teclado.nextInt();

			// System.out.printf(" %d, %d, %d\n", p, bomba1, bomba2);

			// Busca y visualiza los resultados

			if (bomba1 > bomba2) {
				dist += bomba1 - bomba2;
			} else {
				dist += bomba2 - bomba1;
			}

			if (p > bomba1) {
				dist += p - bomba1;
			} else {
				dist += bomba1 - p;
			}

			System.out.printf("%d\n", dist);

			casos--;
		}
	}

	/*
	 * 2 100 150 200 300 100 700
	 */

}
