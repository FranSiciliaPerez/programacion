/*
 * Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
 * los 5 primeros números enteros a partir de uno que se introduce por teclado.
*/
public class Ejercicio11 {
    public static void main(String[] args) {
        System.out.println("--A continuación añade un número para calcular el cuadrado y el cubo de este--");
        System.out.printf("Introduce un número: ");
        int n = Integer.parseInt(System.console().readLine());
        boolean cont = false;

        while ( n < 10 ) {
            if (cont = false) {
                b = n/10;
            } else {
                if (cont > 5){
                    System.out.println("grt" + n+ cont);
                    cont = false;
                }
            }
        }
        System.out.println("Número introducido " + + " al cuadrado " + + " al cubo " +);
    }
}
