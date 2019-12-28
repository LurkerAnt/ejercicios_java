package biblioteca;

import java.util.Scanner;

public class TestLibro {

	public static void main(String[] args) {
		Scanner T = new Scanner(System.in);
		Libro libro1 = new Libro("caca", "de caca", "123456789c");
		String isbn2 = T.nextLine();
		libro1.cambia_isbn(isbn2);
		System.out.println(libro1);

	}

}
