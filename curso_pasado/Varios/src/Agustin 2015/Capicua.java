package alternativas;

public class Capicua {

	public static void main(String[] args) {
		int ni, n, aux;
		int digitos;
		int u, a, b, c, d;
		a= b= c= d= 0;
		digitos= 0;
		n= 535;
		aux= n;
		
		u= n % 10;
		n= n / 10;
		digitos++;
		ni= u;
		if(n > 0){
			digitos++;
			u= n % 10;
			n= n / 10;
			ni = ni * 10 + u;
			if(n > 0){
				digitos++;
				u= n % 10;
				n= n / 10;
				ni = ni * 10 + u;
				if(n > 0){
					digitos++;
					u= n % 10;
					n= n / 10;
					ni = ni * 10 + u;
				}
			}
		}
		System.out.println(aux + " tiene " + digitos);
		if(aux == ni)
			System.out.println(aux + " es cap");
		else
			System.out.println(aux + " NO es cap");
	}

}
