/**
 * Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente
 * nombre del día de la semana.
 * 
 * @author Francisco J. Sicilia
 */
public class Ejercicio3 {
  public static void main(String[] args) {
  
    System.out.printf("Escriba el numero del 1 al 7: ");
    int diaDeLaSemana = Integer.parseInt(System.console().readLine());
    
    switch (diaDeLaSemana) {
      case 1:
        System.out.println("Lunes");
        break;
      case 2:
        System.out.println("Martes");
        break;
      case 3:
        System.out.println("Miércoles");
        break;
      case 4:
        System.out.println("Jueves");
        break;
      case 5:
        System.out.println("Viernes");  
        break;
      case 6:
        System.out.println("Sabado");  
        break;
      case 7:
        System.out.println("Domingo");  
        break;
    default:
        System.out.println("El " + diaDeLaSemana + " no e un dia de la semana");
    }
  }
}

