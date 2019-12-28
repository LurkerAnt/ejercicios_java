package bucles;
public class Invertir {
	public static void main(String[] args) {
		int numero;
		int invertido;
		int division;
		int resto;
		
		numero= 43234;
		invertido= 0;
		division= numero;
		resto= 0;
		while (division > 0){
			resto= division % 10;
			division = division / 10;
			invertido = invertido * 10 + resto;					
		}
		System.out.println(invertido);
		
		if(invertido == numero)
			System.out.println("si cap");
		else
			System.out.println("NO cap");
	}
}




