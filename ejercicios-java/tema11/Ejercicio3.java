/**
 * Nos han pedido implementar el sistema de pagos Trizum. Mediante este novedoso
 * método, los
 * usuarios podrán enviar y recibir dinero teniendo como identificador su número
 * de teléfono móvil.
 * Cuando un usuario le envía dinero a otro, debe indicar el concepto. Se debe
 * llevar un registro de todas
 * las transacciones realizadas mediante el uso de ArrayList.
 * A continuación se muestran tanto el contenido del main como la salida
 * esperada del programa.
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Trizum alan = new Trizum("666 12 34 56");
        Trizum eva = new Trizum("777 11 22 33");
        Trizum peluqueria = new Trizum("555 44 55 66");
        alan.envia(eva, 20, "Clase de piano");
        alan.envia(peluqueria, 8, "Corte de pelo");
        eva.envia(peluqueria, 25.30, "Cortar y teñir");
        eva.envia(alan, 6.55, "Compra conjunta oficina");
        System.out.println(alan);
        System.out.println(eva);
        System.out.println(peluqueria);
    }
}
