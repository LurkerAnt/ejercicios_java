import java.util.Scanner;

import javax.swing.JOptionPane;

public class Capicua {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		int numero, numeroInicial;
		int unidades;
		int decenas;
		int centenas;
		int uMil;
		boolean capicua= false;
		
		System.out.println("Da el valor del número: ");
		numero= teclado.nextInt(); //9756;
		numeroInicial= numero;

		if(numero >= 0 && numero <= 9999){
			if(numeroInicial < 10)
				capicua= true;
			else{
				unidades = numero % 10;		// 6
				numero = numero / 10;		// 975
				decenas = numero % 10;		// 5
				numero = numero / 10;		// 97
				if(numeroInicial < 100){
					if(unidades == decenas)
						capicua= true;
				}
				else{
					centenas = numero % 10;		// 7
					numero = numero / 10;		// 9
					if(numeroInicial < 1000){
						if(unidades == centenas)
							capicua= true;
					}
					else{
						uMil = numero % 10;			// 9
						numero /= 10;		// 0
						if((unidades == uMil) && (decenas == centenas))
							capicua= true;						
					}
				}
			}
			if(capicua == true)
				System.out.println(numeroInicial + " es capicúa");
			else
				System.out.println(numeroInicial + " NO es capicúa");			
		}
		else
			System.out.println("error entrada");
		
			
	}

}
