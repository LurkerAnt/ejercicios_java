package examen_catalogo_pisos;
import java.util.*;

//Un catalogo con Un atributo para almacenar pisos: elige una estructuras de datos de las explicadas en clase.


public class Catalogo {
	
	private List <Vivienda> listaViviendas= new ArrayList<Vivienda>();
	
	public void addpiso(Vivienda v) {
		listaViviendas.add(v);
	}
	
	public void mostrarListaPisos() {
		//expresion lambda útil para mostrar todos los elementos de la lista.
		listaViviendas.forEach(System.out::println);
	}
	
	
	
}
