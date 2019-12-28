package teachermade002;

public class Primo {

	public static void main(String[] args) {

		int numero;
		int divisor;
		boolean primo;

		numero = 123;
		divisor = 2;
		primo = true;
		while (primo == true && divisor <= numero / 2) {
			if (numero % divisor == 0)
				primo = false;
			divisor++;
		}
		/*
		 * numero= 123; divisor= 1; divisiones= 0; while (divisor<= numero) { if
		 * (numero% divisor ==0) divisiones++; divisor++; }
		 * 
		 */

		if (primo == true)
			System.out.println("Primo");
		else
			System.out.println("NO primo");
	}

}
