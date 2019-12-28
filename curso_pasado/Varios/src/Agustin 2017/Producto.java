
public class Producto {

	public static int producto(int mdo, int mdor) {
		// 5 * 3 = 5 + 5 + 5
		int resultado= 0;
		int positivo;
		if(mdo != 0 && mdor != 0) {
			positivo= Math.abs(mdor);
			for(int s= 1; s <= positivo; s++) {
				resultado += mdo;
				//System.out.println(resultado);
			}
		}
		// condicion adecuada
		return resultado;
	}
	public static void main(String[] args) {
		System.out.println(producto(-4, -7));
	}

}
