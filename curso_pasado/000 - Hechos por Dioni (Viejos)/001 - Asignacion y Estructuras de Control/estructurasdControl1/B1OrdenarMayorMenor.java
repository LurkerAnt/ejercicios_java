package estructurasdControl1;

import java.util.Scanner;

public class B1OrdenarMayorMenor {

	public static void main(String[] args) {
		int numero1, numero2, numero3, primero, segundo, tercero;
		Scanner T = new Scanner(System.in);
		System.out.println("Introduce el primer n�mero: ");
		numero1 = T.nextInt();
		System.out.println("Introduce el segundo n�mero: ");
		numero2 = T.nextInt();
		System.out.println("Introduce el tercer n�mero: ");
		numero3 = T.nextInt();

		if (numero1 > numero2 && numero1 > numero3) {
			if (numero2 > numero3) {
				primero = numero1;
				segundo = numero2;
				tercero = numero3;
			} else {
				primero = numero1;
				segundo = numero3;
				tercero = numero2;
			}
		} else {
			if (numero2 > numero3) {
				primero = numero2;
				if (numero1 > numero3) {
					segundo = numero1;
					tercero = numero3;
				} else {
					segundo = numero3;
					tercero = numero1;
				}

			} else {
				primero = numero3;
				segundo = numero2;
				tercero = numero1;
			}
		}
		System.out.printf("El n�mero %d es el mayor, el n�mero %d es el segundo mayor y el numero %d es el menor.",
				primero, segundo, tercero);
	}

}
