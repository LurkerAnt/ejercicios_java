package funciones;

public class Cambia2 {
    static void cambia(Entero a, Entero b){
        int aux;
        aux= a;
        a= b;
        b= aux;
    }
    public static void main(String[]s){
        Integer n1= 2;
        Integer n2= 4;
        cambia(n1, n2);
        System.out.println(n1 + " " + n2);
    }
}