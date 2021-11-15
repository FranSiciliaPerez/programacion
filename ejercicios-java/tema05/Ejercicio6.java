/*
 *
 * Muestra los números del 320 al 160, contando de 20 en 20 utilizando un bucle
 * do-while.
 * @author Francisco Sicilia 
*/
public class Ejercicio6 {
    public static void main(String[] args) {

        int n = 320;
        System.out.println("A continuación voy a mostrar los multimplos de 5 del  al 100: ");
        do {
            System.out.println(n);
            n -= 20;
        } while (n >= 160);
    }
}
