import java.util.Scanner;

/**
 * Programa que calcule la hipotenusa de un triángulo rectángulo cuyos catetos se dan por teclado.
 * @author profesor
 *
 */
public class Pitagoras {

	public static void main(String[] args) {
		Scanner t= new Scanner(System.in);
		int c1, c2;
		float h;
		System.out.println("1 cateto: ");
		c1= t.nextInt();
		System.out.println("2 cateto: ");
		c2= t.nextInt();
		h= (float) Math.pow((Math.pow(c1,  2) + Math.pow(c2, 2)), 1/2f);
		System.out.println("h= " + h);
	}

}
/*
683
el 695 se desglosa en:
50 13 b
20 1 b
10 1
5  1 mil
1  0 euro
*/














