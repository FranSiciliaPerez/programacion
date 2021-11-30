/* 
 * Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
 * también la suma total (los puntos que suman entre los tres dados).
 *
 *  Author Francisco Sicilia
*/
public class Ejercicio1 {
    public static void main(String[] args) {
        int dado1 = (int)(Math.random()*6) + 1;
        int dado2 = (int)(Math.random()*6) + 1;
        int dado3 = (int)(Math.random()*6) + 1;
        int suma = dado1 + dado2 + dado3;
        System.out.println("El resultado de la suma de los 3 dado es: " +suma);
    }
}
