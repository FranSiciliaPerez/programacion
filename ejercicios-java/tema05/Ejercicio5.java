/*
 * Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando
 * un bucle while.
 * @Author Francisco Sicilia
*/
public class Ejercicio5 {
    public static void main(String[] args) {

        int n = 320;
        System.out.println("Los números del 320 al 160, contando de 20 en 20 son: ");
        while (n >= 160) {
            System.out.println(n);
            n -= 20;
        }

    }
}
