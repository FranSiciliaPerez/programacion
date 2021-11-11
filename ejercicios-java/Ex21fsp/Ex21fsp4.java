/**
 * 4. Realiza un programa que calcule y muestre por pantalla el número de vueltas que da el
 * planeta Tierra en 400 años en los dos siguientes supuestos:
 *  a) Sin tener en cuenta los años bisiestos.
 *  b) Desde el año 1601 al 2000, ambos incluidos.
 * Nota: Los años bisiestos tienen 366 días en lugar de 365. Fueron bisiestos los años 1604,
 * 1608, 1612, 1616, …, 1988, 1992, 1996, 2000 (en total 97 años bisiestos).
 * 
 * @author Francisco J. Sicilia Pérez
 */
public class Ex21fsp4 {
  public static void main(String[] args) {
   
    System.out.println("Apartado a: ");
    
    int vueltasTotales = 365 * 400;
    
    System.out.println("Sin tener en cuenta los años bisiestos, en 400 años, la Tierra da " + vueltasTotales + " vueltas.");
  
    System.out.println("Apartado b: ");
    /*De los 400 años, 303 años son normales y 97 años son bisiestos */
    int vueltasTotalesNormal = 365 * 303;
    int vueltasTotalesPorAñoBisiesto = 366 * 97; 
    int vueltasTotalesB = vueltasTotalesNormal + vueltasTotalesPorAñoBisiesto;
    System.out.println("Desde el año 1601 al 2000, La Tierra dio " + vueltasTotalesB + " vueltas.");
  
  
  }
}
