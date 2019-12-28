package bucles;

import java.util.Scanner;

/**
 * Leer un número y mostrar su cuadrado, repetir el 
 * proceso hasta que se introduzca un número negativo.
 * @author profesor
 *
 */
public class Negativo {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		int numero;
		int contador;
		contador= 0;
		do{
			System.out.print("Da un número: ");
			numero= teclado.nextInt();
			if(numero >= 0)
				contador++;
		}while(numero >= 0);
		System.out.println("Has introducido: " + contador);
	}
}
/*
			
			System.out.println("Quieres salir (s/n)?");
			respuesta= teclado.next();
			if(respuesta.compareToIgnoreCase("si") == 0)
				salir= true;
			}
	*/		






