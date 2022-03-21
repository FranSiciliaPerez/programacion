import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio3 {

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        System.out.println("Introduzca 10 números enteros: ");
        for (int i = 0; i < 10; i++) {
            a.add(Integer.parseInt(System.console().readLine()));
        }
        System.out.println("Lista original: " + a);
        Collections.sort(a);
        System.out.println("Lista ordenada de menor a mayor: " + a);
    }
}
