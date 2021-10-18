/**
 *
 * @author Francisco J. Sicilia
 */
public class Ejercicio6 {
  public static void main(String[] args) {
  
  System.out.println("--Calcula el área del triángulo en centímetros--");
  System.out.printf("Introduce la base del triángulo: ");
  int base = Integer.parseInt(System.console().readLine());
  
  System.out.printf("Introduce la altura del triángulo: ");
  int altura = Integer.parseInt(System.console().readLine());
  
  int areaTriangulo = (base * altura) / 2;
  
  System.out.println("El área del triángulo de base " + base + " y de altura " + altura + " es: " + areaTriangulo + " cm2");
  
  }
}
