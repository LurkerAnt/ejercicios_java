package secuenciales;
import java.util.Scanner;


public class Cuadrado {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		float n;
		String cadena;
		System.out.print("Da el número: ");
		n= teclado.nextFloat();
		//n= Float.parseFloat(cadena);
		System.out.println(n * n);		
	}

}
