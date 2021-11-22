/**
 * Escribe un programa que pida por teclado un día de la semana y que diga qué
 * asignatura toca a primera hora ese día.
 * 
 * @author Francisco J. Sicilia
 */
public class Ejercicio1 {
  public static void main(String[] args) {
  
    System.out.println("Escriba el dia de la semana");
    String diaDeLaSemana = System.console().readLine();
    
    switch (diaDeLaSemana) {
      case "Lunes":
      case "lunes":
        System.out.println("Los " + diaDeLaSemana + " primera hora toca Programacion");
        break;
      case "Martes":
      case "martes":
        System.out.println("Los " + diaDeLaSemana + " primera hora toca Programacion");
        break;
      case "Miercoles":
      case "miercoles": 
      case "Miércoles": 
      case "miércoles":
        System.out.println("Los " + diaDeLaSemana + " la primera hora es libre");
        break;
      case "Jueves":
      case "jueves":
        System.out.println("Los " + diaDeLaSemana + " primera hora toca Programacion");
        break;
      case "Viernes":
      case "viernes":
        System.out.println("Los " + diaDeLaSemana + " primera hora toca EIE-empresa e iniciativa emprendedora-");  
        break;
    default:
        System.out.println("El " + diaDeLaSemana + " no hay clases");
    }
  }
}
