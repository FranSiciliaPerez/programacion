/**
 * Realiza un programa que resuelva una ecuación de segundo grado 
 * (del tipo ax2 + bx + c = 0).
 * 
 * @author Francisco J. Sicilia
 */
public class Ejercicio9 {
  public static void main(String[] args) {
  
    System.out.println("A continuación introduce el valor de a, b y c para resolver la ecuacion");
    System.out.printf("Por favor, introduzca el valor de a: ");
    double a = Double.parseDouble(System.console().readLine());
    
    System.out.printf("Por favor, introduzca el valor de b: ");
    double b = Double.parseDouble(System.console().readLine());
    
    System.out.printf("Por favor, introduzca el valor de c: ");
    double c = Double.parseDouble(System.console().readLine());
    
    double ecuacionSegundoGrado = (-b + (Math.sqrt((b*b) -4 * a * c)) / (2 * a));
    
    double ecuacionSegundoGrado2 = (-b - (Math.sqrt((b*b) -4 * a * c)) / (2 * a));
    
    System.out.println("x = " + ecuacionSegundoGrado);
    System.out.println("x = " + ecuacionSegundoGrado2);
  }
}

