/**
 * Escribe un programa que dada una hora determinada (horas y minutos), calcule
 * los segundos que faltan para llegar a la medianoche.
 * 
 * @author Francisco J. Sicilia
 */
public class Ejercicio11 {
  public static void main(String[] args) {
  
    System.out.println("A continuación introduce una hora determinada");
    System.out.printf("Por favor, introduzca la hora: ");
    double horas = Double.parseDouble(System.console().readLine());
    
    System.out.printf("Por favor, introduzca los minutos: ");
    double minutos = Double.parseDouble(System.console().readLine());
    
    double horasASegundos = (horas * 3600) + (minutos * 60);
    double segundosRestantes  = (86400 - horasASegundos); 
    
    System.out.printf("Segun las horas y minutos introducidos, faltan: " +segundosRestantes+ " segundos para media noche");
    
   
  }
}

