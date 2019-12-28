package a03XbuclesDecisiones;

/**
 * 19. Generar la lista de los divisores de un número N introducido por teclado.
 * @author Dionisio Fernández Ortiz
 *
 */
import java.util.Scanner;

public class B09xDivisoresDeN {

	public static void main(String[] args) {
		int numero, numeroAux, divisor;
		Scanner t = new Scanner(System.in);
		System.out.println("Dame un número: ");
		numero = t.nextInt();
		numeroAux = numero;
		System.out.printf("Los divisores del número %d son: \n", numeroAux);
		for (divisor = 1; divisor <= numero / 2; divisor++) {
			if (numero % divisor == 0)
				System.out.println(divisor);
		}
		t.close();

	}

}
