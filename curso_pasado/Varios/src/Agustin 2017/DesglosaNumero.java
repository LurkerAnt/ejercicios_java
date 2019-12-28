import java.util.Scanner;


public class DesglosaNumero {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		int numero, numeroInicial, numeroInvertido=0;
		boolean capicua= false;
		int unidades;
		int decenas;
		int centenas;
		int uMil;
		
		System.out.println("Da el valor del número: ");
		numero= teclado.nextInt(); //9756;
		numeroInicial= numero;

		unidades = numero % 10;		// 6
		numero = numero / 10;		// 975
		
		decenas = numero % 10;		// 5
		numero = numero / 10;		// 97	
		
		centenas = numero % 10;		// 7
		numero = numero / 10;		// 9
		
		//uMil = numero			// 976765
		uMil = numero % 10;			// 9
		numero /= 10;		// 0
		
		// 123
		
		if(numeroInicial < 10){
			numeroInvertido= unidades;
			//capicua= true;
		}
		else if(numeroInicial < 100){
			numeroInvertido=  decenas + unidades*10;
			//if(numeroInicial == numeroInvertido)
				//capicua= true;
		}else if(numeroInicial < 1000){
			numeroInvertido=  centenas*1 + decenas*10 + unidades*100;
			//if(numeroInicial == numeroInvertido)
				//capicua= true;
		}else if(numeroInicial < 10000){
			numeroInvertido= uMil + centenas*10 + decenas*100 + unidades*1000;
			//if(numeroInicial == numeroInvertido)
				//capicua= true;
		}

		if(numeroInicial == numeroInvertido)
			capicua= true;
			
		if(capicua == true)
			System.out.println(numeroInicial + " es capicúa");
		else
			System.out.println(numeroInicial + " NO es capicúa");			

		//numeroInvertido= uMil + centenas*10 + decenas*100 + unidades*1000;
		
		System.out.println(" El número " + numeroInicial + " se desglosa en: ");
		System.out.println("\t" + unidades + " unidades");
		System.out.println("\t" + decenas + " decenas");
		System.out.println("\t" + centenas + " centenas");
		System.out.println("\t" + uMil + " unidades de mil");
		
		System.out.println("invertido: " + numeroInvertido);
	}

}




