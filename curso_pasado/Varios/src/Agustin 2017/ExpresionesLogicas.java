
public class ExpresionesLogicas {

	public static void main(String[] args) {
		int a= 2;
		int b= 7;
		int c= 8;
		boolean bool= (a < b) || (b++ < c);
		
		if(a > b){
			System.out.println("a > b");
			if(a > c){
				System.out.println(a + " > b y que c");
			}
			System.out.println("pasa dentro");
		}
		
		
		System.out.println(bool );
		System.out.println(b);
		int mayor= a > b ? a : b;
		System.out.println(mayor);
		boolean par= a % 2 == 0;
		System.out.println(par);
		par = a % 2 == 0 ? true : false;  
	}

}
