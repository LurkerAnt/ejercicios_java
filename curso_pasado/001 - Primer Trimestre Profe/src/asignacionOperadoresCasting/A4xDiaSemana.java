package asignacionOperadoresCasting;

import java.util.Scanner;

public class A4xDiaSemana {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		String diaAlfa;
		int diaNum;
		System.out.println("Dia: ");
		diaAlfa = teclado.nextLine();
		switch (diaAlfa.toLowerCase()) {
		case "lunes":
			diaNum = 1;
			break;
		case "martes":
			diaNum = 2;
			break;
		case "miercoles":
			diaNum = 3;
			break;
		case "jueves":
			diaNum = 4;
			break;
		}
		System.out.println(diaAlfa + ": " + diaNum);

	}

}
