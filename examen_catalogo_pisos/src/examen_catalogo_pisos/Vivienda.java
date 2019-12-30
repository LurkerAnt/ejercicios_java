
package examen_catalogo_pisos;

import java.util.Scanner;

/**
 * 
 * @author dioni
 *
 *         Vivienda • Sus atributos son: Orden (entero), superficie (real mayor
 *         que cero), precio (real mayor que cero), operación (con los valores
 *         ALQUILER y VENTA) y dirección (cadena no nula). • Todos los atributos
 *         son observables y solo el precio es modificable. • Dos viviendas
 *         serán iguales si su dirección coincide.
 *
 */
public class Vivienda implements MetodosUtiles {
	private Integer orden = 0;
	private Double superficie;
	private Double precio;
	private String operacion;
	private String direccion;
	Scanner teclado = new Scanner(System.in);

	public Vivienda() {
		this.orden = orden + 1;
		System.out.println("Introduce la superficie: \n");
		this.superficie = teclado.nextDouble();
		System.out.println("Introduce el precio: \n");
		this.precio = teclado.nextDouble();
		System.out.println("Introduce el tipo the operación: \n");
		String operacionARealizar = teclado.nextLine();
		if (operacionARealizar.contentEquals("ALQUILER") || operacionARealizar.contentEquals("VENTA")) {
			this.operacion = operacionARealizar;
		} else {
			System.out.println("Operación a realizar no válida introduzca 'Venta' o 'Alquiler': \n");
			String entrada = teclado.nextLine();
			this.operacion = entrada.toUpperCase();
		}
		System.out.println("Introduce la dirección: \n");
		String direccion2 = teclado.nextLine();
		if (direccion2 != null) {
			this.direccion = direccion2;
		} else {
			System.out.println("Dirección no valida vuelva a introducirla: \n");
			this.direccion = teclado.nextLine();
		}

	}

	public Vivienda(Integer orden, Double superficie, Double precio, String operacionARealizar, String direccion2) {
		super();
		this.orden = orden;
		this.superficie = superficie;
		this.precio = precio;
		if (operacionARealizar.contentEquals("ALQUILER") || operacionARealizar.contentEquals("VENTA")) {
			this.operacion = operacionARealizar;
		} else {
			System.out.println("Operación a realizar no válida introduzca 'Venta' o 'Alquiler': \n");
			String entrada = teclado.nextLine();
			this.operacion = entrada.toUpperCase();
		}
		if (direccion2 != null) {
			this.direccion = direccion2;
		} else {
			System.out.println("Dirección no valida vuelva a introducirla: \n");
			this.direccion = teclado.nextLine();
		}
	}

	// METODOS DE CONSULTA
	public Integer getOrden() {
		return orden;
	}

	public Double getSuperficie() {
		return superficie;
	}

	public Double getPrecio() {
		return precio;
	}

	public String getOperacion() {
		return operacion;
	}

	public String getDireccion() {
		return direccion;
	}

	// METODO DE SET PRECIO (SOLO SE PUEDE CAMBIAR EL PRECIO)
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean sonLaMismaVivienda(String direccion2) {
		return this.direccion.equals(direccion2);
	}

	@Override
	public String toString() {
		return String.format("%d. Superficie: %.2f, Precio: %.2f, Operación: %s, Dirección: %s.", this.orden,
				this.superficie, this.precio, this.operacion, this.direccion);
	}

}
