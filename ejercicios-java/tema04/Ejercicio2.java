/**
 * Realiza un programa que pida una hora por teclado y que muestre luego buenos
 * días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos de
 * 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las
 * horas, los minutos no se deben introducir por teclado.
 * 
 * @author Francisco J. Sicilia
 */
public class Ejercicio2 {
  public static void main(String[] args) {
  
    System.out.println("A continuación escriba la hora actual");
    int horaDelDia = Integer.parseInt(System.console().readLine());
    
    if ((horaDelDia > 5) && (horaDelDia < 12)) {
      System.out.println("Buenos dias");
    }
    if ((horaDelDia > 11) && (horaDelDia < 21)) {
        System.out.println("Buenas tardes");
    }
    if ((horaDelDia > 20) || (horaDelDia < 6)) {
          System.out.println("Buenas noches");
    } 
  }
}
