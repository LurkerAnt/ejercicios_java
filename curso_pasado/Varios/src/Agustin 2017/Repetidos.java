
public class Repetidos {
	static boolean repetidos(String []vector) {
		boolean repe= false;
		int interno;
		int indice= 0;
		while(indice < vector.length && !repe) {
			
			interno= indice + 1;
			while(interno < vector.length && !repe) {
				//if(vector[indice] == (vector[interno])
				//if(vector[indice].equals(vector[interno]))
				if(vector[indice].compareToIgnoreCase(vector[interno]) == 0)
					repe= true;
				//else
					interno++;
			}
			
			indice++;
		}
		return repe;
	}
	public static void main(String[] args) {
		String[] nombres= {"abc", "Abcdes", "abcdef", "abcde", "a"};
		System.out.println(repetidos(nombres));
	}
}
