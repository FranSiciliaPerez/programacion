/**
 *
 * @author Francisco J. Sicilia
 */
public class Ejercicio4 {
  public static void main(String[] args) {
  
  System.out.println("--Operacion de suma, resta, division y multiplicación de número introducido por teclado--");
  System.out.printf("Introduce el valor del primer número: ");
  int numero1 = Integer.parseInt(System.console().readLine());
  
  System.out.printf("Introduce el valor del segundo número: ");
  int numero2 = Integer.parseInt(System.console().readLine());
  
  int suma = numero1 + numero2;
  
  int resta = numero1 -numero2;
  
  double multiplicacion = numero1 * numero2;
  
  double division = numero1 / numero2;
  
  System.out.println(" -----------------------------");
  System.out.println(" " + suma + " " + resta + " " + multiplicacion + "" + division);
  
  }
}
