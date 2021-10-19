/**
 *
 * @author Francisco J. Sicilia
 */
public class Ejercicio1 {
  public static void main(String[] args) {
  
  System.out.println("--A continuación introduce valores de los números que se van a sumar--");
  System.out.printf("Introduce el primer numero entero: ");
  int primerNumero = Integer.parseInt(System.console().readLine());
  
  System.out.printf("Introduce el primer numero entero: ");
  int segundoNumero = Integer.parseInt(System.console().readLine());
  
  int multiplicacion = primerNumero * segundoNumero;
  
  System.out.println("La multiplicación de los dos números(" + primerNumero + ", " + segundoNumero + ") introducidos es: " + multiplicacion);
   
  }
}
