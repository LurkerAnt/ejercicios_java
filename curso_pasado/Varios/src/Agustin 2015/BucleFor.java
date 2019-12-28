package bucles;

public class BucleFor {

	public static void main(String[] args) {
		int variable= 1;
		System.out.println("inicio");
		variable= 1;
		while (variable <= 20) {
			System.out.println("cuerpo " + variable);
			variable++;
		}
		System.out.println("fin");

		System.out.println("inicio");
		for (variable= 1; variable <= 20 ; variable++ ) {
			System.out.println("cuerpo " + variable);
		}
		System.out.println("fin");

	}

}
