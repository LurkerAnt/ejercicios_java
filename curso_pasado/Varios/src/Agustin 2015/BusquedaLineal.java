package arrays;

import java.util.Arrays;

public class BusquedaLineal {
	static int buscaPersona(String p, String[] nombres) {
		boolean encontrado = false;
		int indice;
		indice = 0;
		while (!encontrado && indice < nombres.length) {
			// if(nombreBuscar == nombres[indice])
			if (p.compareToIgnoreCase(nombres[indice]) == 0)
				encontrado = true;
			else
				indice++;
		}
		if(encontrado)
			return indice;
		else
			return -1;
	}
	static int buscaPersona2(String p, String[] nombres) {
		boolean encontrado = false;
		boolean fin= false;
		int indice;
		indice = 0;
		while (!encontrado && !fin && indice < nombres.length) {
			if (p == nombres[indice])
				encontrado = true;
			else if(p.compareToIgnoreCase(nombres[indice]) < 0)
			//else if(p < nombres[indice])
				fin= true;
			else
				indice++;
		}
		if(encontrado)
			return indice;
		else
			return -1;
	}

	public static void main(String[] args) {
		String[] nombres = {"Antonio", "Maria" , "Juan", "Luis"};
		int[] edad = { 21, 33, 25, 22 };
		int[] nota = { 6, 9, 5, 7 };
		String nombreBuscar;
		int posicion;
		Arrays.sort(nombres, 0, 2);
		nombreBuscar = "Marian";
		posicion= buscaPersona2(nombreBuscar, nombres);
		if (posicion != -1) // == true)
			System.out.println(nombres[posicion] + " tiene " + edad[posicion] + " años");
		else
			System.out.println(nombreBuscar + " NO está");
	}

}
