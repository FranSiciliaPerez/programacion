/**
* 7.2 Arrays bidimensionales
*
* 1. Define un array de números enteros de 3 filas por 6 columnas con
* nombre "num" y asigna los valores según la siguiente tabla:
* num:
*
* Francisco Sicilia Perez
*/
public class Ejercicio1A {
    public static void main(String[] args) {
        int[][] num = new int[3][6];
        num[0][0] = 0;
        num[0][1] = 30;
        num[0][2] = 2;
        num[0][5] = 5;
        num[1][0] = 75;
        num[1][4] = 0;
        num[2][2] = -2;
        num[2][5] = 11;
        int fila, columna;
        System.out.printf("Array num  Columna 0    Columna 1   Columna 2   Columna 3   Columna 4   Columna 5\n");
        for (fila = 0; fila < 3; fila++) {
            System.out.printf(" Fila " + fila);
            for (columna = 0; columna < 6; columna++) {
                System.out.printf("%10d ", num[fila][columna]);
            }
            System.out.println();
        }
    }
}
