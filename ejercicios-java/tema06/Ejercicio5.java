/*
 * Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
 * separados por espacios. Muestra también el máximo, el mínimo y la media
 * de esos números.
 * 
 * Author Francisco Sicilia
*/
public class Ejercicio5 {
    public static void main(String[] args) {
        int media = 0;
        int max = 0;
        int min = 0;
        for (int i = 0; i < 50; i++) {
            int numAl = (int)((Math.random()*100) + 100);
            System.out.print("" + numAl + " ");
            media += numAl;
            min -= numAl;
        }
        System.out.println("La media de los números introducido es "+(media/50));
        System.out.println("Hola "+min);
    }
}
