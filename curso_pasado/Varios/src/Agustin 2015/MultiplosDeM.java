package bucles;

import java.util.Scanner;

public class MultiplosDeM {

	public static void main(String[] args) {
		int nMultiplos;
		int multiplo;
		int contadorMultiplos;
		Scanner t= new Scanner(System.in);
		
		System.out.print("Número de múltipos: ");
		nMultiplos= t.nextInt();
		System.out.print("De: ");
		multiplo= t.nextInt();
		
		System.out.println(nMultiplos + " múltiplos de " + multiplo);
		contadorMultiplos= 1;
		while(contadorMultiplos <= nMultiplos){
			System.out.println(contadorMultiplos * multiplo);
			contadorMultiplos++;
		}
		
		int contador= contadorMultiplos;
		int fin= nMultiplos;
		System.out.println(" múltiplos de " + multiplo + " hasta el " + fin);
		
		contador= multiplo;
		while(contador <= fin){
			System.out.println(contador);
			contador = contador + multiplo;
		}

		contador= 1;
		while(contador <= fin/multiplo){
			System.out.println(contador * multiplo);
			contador = contador + 1;
		}
	}

		
	
	
}
