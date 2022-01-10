public class Ejercicio2A {
    public static void main(String[] args) {

        int[][] number = new int[4][5];

        int fila;
        int columna;

        System.out.printf("Introduce un número: ");

        for (fila = 0; fila < 4; fila++) {
            for (columna = 0; columna < 5; columna++) {
                System.out.print("Fila " + fila + ", columna " + columna + ": ");
                number[fila][columna] = Integer.parseInt(System.console().readLine());
            }
        }

        int sumaFila;
        for (fila = 0; fila < 4; fila++) {
            sumaFila = 0;
            for (columna = 0; columna < 5; columna++) {
                System.out.printf("%7d ", number[fila][columna]);
                sumaFila += number[fila][columna];
            }
            System.out.printf("|%7d\n", sumaFila);
        }
        for (columna = 0; columna < 5; columna++) {
            System.out.print("----------");
        }
        System.out.println("-----------");
        int sumaColumna;
        int sumaTotal = 0;
        for (columna = 0; columna < 5; columna++) {
            sumaColumna = 0;
            for (fila = 0; fila < 4; fila++) {
                sumaColumna += number[fila][columna];
            }
            sumaTotal += sumaColumna;
            System.out.printf("%7d ", sumaColumna);
        }
        System.out.printf("|%7d ", sumaTotal);
    }
}