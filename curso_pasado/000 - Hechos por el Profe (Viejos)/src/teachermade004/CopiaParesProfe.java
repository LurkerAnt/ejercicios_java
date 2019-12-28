package teachermade004;

//Leer 10 enteros. Guardar en otra tabla los elementos pares de la primera, y a continuación los elementos impares.
//- Realizar dos versiones: una trabajando con los valores y otra trabajando con los índices.

public class CopiaParesProfe {

	public static boolean esPar(int n) {
		return n % 2 == 0;
	}

	public static void main(String[] args) {

		int[] numero = { 1, 2, 4, 6, 8, 9, 6, 5, 10, 12 };
		int[] resultado;
		// int posicion;
		resultado = new int[numero.length];

		/*
		 * posicion = 0; for (int componente : numero) { if(esPar(componente)) {
		 * resultado[posicion]=componente; posicion++; }
		 * 
		 * } //posicion=0; for (int componente : numero) { if(!esPar(componente)) {
		 * resultado[posicion]=componente; posicion++; }
		 * 
		 * }
		 * 
		 * 
		 */

		int componente;
		int posicion;
		posicion = 0;
		for (int i = 0; i < numero.length; i++) {
			componente = numero[i];
			if (esPar(componente))
				resultado[posicion++] = componente;

		}
		for (int i = 0; i < numero.length; i++) {
			componente = numero[i];
			if (!esPar(componente))
				resultado[posicion++] = componente;

		}
		for (int componente1 : resultado) {
			System.out.println(componente1);
		}
	}

}
