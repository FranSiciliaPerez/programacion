/**
 * Escribe un programa que sume, reste, multiplique y divida dos números
 * introducidos por teclado.
 * 
 * @author Francisco J. Sicilia
 */
public class Ejercicio4 {
  public static void main(String[] args) {
  
  System.out.println("--Operacion de suma, resta, division y multiplicación con los número introducido por teclado--");
  System.out.printf("Introduce el valor del primer número: ");
  double numero1 = Double.parseDouble(System.console().readLine());
  
  System.out.printf("Introduce el valor del segundo número: ");
  double numero2 = Double.parseDouble(System.console().readLine());
  
  double suma = numero1 + numero2;
  
  double resta = numero1 -numero2;
  
  double multiplicacion = numero1 * numero2;
  
  double division = numero1 / numero2;
  
  System.out.println(" -----------------------------");
  System.out.println("El resultado de la suma de los numeros introducidos es: " + suma);
  System.out.println("El resultado de la resta de los numeros introducidos es: " + resta);
  System.out.println("El resultado de la multiplicación de los numeros introducidos es: " + multiplicacion);
  System.out.println("El resultado de la división de los numeros introducidos es: " + division);
  
  }
}
