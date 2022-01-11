/*
 * Ejercicio 5 array bisimensional
 * Realiza un programa que rellene un array de 6 filas por 10 columnas con
 * números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A
 * continuación, el programa deberá dar la posición tanto del máximo como del
 * mínimo.
 * 
 * Francisco Sicilia Pérez
*/
public class Ejercicio5A {
    public static void main(String[] args) {

        int[][] numero = new int[6][10];

        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        int i;
        System.out.println("Introduce 10 numeros pulsando ENTER para cada número:");
        for (i = 0; i < 60; i++) {
            numero[i][i] = Integer.parseInt(System.console().readLine());
            if (numero[i][i] < minimo) {
                minimo = numero[i][i];
            }
            if (numero[i][i] > maximo) {
                maximo = numero[i][i];
            }
        }
        System.out.println();

        for (i = 0; i < 10; i++) {
            System.out.print(numero[i]);
            if (numero[i][i] == maximo) {
                System.out.print(" máximo");
            }
            if (numero[i][i] == minimo) {
                System.out.print(" mínimo");
            }
            System.out.println();
        }
    }
}
