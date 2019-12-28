package a01xAsignacionOperadoresCastingViejos;

import java.util.Scanner;

public class A09xDesgloseDineroProfe {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int cantidad, auxiliar;
		int m1;
		int m2;
		int m5;
		int m50;

		System.out.println("Da catidad de dinero: ");
		cantidad = teclado.nextInt(); // 9756;
		auxiliar = cantidad;

		m50 = cantidad / 50;
		cantidad = cantidad % 50;

		m5 = cantidad / 5;
		cantidad = cantidad % 5;

		m2 = cantidad / 2;
		cantidad = cantidad % 2;

		m1 = cantidad;
		System.out.println(auxiliar);
		System.out.println(m50);
		System.out.println(m5);
		System.out.println(m2);
		System.out.println(m1);
		teclado.close();
	}

}
