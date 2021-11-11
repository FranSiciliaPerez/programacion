/*
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido
 * por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con
 * la salvedad de que el anterior estaba limitado a números de 5 dígitos como
 * máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
 * esta manera, la única limitación en el número de dígitos la establece el tipo de
 * dato que se utilice (int o long).
*/
public class Ejercicio9 {
    public static void main(String[] args) {
        long n = 0;
        long digitos = 1;

        System.out.println("Por favor, introduzca un número entero (de 5 cifras como máximo): ");
        n = Math.abs(Long.parseLong(System.console().readLine()));
        while (n > 10) {
            n = n / 10;
            digitos++;
        }
        System.out.println("El número introducido tiene " + digitos + " dígitos.");
    }
}
