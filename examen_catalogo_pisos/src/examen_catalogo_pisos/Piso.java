package examen_catalogo_pisos;

import java.io.Serializable;
import java.util.InputMismatchException;

/*
 * Piso

    • Es una Vivienda
    • Tiene los atributos: planta (entero) y puerta (carácter)
    • los atributos son observables y no modificables.
    • Dos pisos se ordenan de forma natural por dirección, planta y puerta, en ese orden.
    • Dos pisos serán iguales si su dirección, planta y puerta coinciden.
 */

public class Piso extends Vivienda {
	private static final long serialVersionUID = 1L;
	private int planta;
	private char puerta;

	/*
	 * 3. Codifica para el tipo Piso dos constructores: 1. Uno recibe un argumento
	 * por cada propiedad.
	 */

	public Piso() {
		super();
		this.planta = introducePlanta();
		this.puerta = introducePuerta();
	}

	// 1. Uno recibe un argumento por cada propiedad.
	public Piso(int i, double d, double e, String operacion, String direccion, int j,
			char c) {
		super(i, d, e, operacion, direccion);
		this.planta = j;
		this.puerta = c;

	}

	// 2. Otro recibe un argumento del tipo cadena en la que los valores de cada
	// propiedad est�n separados por una coma.
	public Piso(String infoVivienda) {
		String[] listaVivienda = new String[7];
		listaVivienda = infoVivienda.split(",");
		new Piso(Integer.parseInt(listaVivienda[0]), Double.parseDouble(listaVivienda[1]),
				Double.parseDouble(listaVivienda[2]), listaVivienda[3], listaVivienda[4],
				Integer.parseInt(listaVivienda[5]), listaVivienda[6].charAt(0));
	}

	public int getPlanta() {
		return planta;
	}

	public char getPuerta() {
		return puerta;
	}

	private Integer introducePlanta() {

		Integer plantaBuena;
		try {
			System.out.println("Introduce la Planta de la vivienda, si es un bajo ponga 0: \n");
			plantaBuena = teclado.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Lo introducido no es un número, vuelva a intentarlo.");
			plantaBuena = introducePlanta();
		}

		return plantaBuena;
	}

	private char introducePuerta() {

		char puertaBuena;

		try {
			System.out.println("Introduce la Puerta de la vivienda, si no tiene puerta ponga 0: \n");
			puertaBuena = teclado.nextLine().charAt(0);
			if (!Character.isLetterOrDigit(puertaBuena)) {
				throw new InputMismatchException();
			}
		} catch (InputMismatchException e) {
			System.out.println("Lo introducido no es un número o letra, vuelva a intentarlo.");
			puertaBuena = introducePuerta();
		}

		return puertaBuena;
	}
	
	//Metodo comprobacion si son el mismo piso, si lo son devuelve true.
	
	public boolean sonElMismoPiso(Piso b) {
		return this.sonLaMismaVivienda(b.getDireccion()) && this.getPlanta().equals(b.getPlanta())
				&& this.getPuerta().equals(b.getPuerta());
	}

	@Override
	public String toString() {
		return String.format(
				"%d. Superficie: %.2f, Precio: %.2f, Operación: %s, Dirección: %s., Planta: %d, Puerta: %c.",
				this.getOrden(), this.getSuperficie(), this.getPrecio(), this.getOperacion(), this.getDireccion(),
				this.planta, this.puerta);
	}

}
