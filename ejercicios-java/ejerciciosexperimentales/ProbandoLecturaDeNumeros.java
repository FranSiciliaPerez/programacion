/**
 *
 * @author Francisco J. Sicilia
 */
public class ProbandoLecturaDeNumeros {
  public static void main(String[] args) {
  
  System.out.println("Introduce un numero: ");
  int primerNumero = Integer.parseInt(System.console().readLine());
  
  System.out.println("Introduce el nobre de una fruta: ");
  String fruta = System.console().readLine();

  System.out.println("El nombre intrducido es: " + primerNumero);
  System.out.println("La fruta intrducida es: " + fruta);
   
  }
}
