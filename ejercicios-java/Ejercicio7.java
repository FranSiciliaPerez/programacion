public class Ejercicio7 {
    public static void main(String[] args) {
        System.out.println("Introduce la combinación para poder acceder a la caja fuerte");
        int n = Integer.parseInt(System.console().readLine());
        int cont = 4;
        do {
            if (n == 1234) {
                System.out.println("La caja fuerte se ha abiero satisfactoriamente");
                cont = 0;
            } else {
                System.out.println("Lo siento, esa no es la combinación");
                cont--;
                System.out.println("Introduce de nuevo la combinación para poder acceder a la caja fuerte");
                n = Integer.parseInt(System.console().readLine());
                if (n == 1234) {
                    System.out.println("La caja fuerte se ha abiero satisfactoriamente");
                } else {
                    System.out.println("Lo siento, esa no es la combinación");
                    cont--;
                }
            }
        } while (cont > 1);
    }
}
