/**
 *
 * @author Francisco J. Sicilia
 */
public class Ejercicio5 {
  public static void main(String[] args) {
  
  System.out.println("--Calcula el área del rectangulo en centímetros--");
  System.out.printf("Introduce la base del rectángulo: ");
  int base = Integer.parseInt(System.console().readLine());
  
  System.out.printf("Introduce la altura del rectángulo: ");
  int altura = Integer.parseInt(System.console().readLine());
  
  int areaRectangulo = base * altura;
  
  System.out.println("El área del rectangulo de base " + base + " y de altura " + altura + " es: " + areaRectangulo + " cm2");
  
  }
}
