/*
Escriba un programa que imprima el siguiente triÃ¡ngulo utilizando un bucle while y un bucle for:
*
**
***
****
*****
******
*******
**/
package funciones;

import java.util.Scanner;

public class Triangulo {

	static void visualizaTriangulo(int f) {
		
		while (f >= 0) {
			System.out.println();
			// for(int c= f; c > 0; c--)
			for (int c = 0; c <= f; c++) {
				System.out.print("*");
			}
			f--;
		}
	}
	static int visualizaRectangulo(int base, int altura) {
		int area;
		area= base * altura;
		while (altura > 0) {
			System.out.println();
			for (int b = 0; b < base; b++) {
				System.out.print(" *");
			}
			altura--;
		}
		return area;
	}

	public static void main(String[] args) {
		Scanner t= new Scanner(System.in);
		int base;
		int altura;
		System.out.print("Base: ");
		base= t.nextInt();
		System.out.print("Altura: ");
		altura= t.nextInt();
		
		int area= visualizaRectangulo(base, altura);
		System.out.println(area);
	}

}
