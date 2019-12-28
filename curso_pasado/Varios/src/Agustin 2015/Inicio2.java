package bucles;

import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {

		Scanner t= new Scanner(System.in);
		
		int repeticiones;
		int contador;		
		
		System.out.println("Número de repeticiones: ");

		repeticiones= t.nextInt();		
		
		contador= 10; // inicialización
		while(contador <= repeticiones){
			// cuerpo
			System.out.println("Nº iteración " + contador);
			contador += 10;
		}
		System.out.println("fin");
		
		//sentencias siguientes
	}

}
