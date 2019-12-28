import java.util.Arrays;

public class CopiaPares2 {

	public static boolean esPar (Integer n) {
		return n % 2 == 0;		
	}
	
	public static void visualiza(String texto, int []vector) { 
		System.out.println(texto);
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i] + " ");			
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		
		final int DIEZ= 10;
		
		int[]numero= {1, 2, 4, 6, 8, 9, 6, 5, 10, 12};
		int[]par;
		int[]impar;
		//int posicion;
		//resultado= new int[numero.length];

		int pares= 0;
		for (int i = 0; i < numero.length; i++) {
			if(esPar(numero[i]))
				pares++;			
		}
		par= new int[pares];
		impar= new int[numero.length - pares];
		
		int iP;
		int iI;
		
		iP = iI = 0;
		for (int i = 0; i < numero.length; i++) {
			if(esPar(numero[i])) {
				par[iP]= numero[i];
				iP++;
			}
			else
				impar[iI++]= numero[i];
		}
		visualiza("todos", numero);
		Arrays.sort(numero);
		visualiza("todos", numero);
		visualiza("pares", par);
		visualiza("impares", impar);
	}

}
























