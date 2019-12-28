package bucles;

import java.util.Scanner;

public class TablasMultiplicarHasta10 {

	public static void main(String[] args) {
		int multiplicando;
		int inicio;
		int fin;
		int multiplicador;
		int producto;
		/*
		Scanner t= new Scanner(System.in);
		
		System.out.print("Multiplicando: ");
		multiplicando= t.nextInt();		
		*/

		
		for(multiplicando= 1 ;multiplicando <= 10;multiplicando++){
			System.out.println("tabla de multiplicar del " + multiplicando);
			for(multiplicador= 1;multiplicador <= 10; multiplicador++){
				producto= multiplicando * multiplicador;
				System.out.printf("%2d *%3d =%3d\n", multiplicando, multiplicador, producto);
			}
		}

		/*
		multiplicando= 1;
		while(multiplicando <= 10){
			System.out.println("tabla de multiplicar del " + multiplicando);
			multiplicador= 1;
			while(multiplicador <= 10 ){
				producto= multiplicando * multiplicador;
				System.out.printf("%2d *%3d =%3d\n", multiplicando, multiplicador, producto);
				multiplicador++;
			}
			multiplicando++;
		}
		*/
	}

}
