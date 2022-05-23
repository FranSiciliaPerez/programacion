/**
 * Ejercicio 8
 * Realiza un programa que muestre por pantalla un array de 10 filas por 10
 * columnas relleno con números aleatorios entre 200 y 300. A continuación, el
 * programa debe mostrar los números de la diagonal que va desde la esquina
 * superior izquierda a la esquina inferior derecha, así como el máximo, el
 * mínimo
 * y la media de los números que hay en esa diagonal.
 * 
 * Francisco Javier Sicilia Pérez
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        
        int[][] n = new int[12][12];
        int i = 0;
        int j = 0;
        int partes;
        int parte1;
        int parte2;

        //Genera el array y lo enseña por pantalla

        System.out.println("Array original");
        System.out.println("---------------");

        for(i = 0; i < 12; i++) {
            for (j = 0; j < 12; j++) {
                n[i][j] = (int) (Math.random() * 101);
                System.out.printf("%5d", n[i][j]);
            }
        }

        //inicio de la rotación

        for(partes = 0; partes < 6; partes++) {
            
            parte1 = n[partes][11 - partes];
            for(i = 11 - partes; i > partes + 1; i--) {
                n[i][11 - partes] = n[i-1][11 - partes];
            }
            
            
            parte2 = n[partes][11 - partes];
            for(i = 11 - partes; i > partes + 1; i--) {
                n[i][11 - partes] = n[i-1][11 - partes];
            }
            n[partes + 1][11 - partes] = parte1;
        }
    }
}
