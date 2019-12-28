package funciones;

/**
 *
 * @author profesor
 */
public class Cambia {
    static void cambia(int a, int b){
        int aux;
        aux= a;
        a= b;
        b= aux;
    }
    public static void main(String[]s){
        int n1= 2;
        int n2= 4;
        cambia(n1, n2);
        System.out.println(n1 + " " + n2);
    }
}
