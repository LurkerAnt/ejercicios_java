package estructurasdControl1;

import java.util.Scanner;

/*
 * 6.	Un comercio realiza un descuento dependiendo del precio del producto. 
 * Si es inferior a 50 €. no hay descuento; 
 * si está entre 50 € y menor a 100 €. es un 5% de descuento;
 * y si es mayor a 100 € es un 10%. Calcular el precio final del producto con el 15% de impuestos.
*/
public class A6DescuentoTienda {

	public static double CalculaImpuestos(double cantidad) {
		double Impuesto;
		Impuesto = cantidad * 0.15;

		return Impuesto;

	}

	public static void main(String[] args) {
		Scanner T = new Scanner(System.in);
		double cantidadIn, cantidadFi, impuesto;

		System.out.println("Introduce la cantidad: ");
		cantidadIn = T.nextInt();

		if (cantidadIn < 50) {
			impuesto = CalculaImpuestos(cantidadIn);
			cantidadFi = cantidadIn + impuesto;
			System.out.printf("No tiene descuento, el precio final es %.2f €", cantidadFi);
		}
		if (cantidadIn > 50 && cantidadIn < 100) {
			cantidadIn = cantidadIn - (cantidadIn * 0.05);
			cantidadFi = (double) CalculaImpuestos(cantidadIn) + cantidadIn;
			System.out.printf("Tiene un descuento del 5 por ciento, el precio final es %.2f €", cantidadFi);
		}
		if (cantidadIn > 100) {
			cantidadIn = cantidadIn - (cantidadIn * 0.10);
			cantidadFi = CalculaImpuestos(cantidadIn) + cantidadIn;
			System.out.printf("Tiene un descuento del 10 por ciento, el precio final es %.2f €", cantidadFi);
		}
	}

}
