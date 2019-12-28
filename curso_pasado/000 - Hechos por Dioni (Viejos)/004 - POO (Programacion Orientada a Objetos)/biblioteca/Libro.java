package biblioteca;

import java.util.Scanner;

public class Libro {

	private String titulo;
	private String autor;
	private String isbn;

	Scanner T = new Scanner(System.in);

	public Libro(String titulo, String autor, String isbn) {
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void cambia_isbn(String isbn) {
		boolean longitud = false;
		boolean correcto = false;
		
		if (isbn.length() <= 10) {
			longitud = true;
		}
		if (longitud = true) {
			this.isbn = isbn;
		}
		for(Integer index=0; index<=isbn.length(); index++) {	
			Integer chekisbn;
			int checkisbn = chekisbn + Integer.valueOf(isbn.indexOf(index));
		}
		if ()
		
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", isbn=" + isbn + "]";
	}

}
