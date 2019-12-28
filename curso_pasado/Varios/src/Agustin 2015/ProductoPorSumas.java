package bucles;


public class ProductoPorSumas {

	public static void main(String[] args) {
		int mdo= 50;
		int mdor= 23;
		int producto;
		int contador;
		
		int aux;
		boolean cambiado= false;
		if(mdo < mdor){
			aux= mdo;
			mdo= mdor;
			mdor= aux;
			cambiado= true;
		}
		producto= 0;
		contador= 1;
		while(contador <= mdor){
			producto = producto + mdo;
			contador++;
			System.out.println(contador);
		}
		if(cambiado == true){
			aux= mdo;
			mdo= mdor;
			mdor= aux;
		}		
		System.out.printf("%d * %d= %d", mdo, mdor, producto);
	}

}
