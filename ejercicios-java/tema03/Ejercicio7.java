/**
 * Escribe un programa que calcule el total de una factura a partir de la base
 * imponible.
 * 
 * @author Francisco J. Sicilia
 */
public class Ejercicio7 {
  public static void main(String[] args) {
  
    System.out.println("--Calcula el total de una factura a partir de la base imponible--");
    System.out.printf("Introduce el IVA: ");
    double iva = Double.parseDouble(System.console().readLine());
  
    System.out.printf("Introduce el precio del articulo: ");
    double precioSinIva = Double.parseDouble(System.console().readLine());
  
    double preciofinal = precioSinIva * iva;
    
    System.out.println("-------------------------------------------");
    System.out.println("El precio sin iva es: " + precioSinIva + " euros");
    System.out.println("El IVA es: " + iva + " euros" );
    System.out.println("El precio final es: " + preciofinal + " euros");
  
  }
}
