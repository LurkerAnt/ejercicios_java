package a02XvariablesDecisiones;

/**
 * 19. Pedir una nota numérica entera entre 0 y 10, y mostrar dicha nota de la forma: cero, uno, dos, tres... 
 * @author Dionisio Fernández Ortiz
 *
 */

import java.util.Scanner;

public class B09xNotasLetras {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int nota;
		System.out.println("Dame una nota: ");
		nota = teclado.nextInt();
		switch (nota) {
		case 0:
			System.out.println("Cero.");
		case 1:
			System.out.println("Uno.");
		case 2:
			System.out.println("Dos.");
		case 3:
			System.out.println("Tres.");
		case 4:
			System.out.println("Cuatro.");
		case 5:
			System.out.println("Cinco.");
		case 6:
			System.out.println("Seis.");
		case 7:
			System.out.println("Siete.");
		case 8:
			System.out.println("Ocho.");
		case 9:
			System.out.println("Nueve.");
		case 10:
			System.out.println("Diez.");
		}

		teclado.close();
	}

}
