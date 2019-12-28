package secuenciales;
import java.util.Scanner;


public class PrimerPrograma {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		int entrada;
		entrada= teclado.nextInt();
		int media= 
				entrada/3;
		System.out.println("Hola, soy ...." + entrada);
	}

}
