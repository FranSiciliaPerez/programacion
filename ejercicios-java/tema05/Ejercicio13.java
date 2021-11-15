/*
 * Escribe un programa que lea una lista de diez números y determine cuántos
 * son positivos, y cuántos son negativos.
 * 
 * @author Francisco Sicilia
*/
public class Ejercicio13 {
    public static void main(String[] args) {

        System.out.println("Introduce 10 números(pueden ser positivos y negativos)");
        System.out.printf("Introduce un número");
        int num = Integer.parseInt(System.console().readLine());
        int cont = 0;
        int contn = 0;
        int contp = 0;
        
        for (cont <= 10) {
            if (num < 0) {
                contn++;
                cont++;
            } else {
                contp++;
                cont++;
            }
        }
    }

    private static Object cont(int i) {
        return null;
    }
}
