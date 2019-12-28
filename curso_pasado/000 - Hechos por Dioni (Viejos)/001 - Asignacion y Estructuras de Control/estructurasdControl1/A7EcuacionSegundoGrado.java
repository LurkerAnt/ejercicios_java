package estructurasdControl1;

//Pedir los coeficientes de una ecuación se 2o grado, y muestre sus soluciones reales. Si no existen, debe indicarlo.
import java.util.Scanner;

public class A7EcuacionSegundoGrado {

	public static void main(String[] args) {

		int resultado1, resultado2, coeficienteA, coeficienteB, coeficienteC, raiz;

		Scanner T = new Scanner(System.in);

		System.out.println("Inserte el coeficiente A: ");
		coeficienteA = T.nextInt();
		System.out.println("Inserte el coeficiente B: ");
		coeficienteB = T.nextInt();
		System.out.println("Inserte el coeficiente C: ");
		coeficienteC = T.nextInt();

		raiz = (int) Math.pow(coeficienteB, 2) - (4 * (coeficienteA * coeficienteC));

		if (raiz < 0) {
			System.out.println("No hay resultados reales.");
		}

		else {
			resultado1 = (int) (-coeficienteB + Math.sqrt(raiz)) / (2 * coeficienteA);
			resultado2 = (int) (-coeficienteB - Math.sqrt(raiz)) / (2 * coeficienteA);

			System.out.printf("Los resultados son: %d y %d", resultado1, resultado2);

		}

	}
}
