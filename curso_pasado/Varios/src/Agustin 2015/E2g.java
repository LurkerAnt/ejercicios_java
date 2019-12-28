package alternativas;
import java.util.Scanner;

public class E2g {

	public static void main(String[] args) {
		float a = 0, b = 2, c = -1;
		float x1, x2;
		float baseRaiz;
		Scanner t = new Scanner(System.in);
		System.out.print("Valor del 1er coeficiente: ");
		a= t.nextInt();		
		System.out.print("Valor del 2do coeficiente: ");
		b= t.nextInt();
		System.out.print("Valor del 3er coeficiente: ");
		c= t.nextInt();
		
		if (a == 0)
			System.out.println(" no es de 2 g");
		else {
			baseRaiz = b * b - 4 * a * c;
			System.out.println("E 2 g");
			if (baseRaiz < 0)
				System.out.println("Raices imaginarias.");
			else if (baseRaiz == 0) {
				x1 = x2 = -b / (2 * a);
				System.out.printf("Raices iguales: %.2f", x1);
			} else {
				float raiz = (float) Math.pow(baseRaiz, 1 / 2d);
				x1 = (-b + raiz) / (2 * a);
				x2 = (-b - raiz) / (2 * a);
				System.out.printf("\nRaiz positiva: %.2f", x1);
				System.out.printf("\nRaiz negativa: %.2f", x2);
			}
		}
	}

}
