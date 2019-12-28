import java.util.Scanner;

public class Metodos {
	public static int aleatorio(int a, int b) {	
		int may= Math.max(a, b);
		int men= Math.min(a, b);
		return (int) (Math.random()*(may - men + 1) + men);
	}
	public static int resto(int ddo, int dsor) {
		if(dsor > 0)
			while(ddo >= dsor)
				ddo = ddo - dsor;
		return ddo;
	}
	public static int entradaInt(String texto) {
		Scanner teclado= new Scanner(System.in);
		int valor;
		System.out.print(texto);
		valor= teclado.nextInt();
		return valor;
	}
}











