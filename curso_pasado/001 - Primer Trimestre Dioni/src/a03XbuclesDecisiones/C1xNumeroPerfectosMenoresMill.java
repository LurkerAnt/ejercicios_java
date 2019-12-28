package a03XbuclesDecisiones;

/**
 * Lista los n�meros perfectos menores que 1000. Un n�mero es perfecto si la
 * suma de sus divisores, excepto �l mismo, es igual a propio n�mero.
 * 
 * @author Dionisio Fern�ndez Ortiz
 *
 */

public class C1xNumeroPerfectosMenoresMill {

	public static void main(String[] args) {
		int numero, divisor, acumDivisor;
		System.out.println("Lista de n�meros perfectos menores que 1000: ");
		for (numero = 1; numero <= 1000; numero++) {
			for (acumDivisor = 0, divisor = 1; divisor <= numero / 2; divisor++) {
				if (numero % divisor == 0)
					acumDivisor += divisor;
			}
			if (acumDivisor == numero) {
				System.out.println(numero);
			}
		}
	}

}
