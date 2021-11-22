/**
 * Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
 * convertir debe ser introducida por teclado.
 * 
 * @author Francisco J. Sicilia
 */
public class Ejercicio3 {
  public static void main(String[] args) {
  
  System.out.println("--Conversor de euros a pesetas--");
  System.out.printf("Escriba a continuación las pesetas que quiere pasar a euros: ");
  int pesetas = Integer.parseInt(System.console().readLine());
  
  double pesetasAEuros = (double)(pesetas * 0.006);
  
  System.out.println(" -----------------------------");
  System.out.println(" " + pesetas + " pesetas son " + pesetasAEuros + " euros");
  
  }
}
