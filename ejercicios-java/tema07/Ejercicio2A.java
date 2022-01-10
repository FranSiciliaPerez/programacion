public class Ejercicio2A {
    public static void main(String[] args) {

        int[][] number = new int[4][6];

        for (int i = 0; i < 10; i++) {
            System.out.printf("Introduce un número: ");
            number[i][i] = Integer.parseInt(System.console().readLine());
        }
        int fila, columna;
        for (fila = 0; fila < 4; fila++) {
            System.out.printf(" Fila " + fila);
            for (columna = 0; columna < 5; columna++) {
                System.out.printf("%10d ", number[fila][columna]);
            }
            System.out.println();
        }
    }
}
