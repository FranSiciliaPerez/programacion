/**
 * Realiza un programa que calcule la nota que hace falta sacar
 * en el segundo examen de la asignatura Programación para 
 * obtener la media deseada. 
 * Hay que tener en cuenta que la nota del primer examen cuenta 
 * el 40% y la del segundo examen un 60%.
 * 
 * @author Francisco J. Sicilia
 */
public class Ejercicio12 {
  public static void main(String[] args) {
  
    System.out.printf("Introduce la nota del primer examen: ");
    double examen1 = Double.parseDouble(System.console().readLine());
  
  
    System.out.printf("¿Qué nota quieres sacar en el trimestre? ");
    double notaTrimestre = Double.parseDouble(System.console().readLine());
    
    double examen2 = ((notaTrimestre * 100) - (examen1 * 40)) / 60;
      
    System.out.println("Para tener un " + notaTrimestre + " en el trimestre necesitas sacar un " + examen2 + "en el segundo examen.");
  
  }
}
