/**
 * Realiza un programa que diga si un número introducido por teclado es par y/o
 * divisible entre 5.
 * 
 * @author Francisco J. Sicilia
 */
public class Ejercicio14 {
  public static void main(String[] args) {
    
    
    System.out.println("Introduce un número");
    int a = Integer.parseInt(System.console().readLine());
    
    if ((a % 2) == (0)) {
      System.out.println("Par");
    } else {
          System.out.println("Introduce un número");
    }
   
    if ((a / 5) == (0)) {
      System.out.println("Par");
    } else {
          System.out.println("Introduce un número");
    }
   
    
  }
}
