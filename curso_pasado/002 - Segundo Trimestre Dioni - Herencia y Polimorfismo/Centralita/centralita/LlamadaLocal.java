package centralita;

public class LlamadaLocal extends Llamada {
	
	public LlamadaLocal(String numeroOrigen, String numeroDestino) {
		super.setNumeroOrigenLlamada(numeroOrigen);
		super.setNumeroDestinoLlamada(numeroDestino);
		super.setTipoLlamada('l');
		super.setPrecioLlamada(0.15);
	}
	
	public LlamadaLocal() {
		super.setNumeroOrigenLlamada();
		super.setNumeroDestinoLlamada();
		super.setTipoLlamada();
		super.setPrecioLlamada(0.15);
	}
	
	public void setPrecioLlamada() {
		super.setPrecioLlamada(0.15);
	}
	public Double getPrecioLlamada() {
		return super.getPrecioLlamada();
	}
	
	

}
