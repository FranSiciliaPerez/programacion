public class Ejercicio7 {
    public static void main(String[] args) {
        
        int cont = 4;
        System.out.println("Introduce la combinación para poder acceder a la caja fuerte, cuentas de " + cont +" intentos");
        int n = Integer.parseInt(System.console().readLine());
        do {
            if (n == 1234) {
                System.out.println("La caja fuerte se ha abiero satisfactoriamente");
                cont = 0;
            } else {
                cont--;
                System.out.println("Lo siento, esa no es la combinación");
                System.out.println("Introduce de nuevo la combinación para poder acceder a la caja fuerte, dispones de " + cont + " intentos");
                n = Integer.parseInt(System.console().readLine());
                if (n == 1234) {
                    System.out.println("La caja fuerte se ha abiero satisfactoriamente");
                } else {
                    cont--;
                    System.out.println("Lo siento, esa no es la combinación tiene " + cont + " intentos" );
                }
            }
        } while (cont > 1);
    }
}
