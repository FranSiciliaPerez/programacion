/**
 * 
 * 
 * @author Francisco J. Sicilia
 */
public class Ejercicio18 {
  public static void main(String[] args) {
   
   int primera , n = 0; 
   
   System.out.print("Introduce un número de 5 cifras max y diré cual es la primera cifra de este");
   n = Integer.parseInt(System.console().readLine());
   
   if (n < 10) {
      primera = n;
    }
   
  }
}
