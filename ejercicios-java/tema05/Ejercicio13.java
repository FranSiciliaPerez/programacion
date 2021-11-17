/*
 * Escribe un programa que lea una lista de diez números y determine cuántos
 * son positivos, y cuántos son negativos.
 * 
 * @author Francisco Sicilia
*/
public class Ejercicio13 {
    public static void main(String[] args) {

        System.out.println("Introduce 10 números(pueden ser positivos y negativos)");
        int num = 0;
        int cont = 0;
        int contn = 0;
        int contp = 0;

        while (cont < 10) {
            System.out.printf("Introduce un número: ");
            num = Integer.parseInt(System.console().readLine());
            if (num < 0) {
                contn++;
            } else {
                contp++;
            }
            cont++;
        }
        System.out.println("De los números introducidos hay " + contp + " positivo/s y " + contn + " negativo/s");
    }
}
