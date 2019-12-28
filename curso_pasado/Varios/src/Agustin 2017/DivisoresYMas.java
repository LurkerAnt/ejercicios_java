/**
 * 1. Generar la lista de los divisores de un número N introducido por teclado.
 * 2. Número es perfecto 3. Números perfectos menores que 1000 4. 5 primeros
 * números perfectos
 * 
 * 
 * @author profesor
 *
 */
public class DivisoresYMas {

	public static void main(String[] args) {
		int numero;

		numero = 66;

		System.out.println("lista de divisores de:" + numero);
		System.out.println(1);
		for (int divisor = 2; divisor <= numero / 2; divisor++)
			if (numero % divisor == 0)
				System.out.println(divisor);
		System.out.println(numero);

		int suma;

		suma = 0;
		// System.out.println(1);
		for (int divisor = 1; divisor <= numero / 2; divisor++)
			if (numero % divisor == 0)
				suma += divisor;
		System.out.println(suma);
		if (suma == numero)
			System.out.println(numero + " SI es perfecto");
		else
			System.out.println(numero + " NO es perfecto");

		/**
		 * lista menores 1000
		 * 
		 */

		System.out.println("lista de perfectos:");
		for (numero = 1; numero <= 13000; numero++) {
			suma = 0;
			for (int divisor = 1; divisor <= numero / 2; divisor++)
				if (numero % divisor == 0)
					suma += divisor;
			if (suma == numero)
				System.out.println(numero);
			// else
			// System.out.println(numero + " NO es perfecto");
		}

		numero = 1;
		System.out.println("lista de 5 perfectos:");
		for (int perfectos = 1; perfectos <= 4;) {

			// for (numero = 1; numero <= 13000; numero++) {
			/// suma divisores
			suma = 0;
			for (int divisor = 1; divisor <= numero / 2; divisor++)
				if (numero % divisor == 0)
					suma += divisor;
			// }
			/// es perfecto?
			if (suma == numero) {
				System.out.println(numero);
				perfectos++;
			}
			numero++;

		}

		boolean perfecto;
		numero = 0;
		System.out.println("lista de 5 perfectos:");
		for (int perfectos = 1; perfectos <= 4; perfectos++) {
			do {
				/// suma divisores
				numero++;
				suma = 0;
				perfecto= false;
				for (int divisor = 1; divisor <= numero / 2; divisor++)
					if (numero % divisor == 0)
						suma += divisor;
				/// es perfecto?
				//perfecto= suma == numero;
				if(suma == numero)
					perfecto= true;
			} while (!perfecto); // perfecto == false
			System.out.println(numero);

		}

	}

}









