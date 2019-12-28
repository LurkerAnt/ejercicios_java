package centralita;

import java.util.Scanner;

public class Llamada {
	private String numeroOrigen;
	private String numeroDestino;
	private Character tipoLlamada;
	private Double  precioLlamada;
	Scanner teclado = new Scanner(System.in);

	public Character getTipoLlamada() {
		return this.tipoLlamada;
	}

	public void setTipoLlamada(Character tipoLlamada) {
		if (tipoLlamada != 'l' || tipoLlamada != 'p') {
			System.out.println("Tipo de llamada erroneo, vuelve a introducirlo. ");
			this.setTipoLlamada();
		} else {
			this.tipoLlamada = tipoLlamada;
		}

	}

	public void setTipoLlamada() {
		System.out.println("Introduce el tipo de Llamada, Provincial o Local: ");
		this.tipoLlamada = teclado.next().charAt(0);
		this.tipoLlamada = Character.toLowerCase(this.tipoLlamada);
	}

	public Double getPrecioLlamada() {
		return this.precioLlamada;
	}
	
	public void setPrecioLlamada(Double precioLlamada) {
		this.precioLlamada=precioLlamada;
	}

	public String getNumeroOrigneLlamada() {
		return this.numeroOrigen;
	}

	public void setNumeroOrigenLlamada(String numeroOrigen) {
		this.numeroOrigen = numeroOrigen;
	}

	public void setNumeroOrigenLlamada() {
		System.out.println("Introduce el número de Origen: ");
		this.numeroOrigen = teclado.next();
	}

	public String getNumeroDestinoLlamada() {
		return this.numeroDestino;
	}

	public void setNumeroDestinoLlamada(String numeroDestino) {
		this.numeroDestino = numeroDestino;
	}

	public void setNumeroDestinoLlamada() {
		System.out.println("Introduce el número de Destino: ");
		this.numeroDestino = teclado.next();
	}
}
