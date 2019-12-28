package teachermade003;

public class SumasSucesivas {

	public static int producto(int multiplicando, int multiplicador) {

		// 5*3 = 5 + 5 + 5
		int resultado = 0;
		int positivo;
		if (multiplicando != 0 && multiplicador != 0) {
			positivo = Math.abs(multiplicador);
			for (int sumas = 1; sumas <= positivo; sumas++) {
				resultado += multiplicador;
				System.out.println(resultado);
			}
		}
		// condicion
		if (multiplicador < 0)
			return resultado;
	}

	public static void main(String[] args) {
		System.out.println(producto(5, 6));

	}

}
