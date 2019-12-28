package a03XbuclesDecisiones;

/**
 * Escriba un programa que lea un número N y realice el siguiente dibujo (Ej:
 * suponiendo N igual a 4): ***+ **+ *+ +
 * 
 * @author Dionisio Fernández Ortiz
 *
 */
public class C5xSacaDibujoTres {

	public static void main(String[] args) {
		int linea;
		int asterisco;
		linea = 0;
		for (linea = 4; linea > 0; linea--) {
			for (asterisco = 1; asterisco < linea; asterisco++) {
				System.out.print('*');
			}
			System.out.println('+');
		}
	}

}
