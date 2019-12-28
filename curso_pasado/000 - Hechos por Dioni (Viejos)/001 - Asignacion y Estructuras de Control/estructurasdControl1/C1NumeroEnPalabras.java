package estructurasdControl1;

import java.util.Scanner;

public class C1NumeroEnPalabras {

	public static void main(String[] args) {
		int numero, numAux, decenas, unidades;
		String decena, unidad;
		Scanner T = new Scanner(System.in);
		System.out.println("Introduce un número de 0 a 99: ");
		numero = T.nextInt();
		if (numero < 0 || numero > 99) {
			System.out.println("Numero invalido, vuelve a introducirlo: ");
			numero = T.nextInt();
		}
		decena = "Blah";
		unidad = "Blah";
		numAux = decenas = unidades = 0;
		numAux = numero;
		if (numero > 10) {
			unidades = numero % 10;
			numero = numero / 10;
			decenas = numero * 10;
		} else {
			if (numero < 10) {
				unidades = numero;
			} else {
				if (numero == 10) {
					decenas = numero;
				}
			}
		}
		switch (decenas) {
		case 10:
			decena = "diez";
			break;
		case 20:
			decena = "veinte";
			break;
		case 30:
			decena = "treinta";
			break;
		case 40:
			decena = "cuarenta";
			break;
		case 50:
			decena = "cincuenta";
			break;
		case 60:
			decena = "sesenta";
			break;
		case 70:
			decena = "setenta";
			break;
		case 80:
			decena = "ochenta";
			break;
		case 90:
			decena = "noventa";
			break;
		}

		switch (unidades) {
		case 0:
			unidad = "cero";
			break;
		case 1:
			unidad = "uno";
			break;
		case 2:
			unidad = "dos";
			break;
		case 3:
			unidad = "tres";
			break;
		case 4:
			unidad = "cuatro";
			break;
		case 5:
			unidad = "cinco";
			break;
		case 6:
			unidad = "seis";
			break;
		case 7:
			unidad = "siete";
			break;
		case 8:
			unidad = "ocho";
			break;
		case 9:
			unidad = "nueve";
			break;
		}

		if (numAux > 10) {
			System.out.printf("El número %d es %s y %s.", numAux, decena, unidad);
		} else {
			if (numAux < 10) {
				System.out.printf("El numero %d es %s", numAux, unidad);
			} else {
				if (numAux == 10) {
					System.out.printf("El numero %d es %s", numAux, decena);

				}
			}

		}
	}
}
