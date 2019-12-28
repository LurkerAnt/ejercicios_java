package arrays;

import java.util.Random;
import java.util.Scanner;

public class Disjuntos {
	
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
	static boolean sonDisjuntos(int [] v1, int[] v2){
		boolean disjuntos= true;
		int cI;
		int cE;
		
		for(cE= 0; cE < v1.length && disjuntos==true; cE++)
			for(cI= 0; cI < v2.length && disjuntos==true; cI++)
				if(v1[cE] == v2[cI]){
					disjuntos= false;
				}
		return disjuntos;
	}
	
	public static void main(String[] args) {
		final int L1= 10;
		final int L2= 5;
		int [] vector1= new int[L1];
		int [] vector2= new int[L2];
		carga(vector1);
		carga(vector2);
		visualiza(vector1);
		visualiza(vector2);
		
		if(sonDisjuntos(vector1, vector2))
			System.out.println("SI son disjuntos");
		else
			System.out.println("NO son disjuntos");
	}

}
