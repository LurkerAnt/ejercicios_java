package examen_catalogo_pisos;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
import java.util.stream.Collectors;

//Un catalogo con Un atributo para almacenar pisos: elige una estructuras de datos de las explicadas en clase.
/*
 * Problema 2 Para el tipo Catalogo, gesti�n de estructuras de datos y ficheros diversos.

    1. Codifica un m�todo para cargar el fichero de texto anterior en un cat�logo: ya sabes, lee cada linea del fichero de texto, crea un objeto de Piso y a��delo bien al cat�logo.
    2. Codifica un m�todo para serializar los objetos del catalogo en el archivo �pisos.ser�
    3. Dada una planta �p� graba un archivo de textos en los pisos que est�n por debajo de ella.
    4. M�todo que recibe un String valor con �Alquiler� o �Venta� y devuelve el n�mero de pisos de esa operaci�n.
    5. M�todo que dado un precio �p� y una superficie �s� devuelve un Catalogo con los pisos con superficie mayor que �s� y precio menor que �p�.
    6. M�todo para ordenar el catalogo por superficie, orden alternativo.
    7. M�todo para que dada una superficie �s� y un porcentaje �p� rebaja el precio de los pisos con una superficie mayor que �s� un porcentaje �p�.

 * 
 */

public class Catalogo {
	
	private List <Piso> listaViviendas= new ArrayList<Piso>();
	
	
	//constructor por defecto
	public Catalogo() {
		super();
	}
	
	//constructor con parametros
	public Catalogo(List<Piso> listaViviendas) {
		super();
		this.listaViviendas = listaViviendas;
	}

	public void cargarCatalogo() {
		try {
			this.listaViviendas = Catalogo.leerPisos("pisos.ser");
		} catch (Exception e) {
			System.err.println("Ha habido un error importando el fichero de pisos.ser");
			e.printStackTrace();
		}
	}
	
	public void volcarCatalogo(Integer planta) {
		try {
			List<Piso> tempList = this.listaViviendas;
			if (planta != null) {
				tempList = this.listaViviendas.stream().filter(piso -> {
					return piso.getPlanta() > planta;
				}).collect(Collectors.toList());
			}
			
			Catalogo.grabarPisos(tempList, "pisos.ser");
		} catch (Exception e) {
			System.err.println("Ha habido un error volcando el fichero de pisos.ser");
			e.printStackTrace();
		}
	}
	
	public void volcarCatalogo() {
		this.volcarCatalogo(null);
	}
	
	public int porOperacion(String operacion) {
		return this.listaViviendas.stream().filter(piso -> {
			return piso.getOperacion().equalsIgnoreCase(operacion);
		}).collect(Collectors.toList()).size();
	}
	
	public void addPiso(Piso v) {
		listaViviendas.add(v);
	}
	
	public void mostrarListaPisos() {
		//expresion lambda útil para mostrar todos los elementos de la lista.
		listaViviendas.forEach(System.out::println);
	}
	
	public static void grabarPisos(List<Piso> pisos, String ruta) throws Exception {
		ObjectOutputStream objectOutputStream 
			= new ObjectOutputStream(new FileOutputStream(ruta));
		try {
			for (Piso piso: pisos) {
				objectOutputStream.writeObject(piso);
			}
		} finally {	
			objectOutputStream.close();
		}
	}
	
	public static List<Piso> leerPisos(String ruta) throws Exception {
		List<Piso> pisos = new ArrayList<Piso>();
		ObjectInputStream objectInputStream 
			= new ObjectInputStream(new FileInputStream(ruta));
		try {
			boolean hayPisos = true;
			while (hayPisos) {
				try {
					pisos.add((Piso) objectInputStream.readObject());
				} catch (EOFException ex) {
					hayPisos = false;
				}
			}
		} finally {
			objectInputStream.close();
		}
		return pisos;
	}
	
	public static void main(String[] args) {
		try {
			//Integer orden, Double superficie, Double precio, String operacion, 
			//String direccion, Integer planta, Character puerta
			Catalogo catalogo = new Catalogo(new ArrayList<Piso>() {{
				add(new Piso(1, 22.0, 22.0, "VENTA", "aaa", 1, 'c'));
				add(new Piso(2, 22.2, 22.1, "ALQUILER", "aaa2", 2, 'b'));
			}});
			System.out.print(catalogo.porOperacion("alquiler"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
}
