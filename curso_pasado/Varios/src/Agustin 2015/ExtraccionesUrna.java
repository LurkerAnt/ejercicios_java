package arrays;

import java.util.Arrays;
import java.util.Random;

public class ExtraccionesUrna {
	static void visualiza2(int[]vector){
		System.out.println("extracciones:");
		for(int bola= 0; bola < vector.length; bola++)
			System.out.printf("%3d aparece %4d\n", bola + 1, vector[bola]);
		}
	public static void main(String[] args) {
		final int BOLAS= 50;
		final int EXTR= 1000;
		
		Random urna= new Random();
		int nBola;
		
		int []cuentaBolas= new int[BOLAS];
		int nExt;
		
		Arrays.fill(cuentaBolas, 0);
		nExt= 0;
		while(nExt < EXTR){
			nBola= urna.nextInt(BOLAS);
			cuentaBolas[nBola] ++;
			/*
			switch(nBola){
			case 1: cuentaBolas[nBola - 1]++;break;
			case 2: cuentaBolas[nBola - 1]++;break;
			case 3: cuentaBolas[nBola - 1]++;break;
			case 4: cuentaBolas[nBola - 1]++;break;
			}*/
			nExt++;
		}
		visualiza2(cuentaBolas);
	}

}
