
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

        m.put("caliente","hot");
        m.put("rojo","red");
        m.put("ardiente", "hot");
        m.put("verde", "green");
        m.put("agujetas", "");
        m.put("abrasador", "hot");
        System.out.println("Los elementos de m son: \n" + m);
    
    }
}
