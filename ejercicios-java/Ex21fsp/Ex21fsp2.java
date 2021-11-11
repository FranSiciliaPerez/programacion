/**
 * 2º
 * Implementa un programa que calcule el número de latidos del corazón de una persona
 * durante el transcurso de varios años. Al usuario se le solicitará el tiempo transcurrido,
 * expresado en años, y el ritmo cardíaco medio durante todos esos años, medido en latidos por
 * minuto. No es necesario considerar los años bisiestos, se considera que todos los años tienen
 * 365 días.
 * 
 * @author Francisco J. Sicilia Pérez
 */
public class Ex21fsp2 {
  public static void main(String[] args) {
  
    System.out.printf("Introduzca su ritmo cardíaco medio en pulsaciones por minuto: ");
    int pulsacionesMinut = Integer.parseInt(System.console().readLine());
   
    System.out.printf("Introduzca el tiempo en años: ");
    int años = Integer.parseInt(System.console().readLine());
   
    int latidosPorAño = (pulsacionesMinut * 60 * 24 * 365) ;
    int latidosTotales = (latidosPorAño * años);
   
    System.out.println("En ese tiempo, su corazón habrá latido " +latidosTotales + " veces");
  
  
  }

}
