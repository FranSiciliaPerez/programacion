//import Funciones.java
/*
 * Ejercicio 6 array bisimensional
 * Modifica el programa anterior de tal forma que no se repita ningún número en
 * el array. 
 * 
 * Francisco Sicilia Pérez
*/
public class Ejercicio6A {
    public static void main(String[] args) {
        
    
        int fila;
        int columna;
        int minimo = Integer.MAX_VALUE;
        int filaMinimo = 0;
        int columnaMinimo = 0;
        int maximo = Integer.MIN_VALUE;
        int filaMaximo = 0;
        int columnaMaximo = 0;
        int[][] num;

        System.out.print("\n ");
        for(columna = 0; columna < 10; columna++) {
        System.out.print(" " + columna + " ");
        }

        System.out.println();
        System.out.print(" ┌");
        for(columna = 0; columna < 10; columna++) {
            System.out.print("──────");
        }
        
        System.out.println("┐");
        for(fila = 0; fila < 6; fila++) {
            System.out.print(" " + fila + " │");

            for(columna = 0; columna < 10; columna++) {
                num[fila][columna] = (int)(Math.random() * 1001);
                System.out.printf("%5d ", num[fila][columna]);
                
                if (num[fila][columna] < minimo) {
                    minimo = num[fila][columna];
                    filaMinimo = fila;
                    columnaMinimo = columna;
                }
                
                if (num[fila][columna] > maximo) {
                    maximo = num[fila][columna];
                    filaMaximo = fila;
                    columnaMaximo = columna;
                }
                
                System.out.println("│");
            }
            System.out.print(" └");
            for(columna = 0; columna < 10; columna++) {
                System.out.print("──────");
            }
            
            System.out.println("\nEl máximo es " + maximo + " y está en la fila " + filaMaximo + ", columna " + columnaMaximo);
            System.out.println("El mínimo es " + minimo + " y está en la fila " + filaMinimo + ", columna " + columnaMinimo);
        }
    }
}
