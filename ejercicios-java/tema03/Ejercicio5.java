/**
 * Escribe un programa que calcule el área de un rectángulo.
 * 
 * @author Francisco J. Sicilia
 */
public class Ejercicio5 {
  public static void main(String[] args) {
  
  System.out.println("--Calcula el área del rectángulo en centímetros--");
  System.out.printf("Introduce la base del rectángulo: ");
  double base = Double.parseDouble(System.console().readLine());
  
  System.out.printf("Introduce la altura del rectángulo: ");
  double altura = Double.parseDouble(System.console().readLine());
  
  double areaRectangulo = base * altura;
  
  System.out.println("El área del rectángulo de base " + base + " y de altura " + altura + " es: " + areaRectangulo + " cm2");
  
  }
}
