package gestion;

import java.io.FileNotFoundException;
import java.io.IOException;

public class testDAO {

	public static void main(String[] args) {
		try {
			DAOpersona daop = new DAOpersona();	
			daop.crearArchivo();
			daop.fin();
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
