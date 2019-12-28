
public class Orden {

	public static void main(String[] args) {
		int [] entero= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int [] entero1= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		int [] entero2= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		int [] entero3= new int[entero1.length + entero2.length];
		for(int indice= 0; indice <= entero.length / 2; indice++)
			System.out.printf("( %d, %d)\n", 
					entero[indice], 
					entero[(entero.length - 1) - indice]);
	/*
		int izq, dcha;
		izq= 0;
		dcha= entero.length - 1;
		while(izq <= dcha) {
			System.out.printf("( %d, %d)\n", 
					entero[izq], 
					entero[dcha]);
			izq++;
			dcha--;
		}
*/
		for(int izq= 0, dcha= entero.length - 1; izq <= dcha; izq++, dcha--) {
			System.out.printf("( %d, %d)\n", entero[izq], entero[dcha]);
		}
		for(int indice= 0, indice3= 0; indice < entero1.length; indice+= 3) {
			entero3[indice3] = entero1[indice];
			indice3++;
			entero3[indice3] = entero1[indice + 1];
			indice3++;
			entero3[indice3] = entero1[indice + 2];
			indice3++;
			entero3[indice3] = entero2[indice];
			indice3++;
			entero3[indice3] = entero2[indice + 1];
			indice3++;
			entero3[indice3] = entero2[indice + 2];
			indice3++;
		}
		for (int i : entero3) {
			System.out.println(i);
		}
		
		
	}

	
}




















