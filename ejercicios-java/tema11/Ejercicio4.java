import java.util.HashMap;
import java.util.Map;

/*
 * Una empresa de vending nos ha pedido hacer un programa para una máquina expendedora de
 * comida y bebida. Para obtener un producto, el usuario debe introducir un código, a continuación se le
 * pide una cantidad y, por último, en caso de que la cantidad entregada sea mayor que el coste, la
 * máquina devuelve el cambio. Si se introduce un código incorrecto, se mostrará un mensaje de error.
 * A continuación se muestra una tabla con los productos disponibles. Toda esta información debe estar
 * guardada en uno o varios HashMap.
 */
public class Ejercicio4 {
    public static void main(String[] args) {

        HashMap<Integer, String> m1 = new HashMap<Integer, String>();
        m1.put(12, "Bocadillo");
        m1.put(34, "Ensalada");
        m1.put(56, "Patatas Fritas");
        m1.put(78, "Agua");
        m1.put(90, "Cerveza");

        HashMap<Integer, Double> m2 = new HashMap<Integer, Double>();
        m2.put(12, 4.50);
        m2.put(34, 5.75);
        m2.put(56, 2.80);
        m2.put(78, 1.20);
        m2.put(90, 1.50);

        System.out.print("Introduzca el código del producto: ");
        int codigoIntroducido = Integer.parseInt(System.console().readLine());

        if (m1.containsKey(codigoIntroducido)) {
            System.out.print("Producto seleccionado: \n");
            System.out.print(m1.get(codigoIntroducido));
            System.out.print(" " + m2.get(codigoIntroducido) + " euros");

            System.out.print("\nIntroduzca el dinero: ");
            Double codigoIntroducido2 = Double.parseDouble(System.console().readLine());
           
            if (m2.containsValue(codigoIntroducido2)) {
                for (Map.Entry precio: m2.entrySet()){
                System.out.print("Tome su producto y su cambio de: \n" + ((Double)codigoIntroducido2 - (Double)precio.getValue()));
            }
            } else {
                System.out.print("Lo siento, esa cantidad no es suficiente.\n");
                System.out.print("Inténtelo de nuevo.");
            }
        } else {
            System.out.print("El código introducido no existe.");
        }
    }
}