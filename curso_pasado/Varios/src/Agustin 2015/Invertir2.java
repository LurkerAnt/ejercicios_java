package bucles;

public class Invertir2 {

	public static void main(String[] args) {
		int auxiliar;
		int numero= 2111143234;
		int digitos;
		int invertido;
		int resto;
		int auxDigitos;
		int potencia10;
		
		// calcula número dígitos
		auxiliar= numero;
		digitos = 1;
		while (Math.abs(auxiliar) > 9) {
			digitos++;
			auxiliar = auxiliar / 10;
		}
		System.out.printf("El %d tiene %d dígitos\n", numero, digitos);

		int base= 10;
		int exponente= digitos - 1;
		potencia10= 1;
		while(exponente > 0){
			potencia10 = potencia10 * 10;
			exponente--;
		}
		
		// calcula invertido del número
		auxiliar= numero;
		invertido= 0;
		auxDigitos= digitos;
		while(auxDigitos > 0){
			resto = auxiliar % 10;
			auxDigitos--;
			//potencia10= (int)Math.pow(10, auxDigitos);
			invertido = (invertido + resto * potencia10);
			potencia10 /= 10;
			auxiliar = auxiliar / 10;			
		}
		
		if(invertido == numero)
			System.out.println("si cap");
		else
			System.out.println("NO cap");	}
}
