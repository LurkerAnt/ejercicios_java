package centralita;

public class LlamadaProvincial extends Llamada {

	private Integer franjaLlamada;

	public LlamadaProvincial (String numeroOrigen, String numeroDestino, Integer franjaHoraria) {
		super.setNumeroOrigenLlamada(numeroOrigen);
		super.setNumeroDestinoLlamada(numeroDestino);
		super.setTipoLlamada('p');
		this.setPrecioLlamada(franjaHoraria);
		this.franjaLlamada=franjaHoraria;
	}
	
	public Double getPrecioLlamada() {
		return super.getPrecioLlamada();
	}
	
	public Integer getFranjaLlamada() {
		return this.franjaLlamada;
	}

	public void setFranjaLlamada(Integer franjaLlamada) {
		this.franjaLlamada = franjaLlamada;
	}
	
	public void setPrecioLlamada(Integer franjaHoraria) {
		if (franjaHoraria==1) {
			super.setPrecioLlamada(0.20);
		}else if (franjaHoraria==2) {
			super.setPrecioLlamada(0.25);
		}else if (franjaHoraria==3) {
			super.setPrecioLlamada(0.30);
		}else if (franjaHoraria>3|| franjaHoraria<0) {
			while (franjaHoraria>3|| franjaHoraria<0) {
				System.out.println("Franja horaria erronea. Vuelve a introducirla.");
				this.setFranjaLlamada(teclado.nextInt());
			}
		}
	}
	
	
	
}
