/**
 * Realiza un programa que diga si un número introducido por teclado es par y/o
 * divisible entre 5.
 * 
 * @author Francisco J. Sicilia
 */
public class Ejercicio14 {
  public static void main(String[] args) {
    
    
    System.out.print("Introduce un número: ");
    int a = Integer.parseInt(System.console().readLine());
    
    if ((a % 2) == (0)) {
      System.out.print("El número introducido es par");
    } else {
          System.out.print("El número introducido es impar");
    }
   
    if ((a % 5) == (0)) {
      System.out.println(" y divisible entre 5");
    } else {
          System.out.println(" y no es divisible entre 5");
    }
   
    
  }
}
