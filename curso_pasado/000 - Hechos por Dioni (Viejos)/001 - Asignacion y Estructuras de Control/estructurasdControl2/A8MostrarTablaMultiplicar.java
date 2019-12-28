package estructurasdControl2;

import java.util.Scanner;

public class A8MostrarTablaMultiplicar {

	public static void main(String[] args) {
		int numero, resultado, multiplicador;
		Scanner T = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		numero = T.nextInt();
		multiplicador = 0;
		System.out.printf("La tabla de multiplicar del %d es: ", numero);
		System.out.println();
		while (multiplicador <= 10) {
			resultado = numero * multiplicador;
			System.out.printf("%d * %d = %d\n", numero, multiplicador, resultado);
			multiplicador++;
		}
	}

}
