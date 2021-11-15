/*
 * Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
 * los 5 primeros números enteros(los que van despues del número introducido) a partir de uno que se introduce  * por teclado.
 * Francisco Sicilia3
*/
public class Ejercicio11 {
    public static void main(String[] args) {
        System.out.println("--A continuación añade un número para calcular el cuadrado y el cubo de este--");
        System.out.printf("Introduce un número: ");
        int n = Integer.parseInt(System.console().readLine());
        int cont = 0;
        int n2 = 0;
        int n3 = 0;

        while (cont <= 5) {
            n2 = n * n;
            n3 = n * n * n;
            System.out.println("Número introducido:  " + n + " Cuadrado: " + n2 + " Cubo: " + n3);
            n++;
            cont++;
        }
    }
}
