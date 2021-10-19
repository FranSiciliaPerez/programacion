/**
 * Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
 * convertir debe ser introducida por teclado.
 * 
 * @author Francisco J. Sicilia
 */
public class Ejercicio2 {
  public static void main(String[] args) {
  
  System.out.println("--Conversor de euros a pesetas--");
  System.out.printf("Escriba a continuación los euros que quiere pasar a pesetas: ");
  double euros = Double.parseDouble(System.console().readLine());
  
  int eurosAPesetas = (int)(euros * 166.386);
  
  System.out.println(" -----------------------------");
  System.out.println(" " + euros + " euros son " + eurosAPesetas + " pesetas");
  
  
  }
}
