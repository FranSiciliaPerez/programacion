/**
 * 
 * 
 * @author Francisco J. Sicilia
 */
public class Ejercicio19 {
  public static void main(String[] args) {
    
    int n = 0;
    int digitos = 0;
    
    System.out.println("Por favor, introduzca un número entero (de 5 cifras como máximo): ");
    n = Math.abs(Integer.parseInt(System.console().readLine()));
    
    if ( n < 10 ) {
      digitos = 1;
    }
    
    if (( n >= 10 ) && ( n < 100 )) {
      digitos = 2;
    }
    
    if (( n >= 100 ) && ( n < 1000 )) {
      digitos = 3;
    }
    
    if (( n >= 1000 ) && ( n < 10000 )) {
      digitos = 4;
    }
    
    if ( n >= 10000 ) {
      digitos = 5;
    }
    
    System.out.println("El número introducido tiene " + digitos + " dígitos.");
   
   
  }
}
