/*
 * Escribe un programa que muestre los n primeros términos de la serie de
 * Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1 y
 * el resto se calcula sumando los dos anteriores, por lo que tendríamos que los
 * términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se debe
 * introducir por teclado.
 * 
 * @author Fran Sicilia Pérez
*/
public class Ejercicio12 {
    public static void main(String[] args) {
        System.out.println("Introduce un número de la serie de Fibonacci");
        int n = Integer.parseInt(System.console().readLine());
        int n2 =0;
        while (n2 <= 144) {
            System.out.println("El numero es: " + n);
            n++;
        }
    }
}
