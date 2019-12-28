package a04XmetodosEjerciciosBasicos;

import java.util.Scanner;

public class A05xNumerosAmigos {
	public static int sumaDivisores(int numero1) {
		int suma, divisor;
		for (suma = 0, divisor = 1; divisor <= numero1 / 2; divisor++) {
			if (numero1 % divisor == 0) {
				suma += divisor;
			}
		}
		return suma;
	}

	public static boolean sonNumerosAmigos(int numero1, int numero2) {
		int suma1, suma2;
		boolean losAmigos = false;
		suma1 = sumaDivisores(numero1);
		suma2 = sumaDivisores(numero2);
		if (numero1 == suma2 && numero2 == suma1) {
			losAmigos = true;
			return losAmigos;
		} else {
			return losAmigos;
		}

	}

	public static void main(String[] args) {
		int numero1, numero2;
		boolean sonAmigos;
		Scanner t = new Scanner(System.in);
		System.out.println("Dame el primer número: ");
		numero1 = t.nextInt();
		System.out.println("Dame el segundo número: ");
		numero2 = t.nextInt();
		sonAmigos = sonNumerosAmigos(numero1, numero2);
		if (sonAmigos == true) {
			System.out.println("Son Amigos.");
		} else {
			System.out.println("No son Amigos.");
		}
		t.close();
	}

}
