package arrays;

import java.util.Scanner;

public class Exx {
	static String pasaBinario(int numero){
		String binario= "";
		int resto= 0;
		while (numero > 0){
			resto= numero % 2;
			numero = numero / 2;
			binario = resto + binario;
		}
		return binario;
	}
	static int busca(int[]vector, int n){
		int posicion;
		int encontrado= -1;
		for(posicion= 0; posicion < vector.length; posicion++)
			if(n == vector[posicion])
				encontrado= posicion;
		return encontrado;
	}
	
	static Scanner teclea= new Scanner(System.in);

	static void carga(int[]vector){
		System.out.println("llenar un array");
		for(int i= 0; i < vector.length; i++){
			System.out.print("Valor para la componente " + i + " :");
			vector[i]= teclea.nextInt();
		}		
	}
	static void visualiza(int[]vector, String descripcion){
		System.out.println(descripcion);
		for(int i= 0; i < vector.length; i++){
			System.out.print("Valor de la componente " + i + " : " + vector[i]);
		}		
	}
	static int[] carga2(int[]vector, int l){
		//int[]vector= new int[l];
		System.out.println("llenar un array");
		for(int i= 0; i < vector.length; i++){
			System.out.print("Valor para la componente " + i + " :");
			vector[i]= teclea.nextInt();
		}		
		return vector;
	}
	static float media(int[]vector){
		float m;
		int s= 0;
		for(int i= 0; i < vector.length; i++){
			s += vector[i];
		}
		m= (float)s/vector.length;
		return m;		
	}
	static void mayorMedia(int[]vector){
		float m= media(vector);
		for(int i= 0; i < vector.length; i++){
			if(vector[i] > m)
				System.out.println(vector[i]);
		}
	}
	static float[] dev(int[]vector){
		float m= media(vector);
		float []d= new int[vector.length];
		float da;
		for(int i= 0; i < vector.length; i++){
			da= Math.abs(vector[i] - m);
			d[i]= (float)da;
			//System.out.println(d);
		}
		//visualiza(d, "desviación ...");
		return d;
	}
	static void mayorMedia(int[]vector){
		float m= media(vector);
		for(int i= 0; i < vector.length; i++){
			if(vector[i] > m)
				System.out.println(vector[i]);
		}
	}
	static void mayorMedia(int[]vector){
		float m= media(vector);
		float suma;
		for(int i= 0; i < vector.length; i++){
			suma= suma + Math.abs(vector[i] - m);
		}
		return suma/vector.length;
	}
	
	public static void main(String[] args) {
		System.out.println(pasaBinario(13));
		int [] array1;
		array1= new int[10];
		carga(array1);
		int[] array2;
		array2= carga2(array1, 10);
		visualiza(array1, "array inicial");
		float[]desv= dev(array1);
		desvMedia(array1, desv);
	}

}
