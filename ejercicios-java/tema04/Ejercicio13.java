/**
 * Escribe un programa que ordene tres números enteros introducidos por teclado.
 * 
 * @author Francisco J. Sicilia
 */
public class Ejercicio13 {
  public static void main(String[] args) {
    
    System.out.println("Escriba tres números y el programa los ordenará");
    System.out.println("Añade el primer número");
    int primerNumero = Integer.parseInt(System.console().readLine());
    
    System.out.println("Añade el segundo número");
    int segundoNumero = Integer.parseInt(System.console().readLine());
    
    System.out.println("Añade el tercer número");
    int tercerNumero = Integer.parseInt(System.console().readLine());
    
    if ((primerNumero = segundoNumero) && (tercerNumero = segundoNumero)){
      System.out.println("Numeros introducidos ordenados: " +primerNumero + segundoNumero + tercerNumero); 
    }
   
  }
}
