package a06XArray01;

import java.util.Scanner;

public class A01xMostrar5Introducidos {

	public static void main(String[] args) {
		int [] numeros= new int [5];
		int numero;
		Scanner teclado=new Scanner (System.in);
		
		for (int i =0; i<numeros.length;i++) {
			System.out.println("Dame un n�mero: ");
			numero=teclado.nextInt();
			numeros[i]=numero;
		}
		System.out.println("Los n�meros son: ");
		for (int i =0; i<numeros.length;i++) {
			System.out.printf("%d ",numeros[i]);
		}
		teclado.close();
	}

}
