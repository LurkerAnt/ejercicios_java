package a02XvariablesDecisiones;

/**
 * 20. Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56 mostrar: cincuenta y seis.
 * @author Dionisio Fernández Ortiz
 *
 */

import java.util.Scanner;

public class B10xNumerosEscritos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero, unidades, decenas;
		System.out.println("Dame un número: ");
		numero = teclado.nextInt();

		switch (numero) {
		case 0:
			System.out.println("Cero.");
			break;
		case 1:
			System.out.println("Uno.");
			break;
		case 2:
			System.out.println("Dos.");
			break;
		case 3:
			System.out.println("Tres.");
			break;
		case 4:
			System.out.println("Cuatro.");
			break;
		case 5:
			System.out.println("Cinco.");
			break;
		case 6:
			System.out.println("Seis.");
			break;
		case 7:
			System.out.println("Siete.");
			break;
		case 8:
			System.out.println("Ocho.");
			break;
		case 9:
			System.out.println("Nueve.");
			break;
		case 10:
			System.out.println("Diez.");
			break;
		case 11:
			System.out.println("Once.");
			break;
		case 12:
			System.out.println("Doce.");
			break;
		case 13:
			System.out.println("Trece.");
			break;
		case 14:
			System.out.println("Catorce.");
			break;
		case 15:
			System.out.println("Quince.");
			break;
		case 20:
			System.out.println("Veinte.");
			break;
		case 30:
			System.out.println("Treinta.");
			break;
		case 40:
			System.out.println("Cuarenta.");
			break;
		case 50:
			System.out.println("Cincuenta.");
			break;
		case 60:
			System.out.println("Sesenta.");
			break;
		case 70:
			System.out.println("Setenta.");
			break;
		case 80:
			System.out.println("Ochenta.");
			break;
		case 90:
			System.out.println("Noventa.");
		}

		if (numero >= 16 && numero <= 99 && numero != 20 && numero != 30 && numero != 40 && numero != 50 && numero != 60
				&& numero != 70 && numero != 80 && numero != 90) {
			unidades = numero % 10;
			decenas = numero / 10;

			switch (decenas) {
			case 1:
				System.out.print("Diez y ");
				break;
			case 2:
				System.out.print("Veinti");
				break;
			case 3:
				System.out.print("Treinta y ");
				break;
			case 4:
				System.out.print("Cuarenta y ");
				break;
			case 5:
				System.out.print("Cincuenta y ");
				break;
			case 6:
				System.out.print("Sesenta y ");
				break;
			case 7:
				System.out.print("Setenta y ");
				break;
			case 8:
				System.out.print("Ochenta y ");
				break;
			case 9:
				System.out.print("Noventa y ");
			}
			switch (unidades) {
			case 1:
				System.out.print("Uno.");
				break;
			case 2:
				System.out.print("Dos.");
				break;
			case 3:
				System.out.print("Tres.");
				break;
			case 4:
				System.out.print("Cuatro.");
				break;
			case 5:
				System.out.print("Cinco.");
				break;
			case 6:
				System.out.print("Seis.");
				break;
			case 7:
				System.out.print("Siete.");
				break;
			case 8:
				System.out.print("Ocho.");
				break;
			case 9:
				System.out.print("Nueve.");
			}
		}
		teclado.close();
	}

}
