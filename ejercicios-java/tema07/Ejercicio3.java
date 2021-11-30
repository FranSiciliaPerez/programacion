/*
 * Escribe un programa que lea 10 números por teclado y que luego los muestre
 * en orden inverso, es decir, el primero que se introduce es el último en mostrarse
 * y viceversa.
*/
public class Ejercicio3 {
    public static void main(String[] args) {

        int[] number = new int[10];
        System.out.println("Introduce a continuacion 10(cuando introduzca un número pulse enter)");

        for (int i = 0; i < 10; i++) {
            System.out.printf("Introduce un número: ");
            number[i] = Integer.parseInt(System.console().readLine());
        }
        
        for (int e = 9; e >= 0; e--) {
            System.out.println(number[e]);
        }
    }
}
