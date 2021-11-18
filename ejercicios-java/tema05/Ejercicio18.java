/* 
 * Escribe un programa que obtenga los números enteros comprendidos entre dos
 * números introducidos por teclado y validados como distintos, el programa debe
 * empezar por el menor de los enteros introducidos e ir incrementando de 7 en 7.
 * 
*/
public class Ejercicio18 {
    public static void main(String[] args) {
        System.out.println("A continuación introduce dos números para mostrar los números comprendidos entre ellos");
        System.out.printf("Intoduce el primer número: ");
        int n1 = Integer.parseInt(System.console().readLine());

        System.out.printf("Intoduce el segundo número: ");
        int n2 = Integer.parseInt(System.console().readLine());
        
        if (n1 != n2) {
            System.out.println("Los números introducidos son diferentes entre si, puede continuar");
            System.out.println("Según los números introducidos estos son los números comprendidos entre ellos: ");
            while (n1 > n2) {
                System.out.println(" " + n2);
                n2 +=7;
            }
            while (n2 > n1) {
                System.out.println(" " + n1);
                n1 +=7;
            }
        } else {
            System.out.println("Los números introducidos son iguales, no e puede llevar a cabo el programa.");
        }
    }
}
