
public class SimularExtracciones {
	static final int N_D_BOLAS= 3;

	public static void main(String[] args) {
		int bolaExtraida;
		
		int [] bola;
		bola = new int[N_D_BOLAS] ;
		
		for (int i = 0; i < bola.length; i++) {
			bola[i]= 0;			
		}
		
		for(int extraccion= 1; extraccion <= 1000; extraccion++) {
			bolaExtraida= (int)(Math.random() * N_D_BOLAS) + 1;
			bola[bolaExtraida - 1]++;
		}
		for (int i = 0; i < N_D_BOLAS; i++) {
			System.out.printf("La bola %d: %d\n", i+1, bola[i]);
		}
	}

}
