package estructurasdControl2;

import java.util.Scanner;

//Pedir n�meros hasta que se teclee uno negativo, y mostrar cu�ntos n�meros se han introducido.
public class A3PedirNumeroHastaNegativo {

	public static void main(String[] args) {
		int numero, contador;
		Scanner T = new Scanner(System.in);
		System.out.println("Introduce un n�mero: ");
		numero = T.nextInt();
		contador = 0;
		while (numero >= 0) {
			contador++;
			System.out.println();
			System.out.println("Introduce otro n�mero: ");
			numero = T.nextInt();
			if (numero < 0) {
				System.out.printf("Se han introducido %d n�meros positivos.", contador);
			}
		}

	}

}
