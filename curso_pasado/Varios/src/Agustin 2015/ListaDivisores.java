
package bucles;

import java.util.Scanner;

/**
 * Lista los Divisores de un número
 * @author profesor
 *
 */
public class ListaDivisores {

	public static void main(String[] args) {
		Scanner t= new Scanner(System.in);
		int n;
		System.out.println("introduce un numero");
		n= t.nextInt();
		System.out.println("los divisores de " + n);
		for(int divisor= 1; divisor <= n / 2; divisor++){
			if(n % divisor == 0)
				System.out.println(divisor);
		}
		System.out.println(n);
	}

}









