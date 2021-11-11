/*
 * Escribe un programa que calcule la media de un conjunto de números positivos
 * introducidos por teclado. A priori, el programa no sabe cuántos números se
 * introducirán. El usuario indicará que ha terminado de introducir los datos
 * cuando meta un número negativo.
*/
public class Ejercicio10 {
    public static void main(String[] args) {
        System.out.println("A continuacion, introduzca los números para calcular su media");
        double notaMedia = 0;
        int cont = 0;
        System.out.printf("Introduce una nota: ");
        double n = Double.parseDouble(System.console().readLine());
        do {
            cont++;
            notaMedia += n;
            System.out.printf("Introduce una nota: ");
            n = Double.parseDouble(System.console().readLine());
        } while (n > 0);
        System.out.println("La media de los números introducidos es: " + notaMedia / cont);
    }
}
