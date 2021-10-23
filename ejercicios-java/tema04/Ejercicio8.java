/**
 * Realiza un programa que calcule la media de tres notas
 * 
 * @author Francisco J. Sicilia
 */
public class Ejercicio8 {
  public static void main(String[] args) {
  
    System.out.println("A continuación introduce las tres notas para hacer su media");
    System.out.printf("Por favor, introduzca el valor de la primera nota: ");
    double nota1 = Double.parseDouble(System.console().readLine());
    
    System.out.printf("Por favor, introduzca el valor de la segunda nota: ");
    double nota2 = Double.parseDouble(System.console().readLine());
    
    System.out.printf("Por favor, introduzca el valor de la tercera nota: ");
    double nota3 = Double.parseDouble(System.console().readLine());
    
    double notaMedia = (nota1 + nota2 + nota3) / 3;
    
    
    if ((notaMedia >= 0) && (notaMedia <= 4.99)) {
      System.out.println("La nota media según los valores introducidos, es: " + notaMedia + ", insuficiente");
    }
    if ((notaMedia >= 5) && (notaMedia <= 6.99)) {
      System.out.println("La nota media según los valores introducidos, es: " + notaMedia + ", bien");
    }
    if ((notaMedia >= 7) && (notaMedia <= 8.99)) {
      System.out.println("La nota media según los valores introducidos, es: " + notaMedia + ", notable");
    }
    if ((notaMedia >= 9) && (notaMedia <= 10)) {
      System.out.println("La nota media según los valores introducidos, es: " + notaMedia + ", bien");
    }
  }
}

