package funciones;

public class Amigos2 {
    static int sumaDivisores(int n){
        int suma= 0;
        for (int divisor = 1; divisor <= n / 2; divisor++) {
            if (n % divisor == 0) {
                suma += divisor;
            }
        }
        suma += n;
        return suma;
    }
    
    public static void main(String[] args) {
        int numero1;
        int numero2;
        int sDMN1;
        int sDMN2;
        // suma todos los divisores
        numero1 = 284;
        sDMN1= sumaDivisores(numero1) - numero1;
        numero2 = 220;
               
        if (sDMN1 == numero2) {
            sDMN2= sumaDivisores(numero2) - numero2;
            if (sDMN2 == numero1) {
                System.out.println(sDMN1 + " " + sDMN2 + " SI amigos");
            } else {
                System.out.println(" NO amigos");
            }
        } else {
            System.out.println(" NO amigos");
        }


        /*
        if (sDMN1 == numero2 && sDMN2 == numero1) {
                System.out.println(sDMN1 + " " + sDMN2 + " SI amigos");
            } else {
                System.out.println(" NO amigos");
            }
    */
    }
}
