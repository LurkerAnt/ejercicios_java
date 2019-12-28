package ejerciciosComplejosSolo;

public class Bolas {

	public static void mail(String[] args) {
		int bola;
		int millon = 1000000;
		int extracciones = 1;
		int acm1 = 0, acm2 = 0, acm3 = 0, acm4 = 0, acm5 = 0, acm6 = 0, acm7 = 0, acm8 = 0, acm9 = 0, acm10 = 0;

		for (extracciones = 1; extracciones <= millon; extracciones++) {
			bola = ((int) (Math.random() * 10 + 1));
			System.out.println(bola);
			if (bola == 1) {
				acm1++;
			}
			if (bola == 2) {
				acm2++;
			}
			if (bola == 3) {
				acm3++;
			}
			if (bola == 4) {
				acm4++;
			}
			if (bola == 5) {
				acm5++;
			}
			if (bola == 6) {
				acm6++;
			}
			if (bola == 7) {
				acm7++;
			}
			if (bola == 8) {
				acm8++;
			}
			if (bola == 9) {
				acm9++;
			}
			if (bola == 10) {
				acm10++;
			}
		}

	}

}
