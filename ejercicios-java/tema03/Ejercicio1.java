/**
 *
 * @author Francisco J. Sicilia
 */
public class Ejercicio1 {
  public static void main(String[] args) {
  
  System.out.println("--A continuación introduce valores de los números que se van a sumar--");
  System.out.printf("Introduce el primer numero: ");
  int primerNumero = Integer.parseInt(System.console().readLine());
  
  System.out.printf("Introduce el primer numero: ");
  int segundoNumero = Integer.parseInt(System.console().readLine());
  
  int suma = primerNumero + segundoNumero;
  
  System.out.println("La suma de los dos números introducidos es: " + suma);
   
  }
}
