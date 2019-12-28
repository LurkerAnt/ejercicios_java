package gestion;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class DAOpersona {
//create, read, update, delete
	public static int NumeroRegistrosMaximo = 100;
	public static String ARCHIVO = "persona.datos";
	private RandomAccessFile raf;

	public DAOpersona() throws FileNotFoundException {
		this.raf = new RandomAccessFile(ARCHIVO, "RW");
	}

	public int bytesRegistro() {
		// codigo+nombre+edad+domicilio+estadoCivil
		return 4 + 50 + 2 + 4 + 50 + 2 + 1;
	}

	public void crearArchivo() throws IOException {
		for (int numeroRegistro = 0; numeroRegistro <= NumeroRegistrosMaximo; numeroRegistro++) {
			raf.seek(numeroRegistro * bytesRegistro());
			raf.writeByte(0);
			raf.writeInt(p.getCodigo());
			String nombre =String.format("%1$-50s",  p.getNombre()); 
			raf.writeUTF(nombre);
			raf.writeInt(p.getEdad());
			String domicilio =String.format("%1$-50s",  p.getDomicilio());
			raf.writeUTF(domicilio);
			raf.writeByte(p.getECivil());
		}
	}
	
	public void modifica(Persona p) throws IOException{
		graba(p);
	}
	
	public Persona lee (int codigo) {
		return new Persona();
	}
	
	public void borra (int codigo) throws IOException{
		validaRango(codigo);
		raf.seek(codigo * bytesRegistro());
		raf.writeByte(2);
	}
	
	public void validaRango(int codigo) {
		if(codigo<=0||codigo>NumeroRegistrosMaximo)
			trow new DAOException ("Número de registro no valido.");
	}
	
	public void fin() throws IOException{
		raf.close();
	}
	
	//operaciones basicas fichero
	
	public void graba () throws IOException {
		raf.seek(p.getCodigo()* bytesRegistro());
		raf.write(1);
	}
	
	
	public boolean estaActivo(int codigo) throws IOException {
		raf.seek(codigo * bytesRegistro());
		byte usado = raf.readByte();
		return usado !=0;
	}
}
