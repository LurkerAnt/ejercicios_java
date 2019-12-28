
public class Primo {

	public static void main(String[] args) {
		int numero;
		int divisor;
		boolean primo;
		
		long startTime = System.currentTimeMillis();

		numero= 135550000;
		divisor= 2;
		primo= true;
		//while(primo == true && divisor <= numero / 2){
		while(divisor <= numero / 2){
			if(numero % divisor == 0)
				primo= false;
			divisor++;
		}
		/*
		divisiones= 0;
		for(divisor= 2; divisor <= numero / 2; divisor++){
			if(numero % divisor == 0)
				divisiones++;			
		}
		*/
		if(primo == true)
			System.out.println("PRIMO");
		else
			System.out.println("NO primo");

		long estimatedTime = System.currentTimeMillis() - startTime;

		System.out.println(estimatedTime);
	}

}
