/**
 * 12. Realiza un minicuestionario con 10 preguntas tipo test sobre las
* asignaturas que se imparten en el curso. Cada pregunta acertada
* sumará un punto. El programa mostrará al final la califcación
* obtenida. Pásale el minicuestionario a tus compañeros y pídeles
* que lo hagan para ver qué tal andan de conocimientos en las
* diferentes asignaturas del curso.
 * @author Francisco J. Sicilia
 */
public class Ejercicio12 {
  public static void main(String[] args) {
    
    int resultado = 0;
    System.out.println("A continuación vas a proceder a realizar un questionario tipo test de 10 preguntas sobre las asignaturas que se imparten en el curso: ");
    System.out.printf("Primera pregunta: ¿Que lenguaje de los siguientes se utiliza en LM? ");
    System.out.printf("a-  ");
    System.out.printf("b-  ");
    System.out.printf("c-  ");
    String respuesta = System.console().readLine().toLowerCase();
    /*resultado = respuesta.equals("a") ? resultado + 1 : resultado;
    ++       sistema parecido*/
    
    
    if (respuesta.equals ("a")) {
      resultado++;
    }
    
    System.out.printf("Segunda pregunta: ¿Que lenguaje de los siguientes se utiliza en LM? ");
    System.out.printf("a-  ");
    System.out.printf("b-  ");
    System.out.printf("c-  ");
    respuesta = System.console().readLine();
    if (respuesta.equals ("b")) {
      resultado++;
    }
    
    System.out.printf("Tercera pregunta: ¿Que lenguaje de los siguientes se utiliza en LM? ");
    System.out.printf("a-  ");
    System.out.printf("b-  ");
    System.out.printf("c-  ");
    respuesta = System.console().readLine();
    if (respuesta.equals ("c")) {
      resultado++;
    }
    
    System.out.printf("Cuarta pregunta: ¿Que lenguaje de los siguientes se utiliza en LM? ");
    System.out.printf("a-  ");
    System.out.printf("b-  ");
    System.out.printf("c-  ");
    respuesta = System.console().readLine();
    if (respuesta.equals ("b")) {
      resultado++;
    }

    System.out.printf("Quinta pregunta: ¿Que lenguaje de los siguientes se utiliza en LM? ");
    System.out.printf("a-  ");
    System.out.printf("b-  ");
    System.out.printf("c-  ");
    respuesta = System.console().readLine();
    if (respuesta.equals ("b")) {
      resultado++;
    }
    
    System.out.printf("Sexta pregunta: ¿Que lenguaje de los siguientes se utiliza en LM? ");
    System.out.printf("a-  ");
    System.out.printf("b-  ");
    System.out.printf("c-  ");
    respuesta = System.console().readLine();
    if (respuesta.equals ("a")) {
      resultado++;
    }
    
    System.out.printf("Séptima pregunta: ¿Que lenguaje de los siguientes se utiliza en LM? ");
    System.out.printf("a-  ");
    System.out.printf("b-  ");
    System.out.printf("c-  ");
    respuesta = System.console().readLine();
    if (respuesta.equals ("b"))  {
      resultado++;
    }
    
    System.out.printf("Octaba pregunta: ¿Que lenguaje de los siguientes se utiliza en LM? ");
    System.out.printf("a-  ");
    System.out.printf("b-  ");
    System.out.printf("c-  ");
    respuesta = System.console().readLine();
    if (respuesta.equals ("c")) {
      resultado++;
    }
    
    System.out.printf("Novena pregunta: ¿Que lenguaje de los siguientes se utiliza en LM? ");
    System.out.printf("a-  ");
    System.out.printf("b-  ");
    System.out.printf("c-  ");
    respuesta = System.console().readLine();
    if ((respuesta.equals ("b")) || (respuesta.equals ("B"))) {
      resultado++;
    }
    
    System.out.printf("Décima pregunta: ¿Que lenguaje de los siguientes se utiliza en LM? ");
    System.out.printf("a-  ");
    System.out.printf("b-  ");
    System.out.printf("c-  ");
    respuesta = System.console().readLine();
    if ((respuesta.equals ("b")) || (respuesta.equals ("B"))) {
      resultado++;
    }
   System.out.println("La calificacion obtenida es de: " +resultado);
   
  }
}

