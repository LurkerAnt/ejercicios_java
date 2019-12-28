package alternativas;
public class Positivo {

	public static void main(String[] args) {
		int numero = 0;
		System.out.println("comp");

		if (numero > 0 && numero <= 10)
			System.out.println(numero + " es + 10");
		else if (numero >= 0 && numero < 200000) {
			System.out.println(numero + " es 20");
		} else if (numero >= 20 && numero < 30) {
			System.out.println(numero + " es 30");
		} else if (numero >= 30 && numero < 40) {
			System.out.println(numero + " es 40");
		} else
			System.out.println(numero + " es >40");

		System.out.println("sigue");
	}

}
