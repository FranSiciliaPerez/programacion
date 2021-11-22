/**
 * Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b =0).
 * 
 * @author Francisco J. Sicilia
 */
public class Ejercicio5 {
  public static void main(String[] args) {
  
    System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
    System.out.printf("Por favor, introduzca el valor de a: ");
    double a = Double.parseDouble(System.console().readLine());
    
    System.out.printf("Ahora introduzca el valor de b: ");
    double b = Double.parseDouble(System.console().readLine());
    
    
    if (a == 0) {
      System.out.println("Esas ecuacion no tiene solucion real");
    }
    if ((a > 0) || (a < 0)) {
      double ecuacion = -b / a;
      System.out.println("x = " + ecuacion);
    }    
    if ((b == 0) || (a != 0)) {
      System.out.println("x = 0");
    }
  }
}

