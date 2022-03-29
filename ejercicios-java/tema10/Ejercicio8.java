
/**
* 8. Realiza un programa que escoja al azar 10 cartas de la baraja
* española (10 objetos de la clase <code>Carta</code>). Emplea un
* objeto de la clase <code>ArrayList</code> para almacenarlas y
* asegúrate de que no se repite ninguna.
*
*/
import java.util.ArrayList;

public class Ejercicio8 {
    public static void main(String[] args) {

        ArrayList<carta> c = new ArrayList<carta>();
        carta cartaAux = new carta();

        c.add(cartaAux);
        for (int i = 0; i < 9; i++) {
            do {
                cartaAux = new carta();
            } while (c.contains(cartaAux));
            c.add(cartaAux);
        }
        for (carta miCarta : c) {
            System.out.println(miCarta);
        }

    }
}
