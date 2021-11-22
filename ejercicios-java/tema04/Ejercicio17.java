/**
 * Escribe un programa que diga cuál es la última cifra de un número entero
 * introducido por teclado.
 * 
 * @author Francisco J. Sicilia
 */
public class Ejercicio17 {
  public static void main(String[] args) {
    
   System.out.println("Introduce un número para saber su ultima cifra");
   int numero = Integer.parseInt(System.console().readLine());
   System.out.println("La ultima cifra del numero introducido es: " + (numero % 10));
  }
}
