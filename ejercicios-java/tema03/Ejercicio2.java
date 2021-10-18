/**
 *
 * @author Francisco J. Sicilia
 */
public class Ejercicio2 {
  public static void main(String[] args) {
  
  System.out.println("--Conversor de euros a pesetas--");
  System.out.printf("Escriba a continuación los euros que quiere pasar a pesetas: ");
  int euros = Integer.parseInt(System.console().readLine());
  
  double eurosAPesetas = euros * 166.386;
  
  System.out.println(" -----------------------------");
  System.out.println(" " + euros + " euros son " + eurosAPesetas + " pesetas");
  
  
  }
}
