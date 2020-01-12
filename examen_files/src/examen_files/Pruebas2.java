package examen_files;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Pruebas2 {

	public static void main(String[] args) {

		Persona persona1 = new Persona("Juan", 12);
		Persona persona2 = new Persona("Pepe", 12);
		Persona persona3 = new Persona("María", 12);

		try {
			FileOutputStream fos = new FileOutputStream("./personas.dat");
			ObjectOutputStream objetoOutput = new ObjectOutputStream(fos);

			objetoOutput.writeObject(persona1);
			objetoOutput.writeObject(persona2);
			objetoOutput.writeObject(persona3);

			objetoOutput.close();

			FileInputStream fis = new FileInputStream("./personas.dat");
			ObjectInputStream objetoInput = new ObjectInputStream(fis);
			Persona p = (Persona) objetoInput.readObject();
			while (fis.available() >= 0) {
				System.out.println(p);
				p = (Persona) objetoInput.readObject();
			}

			objetoInput.close();

		} catch (EOFException e) {
			System.out.println("Ya no hay mas gente.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
		}
	}
}
