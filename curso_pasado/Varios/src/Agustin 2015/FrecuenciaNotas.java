package bucles;

import java.util.Random;

public class FrecuenciaNotas {

	public static void main(String[] args) {
		int nA = 30;
		int nota;
		int rN01;
		int rN02;
		int rN03;
		int rN04;
		rN01= rN02= rN03= rN04= 0;
		Random r = new Random();
		for (int a = 1; a <= nA; a++) {
			nota = r.nextInt(4) + 1;
			switch (nota) {
			case 1:
				rN01++;
				break;
			case 2:
				rN02++;
				break;
			case 3:
				rN03++;
				break;
			case 4:
				rN04++;
				break;
			default:
				break;
			}
		}
		System.out.println("de 1: " + rN01);
		System.out.println("de 2: " + rN02);
		System.out.println("de 3: " + rN03);
		System.out.println("de 4: " + rN04);
	}

}
