package a02XvariablesDecisiones;

/**
 * Un comercio realiza un descuento dependiendo del precio del producto.
 * Si es inferior a 50 €. no hay descuento; 
 * Si está entre 50 € y menor a 100 €. es un 5% de descuento;
 * Si es mayor a 100 € es un 10%. 
 * Calcular el precio final del producto con el 15% de impuestos.
 * 
 * @author Dionisio Fernández Ortiz
 *
 */

import java.util.Scanner;

public class A06xDescuentos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int precio;
		double precioImp, precioFinal;
		System.out.println("Dame el precio del producto: ");
		precio = teclado.nextInt();
		precioImp = precio + (precio * 0.15);
		if (precioImp < 50) {
			precioFinal = precioImp;
			System.out.println("El precio del producto es " + precioFinal + "€.");
		} else if (precioImp > 50 && precioImp < 100) {
			precioFinal = precioImp - (precioImp * 0.05);
			System.out.println("El precio del producto es " + precioFinal + "€.");
		} else if (precioImp > 100) {
			precioFinal = precioImp - (precioImp * 0.1);
			System.out.println("El precio del producto es " + precioFinal + "€.");
		}
		teclado.close();
	}
}