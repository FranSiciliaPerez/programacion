/**
 * Escribe un programa que ordene tres números enteros introducidos por teclado.
 * 
 * @author Francisco J. Sicilia
 */
public class Ejercicio13 {
  public static void main(String[] args) {
    
    int aux;
    System.out.println("Escriba tres números y el programa los ordenará");
    System.out.println("Añade el primer número");
    int primerNumero = Integer.parseInt(System.console().readLine());
    
    System.out.println("Añade el segundo número");
    int segundoNumero = Integer.parseInt(System.console().readLine());
    
    System.out.println("Añade el tercer número");
    int tercerNumero = Integer.parseInt(System.console().readLine());
    
    
    
    if (primerNumero > segundoNumero) {
      aux = primerNumero;
      primerNumero = segundoNumero; 
      segundoNumero = aux;
    }
    if (segundoNumero > tercerNumero) {
      aux = segundoNumero;
      segundoNumero = tercerNumero;
      tercerNumero = aux;
    }
    if (segundoNumero > primerNumero) {
      aux = primerNumero;
      primerNumero = segundoNumero;
      segundoNumero = aux;
    }
    System.out.println("Numeros ordenados : " +primerNumero + segundoNumero + tercerNumero);  
  }
}
