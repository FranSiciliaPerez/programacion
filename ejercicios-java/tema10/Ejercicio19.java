
/** 
 * Realiza un buscador de sinónimos. Utiliza el diccionario español-inglés que se
 * proporciona a continuación. El programa preguntará una palabra y dará una
 *  lista de sinónimos (palabras que tienen el mismo significado). Por ejemplo, si
 * se introduce la palabra “caliente”, el programa dará como resultado: ardiente,
 * candente, abrasador. ¿Cómo sabe el programa cuáles son los sinónimos de
 *  “caliente”? Muy fácil, en el diccionario debe existir la entrada (“caliente”,
 * “hot”), por tanto solo tendrá que buscar las palabras en español que también
 * signifiquen “hot”; esta información estará en las entradas (“ardiente”, “hot”) y
 * (“abrasador”, “hot”). Cuando una palabra existe en el diccionario pero no tiene
 * sinónimos, debe mostrar el mensaje “No conozco sinónimos de esa palabra”.
 * Si una palabra no está en el diccionario se mostrará el mensaje “No conozco
 * esa palabra”. El usuario sale del programa escribiendo la palabra “salir”.
*/
import java.util.HashMap;

public class Ejercicio19 {
    public static void main(String[] args) {

        HashMap<String, String> diccionario = new HashMap<String, String>();

        diccionario.put("caliente", "hot");
        diccionario.put("rojo", "red");
        diccionario.put("ardiente", "hot");
        diccionario.put("verde", "green");
        diccionario.put("agujetas", "stiff");
        diccionario.put("abrasador", "hot");
        diccionario.put("hierro", "iron");
        diccionario.put("grande", "big");
        diccionario.put("gigantesco", "big");
        String palabra;

        do {
            System.out.printf("Introduzca una palabra y le daré los sinónimos: ");
            palabra = System.console().readLine().toLowerCase();

            if (diccionario.containsKey(palabra)) {

                System.out.println(diccionario.get(palabra));

            } else {
                System.out.println("El código introducido no existe.");
            }

        } while (!palabra.equals("salir"));

    }
}
