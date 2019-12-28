package banco;
/*
 * Crear clase Titular que tenga: Las propiedades privadas nombre (String), apellidos (String), 
 * numero de identificaci�n (String), edad (int), otros que creas necesarios.
 */
public class Titular {
	private String nombre;
	private String apellidos;
	private String identificacion;
	private Integer edad;
	
	//Un getter para cada uno de los atributos.

	public String getNombre() {
		return nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public String getIdentificacion() {
		return identificacion;
	}
	
	public Integer getEdad() {
		return edad;
	}
	
	//Un setter solo para el edad.
	
	public void setEdad(Integer age) {
		this.edad=age;
	}

	//M�todo que retorne toda la informaci�n del titular.
	
	@Override
	public String toString() {
		return "Titular N�: " + identificacion  + "\n" + "Nombre: " +  nombre + "\n" +  "Apellidos=" + apellidos + "\n" + "Edad: " + edad;
	}
	
	
}
