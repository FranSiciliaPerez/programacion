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

        int [][] numero = new int[0][1000];

        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        int i;

        for (i = 0; i < 60; i++){
            numero[i][i] = Integer.parseInt(System.console().readLine());
            if (numero[i][i] < minimo) {
                minimo = numero[i][i];
            }
            if (numero[i][i] > maximo) {
                maximo = numero[i][i];
            }
        }
        
    }
}
