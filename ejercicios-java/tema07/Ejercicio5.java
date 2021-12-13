/*
 * Escribe un programa que pida 10 números por teclado y que luego muestre los
 * números introducidos junto con las palabras “máximo” y “mínimo” al lado del
 * máximo y del mínimo respectivamente.
*/
public class Ejercicio5 {
    public static void main(String[] args) {

        int[] numero = new int[10];
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        int i;
        System.out.println("Introduce 10 numeros pulsando ENTER para cada nñumero:");
        for (i = 0; i < 10; i++) {
            numero[i] = Integer.parseInt(System.console().readLine());
            if (numero[i] < minimo) {
                minimo = numero[i];
            }
            if (numero[i] > maximo) {
                maximo = numero[i];
            }
        }
        
        System.out.println();

        for (i = 0; i < 10; i++) {
            System.out.print(numero[i]);
            if (numero[i] == maximo) {
                System.out.print(" máximo");
            }
            if (numero[i] == minimo) {
                System.out.print(" mínimo");
            }
            System.out.println();
        }
    }
}
