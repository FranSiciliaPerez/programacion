/**
 *
 * @author Francisco J. Sicilia
 */
public class Ejercicio10 {
  public static void main(String[] args) {
  
    System.out.println("--Conversor de Mb a Kb --");
    System.out.printf("Introduce la cantidad de Mb que quieres pasar a Kb: ");
    double megaBite = Double.parseDouble(System.console().readLine());
  
    double conversion = megaBite * 1000;
      
    System.out.println("Estos " + megaBite + " Mb son: " + conversion + " Kb");
  
  }
}
