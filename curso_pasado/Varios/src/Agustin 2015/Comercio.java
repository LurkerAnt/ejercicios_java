package alternativas;

public class Comercio {

	public static void main(String[] args) {
		float precio;
		float precioParcial;
		float impuestos;
		float descuento;
		float descuentoTotal;
		
		precio= 121;
		
		if(precio < 50)
			descuento= 0;
		else if(precio < 100)
			descuento= 5;
		else 
			descuento= 10;
		descuentoTotal= precio*descuento/100;
		precioParcial= precio - descuentoTotal;
		impuestos= precioParcial * 15 / 100;
		
		System.out.println("precio inicial: " + precio);
		System.out.println("decuento del " + descuento + "%: " + descuentoTotal);
		System.out.println("impuestos 15%: " + impuestos);
		System.out.println("precio final: " + (precioParcial + impuestos));
	}
/*
		if(precio < 50)
			System.out.println("precio final: " + precio*1.15);
		else if(precio < 100){
			System.out.println("precio final: " + (precio*0.95)*1.15);
			
			}
		else 
			System.out.println("precio final: " + (precio*0.90)*1.15);
	}
*/
}
