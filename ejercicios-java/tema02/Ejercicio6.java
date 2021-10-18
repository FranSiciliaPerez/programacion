/**
 * Fecha 14/10/2021
 *
 * @author Francisco J. Sicilia
 */
public class Ejercicio6 {
  public static void main(String[] args) {
    
    double iva = 1.21;
    double precioSinIva = 20;
    double preciofinal = precioSinIva * iva;
    
    
    System.out.println("El precio sin iva es: " + precioSinIva + " euros");
    System.out.println("El IVA es: " + iva + " euros" );
    System.out.println("El precio final es: " + preciofinal + " euros");
  }
}
