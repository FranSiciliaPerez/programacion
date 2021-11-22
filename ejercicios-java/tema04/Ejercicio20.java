/**
 * 
 * 
 * @author Francisco J. Sicilia
 */
public class Ejercicio20 {
  public static void main(String[] args) {
   
   int n;
   boolean capicua = false;
    
   System.out.println("Introduce el número para saber si es capicuo o no: ");
   n = Integer.parseInt(System.console().readLine());
   
   if (n < 10) {
      capicua = true;
    }
    
   if ((n >= 10) && (n < 100)) {
      if ((n / 10) == (n % 10)) {
        capicua = true;
      }
    }
    
   if ((n >= 100) && (n < 1000)) {
      if ((n / 100) == (n % 10)) {
        capicua = true;
      }
    }
    
   if ((n >= 1000) && (n < 100000)) {
      if ((n / 1000) == (n % 10)) {
        capicua = true;
      }
    }
   if ((n >= 10000) && (n < 1000000)) {
      if ((n / 10000) == (n % 10)) {
        capicua = true;
      }
    }
 
   if (capicua) { 
    System.out.println("El número introducido es capicuo");
   } else {
    System.out.println("El número introducido no es capicuo");
    }
  }
}
