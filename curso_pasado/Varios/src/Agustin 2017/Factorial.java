import java.util.Scanner;

public class Factorial {
	static long factorial(int numero) {
		long factorial = 1;
		
		while (numero > 0) {
			factorial = factorial * numero--;
		}
		return factorial;
	}

	
	public static void main(String[] args) {
		/*
		 * n! 1 n= 0 1*2*3* ... *(n-1)*n n>0 n*(n-1)* ... *3*2*1
		 */
		int numero;
		int factorial;
		int factor;

		numero = 5;
		/*
		 * factorial= 1; factor= 1; while (factor <= numero) { factorial= factorial *
		 * factor; factor++; }
		 */
		factorial = 1;
		factor = numero;
		while (factor > 0) {
			factorial = factorial * factor;
			factor--;
		}
		System.out.printf("%d!= %d", numero, factorial);
		
		System.out.println(factorial(3));
	}

}
