package ejerciciosComplejosSolo;

public class BolasProfe {

	static final int N_D_BOLAS = 10;

	public static void main(String[] args) {
		int bolaExtraida;
		int millon = 1000000;
		int extracciones = 1;
		int acm1, acm2, acm3, acm4, acm5, acm6, acm7, acm8, acm9, acm10;

		acm1 = acm2 = acm3 = acm4 = acm5 = acm6 = acm7 = acm8 = acm9 = acm10 = 0;

		for (extracciones = 1; extracciones <= millon; extracciones++) {
			bolaExtraida = (int) (Math.random() * N_D_BOLAS) + 1;
			System.out.println(bolaExtraida);
			switch (bolaExtraida) {
			case 1:
				acm1++;
				break;
			case 2:
				acm2++;
				break;
			case 3:
				acm3++;
				break;
			case 4:
				acm4++;
				break;
			case 5:
				acm5++;
				break;
			case 6:
				acm6++;
				break;
			case 7:
				acm7++;
				break;
			case 8:
				acm8++;
				break;
			case 9:
				acm9++;
				break;
			case 10:
				acm10++;
				break;
			default:
				break;
			}
		}
	}
}
