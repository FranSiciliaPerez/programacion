/*
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 * 
 * @author Francisco Sicilia
*/
public class Ejercicio8 {
    public static void main(String[] args) {
        System.out.printf("Introduce el número del que quieres saber su tabla de multiplicar: ");
        int n = Integer.parseInt(System.console().readLine());
        System.out.println("Esta es la tabla de multiplicar del número introducido: ");
        for (int i = 0; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }
}