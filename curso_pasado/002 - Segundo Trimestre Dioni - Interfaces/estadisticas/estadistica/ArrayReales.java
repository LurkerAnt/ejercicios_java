package estadistica;

public class ArrayReales implements Estadisticas {
	private Double[] estadisticas;

	public ArrayReales() {
		this.estadisticas = new Double[3];
	}

	public ArrayReales(minimo, maximo, sumatorio) {
		this.minimo=minimo;
		this.maximo=maximo;
		this.sumatorio=sumatorio;
		this.estadisticas=new Double [minimo,maximo, sumatorio];
	}
}
}