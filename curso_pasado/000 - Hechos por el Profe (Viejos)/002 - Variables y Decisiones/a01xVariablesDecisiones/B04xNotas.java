package a01xVariablesDecisiones;

public class B04xNotas {

	public static void main(String[] args) {
		int nota = 6;
		/*
		 * switch(nota){ case 0: case 1: case 2: System.out.println("MD"); break; case
		 * 3: case 4: System.out.println("INs"); break; case 5:
		 * System.out.println("Suf"); break; default:
		 * System.out.println("Nota n o válida"); }
		 */
		if (nota < 0)
			System.out.println("Nota n o válida");
		else if (nota < 3)
			System.out.println("MD");
		else if (nota < 5)
			System.out.println("INs");
		else if (nota < 6)
			System.out.println("Suf");
		else if (nota < 7)
			System.out.println("Bien");
		else if (nota == 7 || nota == 8)
			System.out.println("Not");
		else if (nota == 10)
			System.out.println("Sob");
		else
			System.out.println("Nota n o válida");

	}

}
