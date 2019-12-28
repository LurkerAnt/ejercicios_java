package asignacionOperadoresCasting;

public class A8ForConmutador {

	public static void main(String[] args) {
		int sP;
		int sI;
		int n;
		boolean par;

		sP = sI = 0;
		par = false;
		for (n = 1; n < 100; n++) {
			if (par == true)
				sP++;
			else
				sI++;
		}
		System.out.printf("Números pares: %d. Números impares: %d.", sP, sI);
	}

}
