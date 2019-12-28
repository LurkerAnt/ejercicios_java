
public class Pruebas {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(Metodos.aleatorio(10, 20));
		}
		System.out.println(Metodos.resto(12, 4));
		System.out.println(Metodos.resto(12, 5));
		System.out.println(Metodos.resto(12, 24));
		System.out.println(Metodos.resto(12, 0));
		System.out.println(Metodos.resto(0, 4));
		System.out.println(Metodos.resto(1255555, 1));
		int n= Metodos.entradaInt("Dame un entero: ");
		System.out.println(n);
	}
}
