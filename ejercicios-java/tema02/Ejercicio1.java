/**
 * Escribe un programa en el que se declaren las variables enteras x e y. Asígnales
 * los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
 * el valor de cada variable, la suma, la resta, la división y la multiplicación.
 *
 * @author Francisco J. Sicilia
 *
 */
public class Ejercicio1 {
  public static void main(String[] args) {
    
    int x = 144;
    int y = 999;
    int suma = x + y; 
    int resta = x - y;
    int multiplicacion = x * y;
    int division = x / y;
    
    System.out.println("La suma de x + y es: " + suma);
    System.out.println("La resta de x - y es: " + resta);
    System.out.println("La multiplicación de x + y es: " + multiplicacion);
    System.out.println("La división de x entre y es: " + division);
  }
}
