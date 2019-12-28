import java.util.Scanner;


public class Desglosa2 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		int numero, intercambiado, auxiliar;
		int unidades;
		int decenas;
		int centenas;
		int uMil;
		
		System.out.println("Da el valor del número: ");
		numero= teclado.nextInt(); //9756;
		auxiliar= numero;

		unidades = numero % 10;		// 6
		numero = numero / 10;		// 975
		
		decenas = numero % 10;		// 5
		numero = numero / 10;		// 97	
		
		centenas = numero % 10;		// 7
		numero = numero / 10;		// 9
		
		//uMil = numero			// 976765
		uMil = numero % 10;			// 9
		numero /= 10;		// 0

		System.out.println(" El número " + auxiliar + " se desglosa en: ");
		System.out.println("\t" + unidades + " unidades");
		System.out.println("\t" + decenas + " decenas");
		System.out.println("\t" + centenas + " centenas");
		System.out.println("\t" + uMil + " unidades de mil");
		
		unidades = (unidades + 7) % 10;
		decenas = (decenas + 7) % 10;
		centenas = (centenas + 7) % 10;
		uMil = (uMil + 7) % 10;
		
		intercambiado= decenas*1000 + unidades * 100 + uMil*10 + centenas;
		
		System.out.println("cambiado " + intercambiado);
	}

}




