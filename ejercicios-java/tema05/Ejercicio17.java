/*
 * Realiza un programa que sume los 100 números siguientes a un número entero
 * y positivo introducido por teclado. Se debe comprobar que el dato introducido
 * es correcto (que es un número positivo).
*/
public class Ejercicio17 {
    public static void main(String[] args) {
        
        System.out.printf("Introduce un número: ");
        int n = Integer.parseInt(System.console().readLine());
        

        if (n >= 0) {
            System.out.println("El número introducido " + n + " es positivo, la operación continua");
            int cont = 100;
            while (cont >= 0) {
                n ++;
                cont -= 1;
                System.out.println("Segun el número introducido, estos le siguen: " + n);
            }
        } else {
            System.out.println("El número introducido " + n + " es negativo");
        }
    }
}
