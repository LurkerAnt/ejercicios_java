package teachermade003;

//Leer 10 números enteros. Debemos mostrarlos en el siguiente orden: el primero, el último, el segundo, el penúltimo, el tercero, etc.
public class OrdenProfe {

	public static void main(String[] args) {
		int[] entero = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // esto hay que declararlo con cosas chiquitas no así
		System.out.printf("(%d, %d)\n", entero[0], entero[9]); // asi no porque no vas a hacer esto forever, haz un puto
																// bucle.

		for (int indice = 0; indice <= entero.length / 2; indice++)
			System.out.printf("(%d, %d)\n", entero[indice], entero[(entero.length - 1) - indice]);

		/*
		 * int izquierda; int derecha; izquierda =0; derecha= entero.length-1; while
		 * (izquierda<=derecha) { System.out.printf("( %d, %d) \n", entero[izquierda],
		 * entero[derecha]); izquierda++; derecha--; }
		 */

		for (int izquierda = 0, derecha = entero.length - 1; izquierda <= derecha; izquierda++, derecha--) {
			System.out.printf("( %d, %d) \n", entero[izquierda], entero[derecha]);

		}

		// =0; indice<= entero.length /2; indice++)
		// System.out.printf("(%d, %d)\n", entero [indice], entero[(entero.length-1) -
		// indice]);
	}

	}

	for(

	int indice = 0, indice 3=0;indice<entero1.length;indice+=3)
	{
	entero3[indice3] = entero1[inidice];
	indice3++;
	entero3[indice3] = entero1[inidice+1];
	indice3++;
	entero3[indice3] = entero1[inidice+2];
	indice3++;
	entero3[indice3] = entero1[inidice];
	indice3++;
}