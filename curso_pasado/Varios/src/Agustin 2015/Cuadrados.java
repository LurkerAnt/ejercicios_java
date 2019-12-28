package bucles;

import java.util.Scanner;

public class Cuadrados {

	public static void main(String[] args) {
		int numero;
		int fin;
		Scanner t= new Scanner(System.in);
		
		System.out.print("Fin: ");
		fin= t.nextInt();
		
		System.out.println("cuadrados hasta " + fin);
		numero=1;
		while(numero <= fin){
			System.out.println(numero +" al cuadrado " + Math.pow(numero,  1/2d));
			numero++;
		}
	}

}
