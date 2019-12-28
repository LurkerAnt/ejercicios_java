package varios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class familiasYedi {

	public static void main(String[] args) {
		int numFamilias, numHijos, midisPadres, influFuerza, fuerza, mejorHijo;
		mejorHijo = 0;
		Scanner T = new Scanner(System.in);
		ArrayList<Integer> lista = new ArrayList<Integer>();
		// System.out.println("Introduce el número de Familias");
		numFamilias = T.nextInt();
		while (numFamilias >= 1 && numFamilias <= 20) {
			// System.out.println(numFamilias);
			for (int f = 0; f < numFamilias; f++) {
				numHijos = T.nextInt();
				midisPadres = T.nextInt();
				// System.out.println(numHijos + " " + midisPadres);
				StringBuilder sons = new StringBuilder();
				influFuerza = T.nextInt();
				// mejorHijo=influFuerza*midisPadres;
				for (int hijos = 1; hijos < numHijos; hijos++) {
					influFuerza = T.nextInt() * midisPadres;
					// fuerza= influFuerza*midisPadres;
					if (influFuerza > mejorHijo) {
						mejorHijo = influFuerza;
					}
					lista.add(mejorHijo);
					// System.out.print(influFuerza + " ");
					// sons.append(influFuerza).append(" ");
					// sons.append(influFuerza);
				}
				Collections.sort(lista);
				Collections.reverse(lista);
				influFuerza = T.nextInt();
				// System.out.println(influFuerza);
				sons.append(influFuerza);
			}
		}
		// for (int n = o; n < lista.size(); n++) {
		// System.out.println(numero + " ");
	}
}

//}
