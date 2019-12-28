package secuenciales;
import java.util.Scanner;


public class Hipotenusa {
	public static void main(String[] s){
		Scanner teclado= new Scanner(System.in);
		int c1;
		int c2;
		double hipotenusa;
		System.out.print("Valor de primer cateto: ");
		c1= teclado.nextInt();
		System.out.print("Valor de segundo cateto: ");
		c2= teclado.nextInt();
		hipotenusa= Math.sqrt(((c1 * c1) + (c2 * c2)));
		hipotenusa= Math.pow(Math.pow(c1, 2) + c2 * c2, 1/2d);
		hipotenusa= Math.hypot(c1, c2);
		System.out.println("la hip cuyos catetos son " + c1 + " y " + c2 + " es " + hipotenusa );
		System.out.printf("la hip cuyos catetos son %d y %d es %f", c1, c2, hipotenusa );
		System.out.println("la suma de los catetos es " + c1 * c2);
	}
}
