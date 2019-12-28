package bucles;

import java.util.Scanner;

public class CuentaDigitos {

	public static void main(String[] args) {
		int numero = -1234;
		int digitos;
		int auxiliar;
		Scanner teclado = new Scanner(System.in);
		/*
		do {
			System.out.println("da el número:");
			numero = teclado.nextInt();
			if (numero < 0)
				System.out.println("Entrada errónea: " + numero);
		} while (numero < 0);
	*/
		/*
			if(numero < 0)
				auxiliar = (-1) * numero;
			else
				auxiliar= numero;
			*/
			//auxiliar= Math.abs(numero);
		
			auxiliar= numero;
			digitos = 1;
			while (Math.abs(auxiliar) > 9) {
				digitos++;
				auxiliar = auxiliar / 10;
			}
			System.out.printf("El %d tiene %d dígitos", numero, digitos);
	}

}
