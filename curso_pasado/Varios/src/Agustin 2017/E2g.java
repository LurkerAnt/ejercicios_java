import java.util.Scanner;

/**
 * Pedir los coeficientes de una ecuación se 2o grado, y muestre sus soluciones
 * reales. Si no existen, debe indicarlo.
 * 
 * @author profesor
 *
 */
public class E2g {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a, b, c, base;
		float x1, x2;
		System.out.println("INtro los coef");
		a = teclado.nextInt();
		b = teclado.nextInt();
		c = teclado.nextInt();

		if (a == 0)
			System.out.println("NO es una ec 2 grado");
		else {
			base = b * b - 4 * a * c;
			if (base < 0)
				System.out.println("R imaginarias");
			else if (base == 0) {
				x1 = x2 = -b / (2 * a);
				System.out.println("raices iguales: " + x1);
			} else {
				x1 = (float) (-b + Math.pow(base, 1 / 2d)) / (2 * a);
				x2 = (float) (-b - Math.pow(base, 1 / 2d)) / (2 * a);
				// if(x1==x2)

				System.out.println("R positiva: " + x1);
				System.out.println("R negativa: " + x2);
			}
		}

	}

}
