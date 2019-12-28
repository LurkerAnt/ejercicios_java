package ejerciciosComplejosSolo;

public class BolasProfeArrays {
	static final int N_D_BOLAS = 10;

	public static void main(String[] args) {

		int bolaExtraida;

		/*
		 * int bola1; int bola2; int bola3; int bola4; int bola5;
		 */
		int[] bola;
		bola = new int[N_D_BOLAS];

		for (int i = 0; i < bola.length; i++) { // esto es la inicializacion de array
			bola[i] = 0;
		}
		// int millon =1000000;
		// int extracciones =1;
		// int acm1, acm2, acm3, acm4, acm5, acm6, acm7, acm8, acm9, acm10;

		// acm1= acm2= acm3= acm4= acm5= acm6= acm7= acm8= acm9= acm10= 0;

		for (int extracciones = 1; extracciones <= 1000000; extracciones++) {
			bolaExtraida = (int) (Math.random() * N_D_BOLAS) + 1;
			System.out.println(bolaExtraida);
			bola[bolaExtraida - 1]++;

			/*
			 * switch(bolaExtraida-1) { case 1: bola[0]++;break;//siempre empieza en la
			 * casilla 0 case 2: bola[1]++;break; case 3: bola[2]++;break; case 4:
			 * bola[3]++;break; case 5: bola[4]++;break; case 6: bola[5]++;break; case 7:
			 * bola[6]++;break; case 8: bola[7]++;break; case 9: bola[8]++;break; case 10:
			 * bola[9]++;break; default: break; }
			 */
		}
		for (int i = 0; i < N_D_BOLAS; i++) {
			System.out.printf("La bola %d: %d \n", i + 1, bola[i]);
		}
		/*
		 * System.out.println("La bola 1: " + bola[0]); System.out.println("La bola 2: "
		 * + bola[1]); System.out.println("La bola 3: " + bola[2]);
		 * System.out.println("La bola 4: " + bola[3]); System.out.println("La bola 5: "
		 * + bola[4]); System.out.println("La bola 6: " + bola[5]);
		 * System.out.println("La bola 7: " + bola[6]); System.out.println("La bola 8: "
		 * + bola[7]); System.out.println("La bola 9: " + bola[8]);
		 * System.out.println("La bola 10: " + bola[9]);
		 */

	}
}
