/**
 * Escribe un programa que pinte una pirámide rellena con un carácter introducido
 * por teclado que podrá ser una letra, un número o un símbolo como *, +, -, $, &,
 * etc. El programa debe permitir al usuario mediante un menú elegir si el vértice
 * de la pirámide está apuntando hacia arriba, hacia abajo, hacia la izquierda o
 * hacia la derecha.
 * 
 * @author Francisco J. Sicilia
 */
public class Ejercicio15 {
  public static void main(String[] args) {
    
    System.out.printf("Introduce el caracter con el que quiere formar la pirámide: ");
    String c = System.console().readLine();
    System.out.println("1- Vertice arriba");
    System.out.println("2- Vertice abajo");
    System.out.println("3- Vertice izquierda");
    System.out.println("4- Vertice derecha");
    System.out.print("Selecciona el número o el simbolo que quiere utilzar: ");
    int posicion = Integer.parseInt(System.console().readLine());
    
   switch(posicion) {
      case 1:
        System.out.println("  " + c);
        System.out.println(" " + c + c + c);
        System.out.println(c + c + c + c + c);
        break;
      case 2:
        System.out.println(c + c + c + c + c);
        System.out.println(" " + c + c + c);
        System.out.println("  " + c);
        break;
      case 3:
        System.out.println("    " + c);
        System.out.println("  " + c + " " + c);
        System.out.println(c + " " + c + " " + c);
        System.out.println("  " + c + " " + c);
        System.out.println("    " + c);
        break;
      case 4:
        System.out.println(c);
        System.out.println(c + " " + c);
        System.out.println(c + " " + c + " " + c);
        System.out.println(c + " " + c);
        System.out.println(c);
        break;
      default:
    }
   
  }
}
