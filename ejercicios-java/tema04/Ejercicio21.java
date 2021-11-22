/**
 * 
 * 
 * @author Francisco J. Sicilia
 */
public class Ejercicio21 {
  public static void main(String[] args) {
    
    System.out.printf("Introduce la nota del primer examen: ");
    int  nota1 = Integer.parseInt(System.console().readLine());
   
    System.out.printf("Introduce la nota del segundo examen: ");
    int  nota2 = Integer.parseInt(System.console().readLine());
    
    double notaMedia = (double)(nota1+nota2) / 2;
    
    if (notaMedia >= 5) {
      System.out.println("La media obtenida es de: " + notaMedia);
    } else {
       System.out.printf("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
       String  notaRecu = System.console().readLine();
       if (notaRecu.equals("apto")) {
          System.out.println("Tu nota de programacion es un 5");
        } else {
             System.out.println("Tu nota de programacion es un: " +notaMedia);
          }
      }
  }
}
