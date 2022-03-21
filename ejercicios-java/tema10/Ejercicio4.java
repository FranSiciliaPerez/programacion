import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio4 {

    public static void main(String[] args) {
        
        ArrayList<String> a = new ArrayList<String>();
        System.out.println("Introduzca 10 palabras: ");
        
        for (int i = 0; i < 10; i++) {
            a.add(System.console().readLine());
        }
        
        System.out.println("\nLista original:\n" + a);
        Collections.sort(a);
        System.out.println("\nLista ordenada alfabéticamente:\n" + a);
    }
}
