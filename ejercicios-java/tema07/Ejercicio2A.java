public class Ejercicio2A {
    public static void main(String[] args) {
        int[][] num = new int[4][5];
        num[0][0] = 0;
        num[0][1] = 30;
        num[0][2] = 2;
        num[0][4] = 5;
        num[1][0] = 75;
        num[1][4] = 0;
        num[2][2] = -2;
        num[2][4] = 11;
        int fila, columna;
        for (fila = 0; fila < 4; fila++) {
            System.out.printf(" Fila " + fila);
            for (columna = 0; columna < 5; columna++) {
                System.out.printf("%10d ", num[fila][columna]);
            }
            System.out.println();
        }
    }
}
