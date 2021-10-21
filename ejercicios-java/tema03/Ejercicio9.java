/**
 * Calcula el volumen de un cono
 * 
 * @author Francisco J. Sicilia
 */
public class Ejercicio9 {
  public static void main(String[] args) {
  
    System.out.println("--Calcula el volumen de un cono segun la fómula V = ½r2h --");
    System.out.printf("Introduce el radio del cono en cm: ");
    double radio = Double.parseDouble(System.console().readLine());
  
    System.out.printf("Introduce la altura del cono en cm: ");
    double altura = Double.parseDouble(System.console().readLine());
    
    double volumenCono = (radio * radio * Math.PI * altura) / 3;
      
    System.out.println("El volumen del cono es: " + volumenCono + " cm3");
  
  }
}
