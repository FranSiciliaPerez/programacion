/**
 * Realiza un programa que pida dos números y que luego muestre el resultado
 * de su multiplicación.
 * 
 * @author Francisco J. Sicilia
 */
public class Ejercicio1 {
  public static void main(String[] args) {
  
  System.out.println("--A continuación introducirá números para su multiplicación--");
  System.out.printf("Introduce el primer numero entero: ");
  int primerNumero = Integer.parseInt(System.console().readLine());
  
  System.out.printf("Introduce el primer numero entero: ");
  int segundoNumero = Integer.parseInt(System.console().readLine());
  
  int multiplicacion = primerNumero * segundoNumero;
  
  System.out.println("La multiplicación de los dos números(" + primerNumero + ", " + segundoNumero + ") introducidos es: " + multiplicacion);
   
  }
}
