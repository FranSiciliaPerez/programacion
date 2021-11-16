/*
 * Escribe un programa que dados dos números, uno real (base) y un entero
 * positivo (exponente), saque por pantalla todas las potencias con base el
 * numero dado y exponentes entre uno y el exponente introducido. No se deben
 * utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
 * se deberán mostrar 21, 22, 23, 24 y 25.
 * 
 * @author Francisco Sicilia
*/
public class Ejercicio15 {
    public static void main(String[] args) {
        System.out.println("A continuación introduzca una base y exponente positivo para todas las potencias con");
        System.out.printf("Introduzca la base: ");
        int base = Integer.parseInt(System.console().readLine());
        
        System.out.printf("Introduzca el exponente: ");
        int expo = Integer.parseInt(System.console().readLine());
        int potencia = 1;
        while (expo > 0) {
            potencia = potencia * base;
            expo -= 1;
        }
        System.out.println("El resultado de la potencia es: " + potencia);
    }
}
