import java.util.HashMap;
import java.util.Scanner;

public class EjemplosDiccionario {
    public static void main(String[] args) {
        HashMap<String, String> asignaturas = new HashMap<String, String>();
        asignaturas.put("PRO", "Programación");
        asignaturas.put("BBDD", "Bases de datos");
        asignaturas.put("LM", "Lenguajes de marcas");
        asignaturas.put("BBDD", "Bases de datos");
        asignaturas.put("ED", "Entornos de desarrollo");
        asignaturas.put("FOL","Formación y orientaciónlaboral");

        Scanner s = new Scanner(System.in);

        System.out.print("Introduce el código de la asignatura: ");
        String codigoIntro = s.nextLine().toUpperCase();

        if (!asignaturas.containsKey(codigoIntro)) {
            System.out.print("Esta asignatura no está registrada.");
        } else {
          System.out.println(asignaturas.get("Al codigo" + codigoIntro));
          System.out.print(" le corresponde la asignatura ");
          System.out.print(asignaturas.get(codigoIntro) + ".");
        }
    }
}
