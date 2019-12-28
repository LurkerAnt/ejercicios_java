package arrays01;

import java.util.Scanner;

public class InicioArray {

	public static void main(String[] args) {
		Scanner t = new Scanner (System.in);
		int notas[];
		notas = new int[10];
		notas [0]= 3;
		notas [1]=t.nextInt();
		System.out.println(notas[0]);
		
		//asi se meten datos en un array
		for (int i=0; i<notas.length;i++) {
			notas[i]=0;
		}
		
		t.close();
	}

}
