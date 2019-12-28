package persona;

public class Persona {
	private String nombre;
	private int edad;
	private double altura;

	public Persona(String nombre, int edad, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
	}

	public Persona() {
		this.nombre = "Luisa Perez";
		this.edad = 22;
		this.altura = 1.70;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public double getAltura() {
		return altura;
	}

	public void mostrarDatos(Persona A) {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Edad: " + this.edad);
		System.out.println("Altura: " + this.altura);
	}

}