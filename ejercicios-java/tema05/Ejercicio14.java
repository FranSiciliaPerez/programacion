/*
 * Escribe un programa que pida una base y un exponente (entero positivo) y que
 * calcule la potencia.
 * 
 * @author Francisco Sicilia
*/
public class Ejercicio14 {
    public static void main(String[] args) {
        System.out.println("A continuación introduzca una base y exponente positivo para calcular su potencia");
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
