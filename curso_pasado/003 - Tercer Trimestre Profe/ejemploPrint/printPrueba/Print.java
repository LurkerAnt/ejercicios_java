package printPrueba;

import java.io.FileNotFoundException;
import java.io.PrintWriter;;

public class Print {
	public static void main(String[] Args) {
		PrintWriter fSalida = null;
		String[] info = { "lunes", "martes" };
		Integer[] entero = { 1234, 12 };

		try {
			int i = 0;
			//fSalida = new PrintWriter("salida.txt");
			fSalida=new PrintWriter("index.html");
			fSalida.printf("<html>\n");
			fSalida.printf("<head>\n");
			fSalida.printf("<title>\n");
			fSalida.printf("Una página desde JAVA\n");
			fSalida.printf("</title>\n");
			fSalida.printf("</head>\n");
			fSalida.printf("<body>\n");
			for (int j=0;j<10;j++) {
			fSalida.printf("<p style='color:blue';>%s %10d</p>\n", "Cuerpo del documento desde JAVA", j);
			}
			
			fSalida.printf("</body>\n");
			fSalida.printf("</html>\n");
			// for (String string : info) {
			// fSalida.printf("%-10s%5d\n", string, entero[i++]);

			// el simbolo - hace que se justifique a la izquierda, eso es para strings.
			// }
			fSalida.println();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (fSalida != null) {
				fSalida.close();
			}

			// Pasar los vuelos a un documento de texto, justificandolos y poniendolos
			// bonitos.
		}
	}
}
