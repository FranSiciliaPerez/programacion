/**
 * Realiza un conversor de Kb a Mb.
 * 
 * @author Francisco J. Sicilia
 */
public class Ejercicio11 {
  public static void main(String[] args) {
  
    System.out.println("--Conversor de Kb a Mb --");
    System.out.printf("Introduce la cantidad de Kb que quieres pasar a Mb: ");
    double kiloBite = Double.parseDouble(System.console().readLine());
  
    double conversion = kiloBite / 1000;
      
    System.out.println("Estos " + kiloBite + " Kb son: " + conversion + " Mb");
  
  }
}
