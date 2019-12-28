package bucles;

import java.util.Scanner;

public class TablaMultiplicarNumero {

	public static void main(String[] args) {
		int multiplicando;
		int multiplicador;
		int producto;
		Scanner t= new Scanner(System.in);
		
		System.out.print("Multiplicando: ");
		multiplicando= t.nextInt();		
		
		System.out.println("tabla de multiplicar del " + multiplicando);
		multiplicador= 1;
		while(multiplicador <= 10 ){
			producto= multiplicando * multiplicador;
			System.out.printf("%2d *%3d =%3d\n", multiplicando, multiplicador, producto);
			//System.out.println(multiplicando + " * " + multiplicador + " = " + producto);
			multiplicador++;
		}

	}

}










