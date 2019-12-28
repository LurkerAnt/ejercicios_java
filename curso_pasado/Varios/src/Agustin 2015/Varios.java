package secuenciales;

public class Varios {

	static int aleatorio(int rango){
		return (int) (Math.random() * rango);
	}
	public static void main(String[] args) {
		long n;
		//n = (long) Math.floor(Math.random() * 10) + 1;
		//n = (long) (Math.random() * 11 + 10);
		System.out.println(aleatorio(10));
	}

}
