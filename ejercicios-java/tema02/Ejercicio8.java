/**
 * Escribe un programa que declare 5 variables de tipo char. A continuación, crea
 * otra variable como cadena de caracteres y asígnale como valor la concatenación
 * de las anteriores 5 variables. Por último, muestra la cadena de caracteres
 * por pantalla ¿Qué problemas te encuentras? ¿cómo lo has solucionado?
 *
 * @author Francisco J. Sicilia
 */
public class Ejercicio8 {
  public static void main(String[] args) {
    
    char letra0 = 'A';
    char letra = 'B';
    char letra1 = 'C';
    char letra2 = 'D';
    char letra3 = 'E';
    char letra4 = 'F';
    String letras = ""+letra0+ letra +letra1 +letra2 +letra3 +letra4;
    System.out.println("Letras: " + letras);
  }
}
