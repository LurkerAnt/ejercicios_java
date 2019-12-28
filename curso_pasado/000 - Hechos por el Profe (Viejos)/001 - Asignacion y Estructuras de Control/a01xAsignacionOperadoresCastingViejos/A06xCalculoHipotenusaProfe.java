package a01xAsignacionOperadoresCastingViejos;

import java.util.Scanner;

public class A06xCalculoHipotenusaProfe {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int cl, c2;
		float h;
		System.out.println("Dame valor para el primer cateto: ");
		cl = t.nextInt();
		System.out.println("Dame el valor del segundo cateto: ");
		c2 = t.nextInt();
		h = (float) Math.pow((Math.pow(cl, 2) + Math.pow(c2, 2)), 1 / 2f);
		t.close();
		System.out.println("Hipotenusa: " + h);
		t.close();
		/*
		 * Scanner T= new Scanner(System.in); int cateto1, cateto2; double hipotenusa;
		 * 
		 * System.out.println("Introduce el valor del primer cateto: ");
		 * cateto1=T.nextInt();
		 * System.out.println("Introduce el valor del segundo cateto: ");
		 * cateto2=T.nextInt();
		 * 
		 * hipotenusa= Math.pow(cateto1, 2) + Math.pow(cateto2, 2);
		 * hipotenusa=Math.sqrt(hipotenusa);
		 * 
		 * System.out.printf("La hipotenusa es %.3f", hipotenusa);
		 */

		/*
		 * Scanner t= new Scanner(System.in); int c1, c2; float h;
		 * System.out.println("1 cateto: "); c1= t.nextInt();
		 * System.out.println("2 cateto: "); c2= t.nextInt(); h= (float)
		 * Math.pow((Math.pow(c1, 2) + Math.pow(c2, 2)), 1/2f); System.out.println("h= "
		 * + h); }
		 */
	}

}
