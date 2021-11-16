public class Ejercio16 {
    public static void main(String[] args) {
        System.out.print("Introduzca un número entero y le diré si es primo: ");
        int n = Integer.parseInt(System.console().readLine());
        boolean esPrimo = true;
        for (int i = 2; i < n; i++) {
            if ((n % i) == 0) {
                esPrimo = false;
            }
        }
        if (esPrimo) {
            System.out.println("El número introducido es primo.");
        } else {
            System.out.println("El número introducido no es primo.");
        }
    }
}
