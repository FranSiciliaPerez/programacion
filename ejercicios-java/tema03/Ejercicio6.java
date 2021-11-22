/**
 * Escribe un programa que calcule el área de un triángulo.
 * 
 * @author Francisco J. Sicilia
 */
public class Ejercicio6 {
  public static void main(String[] args) {
  
  System.out.println("--Calcula el área del triángulo en centímetros--");
  System.out.printf("Introduce la base del triángulo: ");
  double base = Double.parseDouble(System.console().readLine());
  
  System.out.printf("Introduce la altura del triángulo: ");
  double altura = Double.parseDouble(System.console().readLine());
  
  double areaTriangulo = (base * altura) / 2;
  
  System.out.println("El área del triángulo de base " + base + " y de altura " + altura + " es: " + areaTriangulo + " cm2");
  
  }
}
