package examen_files;

import java.io.*;

public class Pruebas {

	public static void main(String[] Args) throws IOException {
		Persona persona1 = new Persona("Juan", 12);
		Persona persona2 = new Persona("Pepe", 12);
		Persona persona3 = new Persona("María", 12);

		String[] personas = new String[] { persona1.toString(), persona2.toString(), persona3.toString() };
		System.out.println(persona3);

		File file1 = null;
		FileWriter fileWriter = null;
		FileReader fileReader = null;
		BufferedReader bufferReader = null;
		String persona = null;
		try {

			file1 = new File("./personas.txt");
			if (!file1.exists()) {
				file1.createNewFile();
			}
			fileWriter = new FileWriter(file1);

			for (int i = 0; i < personas.length; i++) {
				persona = personas[i];
				fileWriter.write(persona+" \n");
				System.out.println("Se ha grabado la persona.");
			}

			fileWriter.close();

			fileReader = new FileReader(file1);
			bufferReader = new BufferedReader(fileReader);
			String linea = bufferReader.readLine();

			while (linea != null) {
				System.out.println(linea);
				linea = bufferReader.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

		}

	}

}
