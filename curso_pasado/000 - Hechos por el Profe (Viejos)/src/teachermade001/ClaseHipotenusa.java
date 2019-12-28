package teachermade001;

import java.util.Scanner;

public class ClaseHipotenusa {

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
	}

}
