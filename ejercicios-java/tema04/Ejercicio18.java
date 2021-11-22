/**
 * Escribe un programa que diga cuál es la primera cifra de un número entero
 * introducido por teclado. Se permiten números de hasta 5 cifras
 * 
 * @author Francisco J. Sicilia
 */
public class Ejercicio18 {
  public static void main(String[] args) {

    int primera = 0;
    int n = 0;

    System.out.println("Introduce un número de 5 cifras max y diré cual es la primera cifra de este");
    n = Integer.parseInt(System.console().readLine());

    if (n < 10) {
      primera = n;
    }

    if ((n >= 10) && (n < 100)) {
      primera = n / 10;
    }

    if ((n >= 100) && (n < 1000)) {
      primera = n / 100;
    }

    if ((n >= 1000) && (n < 10000)) {
      primera = n / 1000;
    }

    if (n >= 10000) {
      primera = n / 10000;
    }

    System.out.println("La primera cifra del número introducido es el: " + primera);
  }
}
