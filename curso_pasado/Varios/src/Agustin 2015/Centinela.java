package bucles;

public class Centinela {

	public static void main(String[] args) {
		boolean	salir=false; 
		int	n, c= 0;
		boolean m5;
		m5= false;
		while(salir==false && c <= 5){
			n=(int)Math.floor(Math.random()*500+1);
			System.out.println(n);
			/*
			if(n % 7 == 0)
				salir= true;
			*/
			
			salir= (n % 7 == 0); // ? true : false;
			c++;			
		}
		if(salir == false)
			System.out.println("no");
		if(c > 5)
			System.out.println("no");
	}

}
