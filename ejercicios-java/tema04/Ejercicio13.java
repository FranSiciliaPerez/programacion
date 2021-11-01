/**
 * Realiza un programa que calcule la media de tres notas
 * 
 * @author Francisco J. Sicilia
 */
public class Ejercicio13 {
  public static void main(String[] args) {
    
    int resultado1;
    System.out.println("A continuación vas a proceder a realizar un questionario tipo test de 10 preguntas sobre las asignaturas que se imparten en el curso: ");
    System.out.printf("Primera pregunta: ¿Que lenguaje de los siguientes se utiliza en LM? ");
    System.out.printf("a-  ");
    System.out.printf("b-  ");
    System.out.printf("c-  ");
    String respuesta1 = System.console().readLine();
    if ((respuesta1.equals ("a")) || (respuesta1.equals ("A"))) {
      resultado1 = 1;
    }
    
    int resultado2;
    System.out.printf("Segunda pregunta: ¿Que lenguaje de los siguientes se utiliza en LM? ");
    System.out.printf("a-  ");
    System.out.printf("b-  ");
    System.out.printf("c-  ");
    String respuesta2 = System.console().readLine();
    if ((respuesta2.equals ("b")) || (respuesta2.equals ("B"))) {
      resultado2 = (resultado1 + 1);
    }
    
    int resultado3;
    System.out.printf("Tercera pregunta: ¿Que lenguaje de los siguientes se utiliza en LM? ");
    System.out.printf("a-  ");
    System.out.printf("b-  ");
    System.out.printf("c-  ");
    String respuesta3 = System.console().readLine();
    if ((respuesta3.equals ("c")) || (respuesta3.equals ("C"))) {
      resultado3 = resultado2 + 1;
    }
    
    int resultado4;
    System.out.printf("Cuarta pregunta: ¿Que lenguaje de los siguientes se utiliza en LM? ");
    System.out.printf("a-  ");
    System.out.printf("b-  ");
    System.out.printf("c-  ");
    String respuesta4 = System.console().readLine();
    if ((respuesta4.equals ("b")) || (respuesta4.equals ("B"))) {
      resultado4 = resultado3 + 1;
    }
    int resultado5;
    System.out.printf("Quinta pregunta: ¿Que lenguaje de los siguientes se utiliza en LM? ");
    System.out.printf("a-  ");
    System.out.printf("b-  ");
    System.out.printf("c-  ");
    String respuesta5 = System.console().readLine();
    if ((respuesta5.equals ("b")) || (respuesta5.equals ("B"))) {
      resultado5 = resultado3 + 1;
    }
    
    int resultado6;
    System.out.printf("Sexta pregunta: ¿Que lenguaje de los siguientes se utiliza en LM? ");
    System.out.printf("a-  ");
    System.out.printf("b-  ");
    System.out.printf("c-  ");
    String respuesta6 = System.console().readLine();
    if ((respuesta6.equals ("a")) || (respuesta6.equals ("A"))) {
      resultado6 = 1;
    }
    
    
    int resultado7;
    System.out.printf("Séptima pregunta: ¿Que lenguaje de los siguientes se utiliza en LM? ");
    System.out.printf("a-  ");
    System.out.printf("b-  ");
    System.out.printf("c-  ");
    String respuesta7 = System.console().readLine();
    if ((respuesta7.equals ("b")) || (respuesta7.equals ("B"))) {
      resultado7 = resultado6 + 1;
    }
    
    int resultado8;
    System.out.printf("Octaba pregunta: ¿Que lenguaje de los siguientes se utiliza en LM? ");
    System.out.printf("a-  ");
    System.out.printf("b-  ");
    System.out.printf("c-  ");
    String respuesta8 = System.console().readLine();
    if ((respuesta8.equals ("c")) || (respuesta8.equals ("C"))) {
      resultado8 = resultado2 + 1;
    }
    
    
    int resultado9;
    System.out.printf("Novena pregunta: ¿Que lenguaje de los siguientes se utiliza en LM? ");
    System.out.printf("a-  ");
    System.out.printf("b-  ");
    System.out.printf("c-  ");
    String respuesta9 = System.console().readLine();
    if ((respuesta9.equals ("b")) || (respuesta9.equals ("B"))) {
      resultado9 = resultado3 + 1;
    }
    
    
    int resultado10;
    System.out.printf("Décima pregunta: ¿Que lenguaje de los siguientes se utiliza en LM? ");
    System.out.printf("a-  ");
    System.out.printf("b-  ");
    System.out.printf("c-  ");
    String respuesta10 = System.console().readLine();
    if ((respuesta10.equals ("b")) || (respuesta9.equals ("B"))) {
      resultado10 = resultado9 + 1;
    }
   
   
  }
}
