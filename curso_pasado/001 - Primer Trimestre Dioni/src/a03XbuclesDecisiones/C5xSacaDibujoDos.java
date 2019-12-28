package a03XbuclesDecisiones;

/**
 * Escriba un programa que lea un número N y realice el siguiente dibujo (Ej:
 * suponiendo N igual a 4): + *+ **+ ***+
 * 
 * @author LurkerAnt
 *
 */
public class C5xSacaDibujoDos {

	public static void main(String[] args) {
		String movida = "+";

		System.out.println(movida);

		for (int i = 0; i <= 2; i++) {
			movida = "*" + movida;
			System.out.println(movida);
		}
	}
}
