package asignacionOperadoresCasting;

public class B3xCifradiDelCesar {

	static String encriptacionCesar(String cadena, int desplazamiento) {
		int posicion, nuevaPosicion;
		char letra, nuevaLetra;
		String encriptada = "";
		String abc = new String("ABCDEFGHIJKLMNÑOPQRSTUVWXYZ");
		for (int p = 0; p < cadena.length(); p++) {
			letra = cadena.charAt(p);
			posicion = abc.indexOf(letra);
			nuevaPosicion = (posicion + desplazamiento) % abc.length();
			nuevaLetra = abc.charAt(nuevaPosicion);
			encriptada += nuevaLetra;
		}
		return encriptada;

	}

	static String desencriptadoCesar(String cadena, int desplazamiento) {
		int posicion, nuevaPosicion;
		char letra, nuevaLetra;
		String encriptada = "";
		String abc = new String("ABCDEFGHIJKLMNÑOPQRSTUVWXYZ");
		for (int p = 0; p < cadena.length(); p++) {
			letra = cadena.charAt(p);
			posicion = abc.indexOf(letra);
			System.out.println(posicion);
			nuevaPosicion = (posicion - desplazamiento + abc.length()) % abc.length();
			System.out.println(nuevaPosicion);
			nuevaLetra = abc.charAt(nuevaPosicion);
			encriptada += nuevaLetra;
		}
		return encriptada;
	}

	// haz un metodo con esta mierda
	static int compara(String c1, String c2) {
		int resultado = 0;
		// resultado --> 0 si iguales
		// resultado --> + si c1>c2
		// resultado --> - si c2<c2
		return resultado;
	}

	public static void main(String[] args) {
		System.out.println(encriptacionCesar("DADO", 3));
		System.out.println(des);
	}

}
//Dada una cadena invertirla
//Hcer un metodo que devuelva un boolean y que diga si una frase es un palindromo.