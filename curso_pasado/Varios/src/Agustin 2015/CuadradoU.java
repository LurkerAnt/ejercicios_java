/*
Escribe un programa que lea un nÃºmero N y realice el siguiente dibujo (Ej: suponiendo N igual a 4):
+***
*+**
**+*
***+
*/

package bucles;

public class CuadradoU {

	public static void main(String[] args) {
		// final int vF= 10;
		// final int vC= 10;
		int vF;
		int vC;

		vF = 11;
		vC = vF;
		for (int f = 0; f < vF; f++) {
			System.out.println();
			for (int c = 0; c < vC; c++) {
				if (f == vF/2 && c == vC/2)
					System.out.print(" x");
				else if (f == c)
					System.out.print(" +");
				else if(f + c == vF - 1)
					System.out.print(" -");					
				else
					System.out.print(" *");
			}
		}
	}

}
