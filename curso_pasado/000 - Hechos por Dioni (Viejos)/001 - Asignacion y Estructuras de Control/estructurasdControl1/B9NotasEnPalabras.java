package estructurasdControl1;

import java.util.Scanner;

public class B9NotasEnPalabras {

	public static void main(String[] args) {
		Scanner T = new Scanner(System.in);
		int nota;
		System.out.println("Introduce la nota: ");
		nota = T.nextInt();
		switch (nota) {
		case 0:
			System.out.println("Cero");
		case 1:
			System.out.println("Uno");
		case 2:
			System.out.println("Dos");
		case 3:
			System.out.println("Tres");
		case 4:
			System.out.println("Cuatro");
		case 5:
			System.out.println("Cinco");
		case 6:
			System.out.println("Seis");
		case 7:
			System.out.println("Siete");
		case 8:
			System.out.println("Ocho");
		case 9:
			System.out.println("Nueve");
		case 10:
			System.out.println("Diez");
		}
	}
}
