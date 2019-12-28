




import java.util.Scanner;

public class MayorMenor {
	static Scanner teclado = new Scanner(System.in);

	// Carga de array
	public static void carga(int[] vector) {
		for (int indice = 0; indice < vector.length; indice++) {
			System.out.printf("Valor para la componente %d: ", indice);
			vector[indice] = teclado.nextInt();
		}
	}
	public static int getMayor1(int[] vector) {
		int mayor;
		mayor= vector[0];
		for (int indice = 1; indice < vector.length; indice++) {
			int actual= vector[indice];
			if(actual > mayor)
				mayor= actual;
		}
		return mayor;
	}
	public static int getPosicionMayor(int[] vector) {
		int mayor;
		mayor= 0;
		for (int indice = 1; indice < vector.length; indice++) {
			if(vector[indice] > vector[mayor])
				mayor= indice;
		}
		return mayor;
	}
	public static int getRepeticionesMayor(int[] vector) {
		int mayor;
		int repe;
		mayor= 0;
		repe= 1;
		for (int indice = 1; indice < vector.length; indice++) {
			if(vector[indice] > vector[mayor]) {
				mayor= indice;
				repe= 1;
			}
			else if(vector[indice] == vector[mayor])
				repe++;
		}
//		numeros= new int[] {7, 6, 7, 3, 4, 8, 2, 1, 8};		
		return repe;
	}
	public static int[] getPosicionMayorMenor(int[] vector) {
		int mayor, menor;
		int[]mm= {0, 0, 0, 0};
		//mayor= menor= 0;
		for (int indice = 1; indice < vector.length; indice++) {
			//mayor= mm[0];
			if(vector[indice] >= vector[mm[0]])
				mm[0]= indice;
			menor= mm[1];
			if(vector[indice] <= vector[menor])
				mm[1]= indice;
		}
		return mm; //mayor y menor;
	}
	public static void main(String[] args) {
		int[] numeros;
		int[] posiciones;
		int mayor;
		int mayorPosicion;
		numeros= new int[] {4, 6, 7, 3, 4, 8, 2, 1, 8};
		
		//carga(numeros);
		mayor= getMayor1(numeros);
		mayorPosicion= getPosicionMayor(numeros);
		System.out.println("El mayor es: " + mayor);
		System.out.println("El mayor es: " + mayorPosicion);
		System.out.println("El mayor es: " + numeros[mayorPosicion]);
		posiciones= getPosicionMayorMenor(numeros);
		System.out.println("p ma " + posiciones[0]);
		System.out.println("p me " + posiciones[1]);
		System.out.println("p ma " + numeros[posiciones[0]]);
		System.out.println("p me " + numeros[posiciones[1]]);
	}

}














