package asignacionOperadoresCasting;

public class B1xAsteriscosSunas {

	public static void rectangulo(int base, int altura) {
		int b;
		int h;
		for (h = 1; h <= altura; h++) {
			for (b = 1; b <= base; b++) {
				if (h == b)
					System.out.println("+");
				else if (h + b == base + 1)
					System.out.println("X");
				else
					System.out.println("*");
			}
			System.out.println("");
		}
	}

	public static void rectangulo1(int filas) {
		int c;
		int f;
		int columnas = filas;
		for (f = 1; f <= filas; f++) {
			for (c = 1; c <= f; c++) { // para que solo saque el número de caracteres que coincida con la fila en la
										// que se esta se utiliza la variable de control
				if (f == c)
					System.out.println("+");
				else if (f + c == filas + 1)
					System.out.println("X");
				else
					System.out.println("*");
			}
			System.out.println("");
		}
	}

	public static void main(String[] Args) {
		int base, altura;
		base = altura = 10;
		rectangulo(base, altura);
	}
}
