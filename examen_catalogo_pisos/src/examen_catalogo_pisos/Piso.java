package examen_catalogo_pisos;

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

	private Integer planta;
	private Character puerta;

	public Piso() {
		super();
		this.planta = introducePlanta();
		this.puerta = introducePuerta();
	}

	public Piso(Integer orden, Double superficie, Double precio, String operacion, String direccion, Integer planta,
			Character puerta) {
		super(orden, superficie, precio, operacion, direccion);
		this.planta = planta;
		this.puerta = puerta;

	}

	public Integer getPlanta() {
		return planta;
	}

	public Character getPuerta() {
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

	private Character introducePuerta() {

		Character puertaBuena;

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

	@Override
	public String toString() {
		return String.format("%d. Superficie: %.2f, Precio: %.2f, Operación: %s, Dirección: %s., Planta: %d, Puerta: %c.", this.getOrden(),
				this.getSuperficie(), this.getPrecio(), this.getOperacion(), this.getDireccion(), this.planta, this.puerta);
	}
	
	

}
