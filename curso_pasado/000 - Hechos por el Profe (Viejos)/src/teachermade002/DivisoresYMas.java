package teachermade002;

import java.util.Scanner;

/*
 * 1. Generar por pantalla los divisores de un numero
 * 2. Decir si un numero es perfecto.
 * 3. numeros perfectos menores de 1000
 * 4. 5 primeros numeros perfectos.
 * 
 */

public class DivisoresYMas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		int divisor;
		int suma;
		int auxdivisor;

		System.out.println("Itroduce el número: ");
		numero = teclado.nextInt();
		divisor = 1;
		auxdivisor = divisor;

		System.out.println("Lista de divisores de: " + numero);
		System.out.println(1);
		for (divisor = 2; divisor <= numero / 2; divisor++) {
			if (numero % divisor == 0) {
				System.out.println(divisor);
			}

		}
		System.out.println(numero);// esto te ahorra hechar una cuenta extra y hace que optimice el programa

		suma = 0;
		for (suma = 0; auxdivisor < numero; auxdivisor++)
			if (numero % auxdivisor == 0) {
				suma += auxdivisor;

			}
		if (suma == numero)
			System.out.println("El numero es perfecto.");
		else
			System.out.println("El numero NO es perfecto.");

		for (numero = 1; numero <= 1000; numero++)
			suma = 0;
		for (suma = 0; auxdivisor < numero; auxdivisor++)
			if (numero % auxdivisor == 0) {
				suma += auxdivisor;

			}
		if (suma == numero)
			System.out.println("El numero es perfecto.");
		else
			System.out.println("El numero NO es perfecto.");

		System.out.println("lista de nuneros enteros");
		for (int perfecto = 1; perfecto <= 5; perfecto++)

			for (numero = 1; numero <= 13000; numero++)

				// suma divisores
				suma = 0;

		// es perfecto??
		if (numero % auxdivisor == 0) {
			suma += auxdivisor;
			perfecto++;
		}
		if (suma == numero)
			System.out.println("El numero es perfecto.");
		else
			System.out.println("El numero NO es perfecto.");

		/*
		 * System.out.println("Lista de Numeros Perfectos :"); for (numero=1;
		 * numero<=1000;numero++) { suma=0; for (suma=0; auxdivisor <= numero / 2;
		 * auxdivisor++) if (numero % auxdivisor == 0) { suma += auxdivisor;
		 * 
		 * if (suma == numero) System.out.println(numero + "El numero es perfecto.");
		 * else System.out.println("El numero NO es perfecto."); } }
		 */
	}
}

/*
 * while (divisor<numero) { numero%divisor } import java.util.Scanner; public
 * class numeros_amigos {
 * 
 * public static void main(String[] args) { Scanner sc= new Scanner(System.in);
 * Scanner teclado = new Scanner(System.in);
 * 
 * int num1, num2, divisor, divisores1=0, divisores2=0;
 * 
 * System.out.println("Escriba el primer número: "); num1= sc.nextInt();
 * System.out.println("Escriba el segundo número: "); num2= teclado.nextInt();
 * 
 * divisor=1; while(divisor<num1 && divisor<num2) { if((num1%divisor)==0) {
 * divisores1+=divisor; } if((num2%divisor)==0) { divisores2+=divisor; }
 * divisor++;
 * 
 * }
 * 
 * if(divisores1==num2 && divisores2==num1) { System.out.println("Son amigos");
 * }else { System.out.println("No son amigos"); }
 * 
 * }
 * 
 * }
 */
