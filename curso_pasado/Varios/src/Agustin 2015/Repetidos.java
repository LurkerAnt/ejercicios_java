package arrays;

import java.util.Random;
import java.util.Scanner;

public class Repetidos {
	
	static Scanner t= new Scanner(System.in);
	static Random r= new Random();

	static void carga(int vector[]) {
		System.out.println("Componente ... ");
		for (int c = 0; c < vector.length; c++) {
			System.out.print(c + ": ");
			vector[c] = r.nextInt(10); //t.nextInt();
			System.out.println(vector[c]);
		}
	}

	static void visualiza(int[] vector) {
		System.out.println();
		for (int i = 0; i < vector.length; i++)
			System.out.printf("%4d", vector[i]);
		System.out.println();
	}
	
	static boolean hayRepetidos(int [] vector){
		boolean repetidos= false;
		for(int e= 0; e < vector.length && !repetidos; e++)
			for(int i= e + 1; i < vector.length && !repetidos; i++)
				if(vector[e] == vector[i])
					repetidos= true;
		return repetidos;
	}
	
	public static void main(String[] args) {
		final int L1= 10;
		int [] vector= new int[L1];
		
		carga(vector);
		visualiza(vector);
		
		if(hayRepetidos(vector))
			System.out.println("SI hay");
		else
			System.out.println("NO hay");
	}

}
