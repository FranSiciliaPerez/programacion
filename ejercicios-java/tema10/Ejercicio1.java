import java.util.ArrayList;
/**
 * Ejercicio 1 Tema 10 
 * 
 * Author Fran Sicilia
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        
        ArrayList<String> a = new ArrayList<String>();
        a.add("-Fran");
        a.add("-Jose");
        a.add("-Antunez");
        a.add("-Natalia");
        System.out.println("El listado de alumnos: ");

        for(String nombre : a) {
            System.out.println(nombre);
        }
    }
}
