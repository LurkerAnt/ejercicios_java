
public class Capicua {

	public static void main(String[] args) {
		int numero, nInicial;
		int unidades, digitos;
		int invertido;
		
		numero= 285;

		nInicial= numero;
		digitos= 1;
		while(numero > 9){
			numero /= 10;
			digitos++;
		}
		System.out.println(digitos);
		
		numero= nInicial;
		invertido= 0; // 4321
		while(numero > 0){
			unidades= numero % 10;
			invertido= invertido * 10 + unidades;
			numero = numero / 10;
			//digitos--;
		}
		System.out.printf("%d %d\n", nInicial, invertido);
		
		if(nInicial == invertido)
			System.out.println(nInicial + " SI es capi");
		else
			System.out.println(nInicial + " NO es capi");
		
	}

}
