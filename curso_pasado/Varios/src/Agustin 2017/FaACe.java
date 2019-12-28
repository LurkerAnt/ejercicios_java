/**
 * Escribe	 un	 programa	 para	 convertir	 de	 grados	 Fahrenheit	 a	 grados	
Celsius.	(La	fórmula	de	conversión	es	°C	=	5/9	* (°F	- 32).)	
 * @author profesor
 *
 */
public class FaACe {

	public static void main(String[] args) {

		int f= 32;
		int c;
		
		c= (int)(((float)5 / 9) * (f - 32));
		
		System.out.println(c);
	}

}
