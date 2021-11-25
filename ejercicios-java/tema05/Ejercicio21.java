/*
 * Realiza un programa que vaya pidiendo números hasta que se introduzca un
 * numero negativo y nos diga cuantos números se han introducido, la media de
 * los impares y el mayor de los pares. El número negativo sólo se utiliza para
 * indicar el final de la introducción de datos pero no se incluye en el cómputo.
*/
public class Ejercicio21 {
    public static void main(String[] args) {
        System.out.println("A continuación introduce números, para salir, ponga un número negativo");
        int n = 1;
        int cont = -1;
        int pruebaImp = 0;
        int nImp = 0;
        int contImp = 0;
        int mediaImp = 0;
        while (n >= 0) {
            System.out.printf("Introduce un número: ");
            n = Integer.parseInt(System.console().readLine());  
            cont++;
            pruebaImp = n % 2;
            if (pruebaImp != 0){
                contImp++;
                mediaImp = (nImp + n)/contImp;
            }
        }
        System.out.println("Se han introducido "+ cont + " números, de los que la media impar es "+contImp+" " +mediaImp); 
    }
}
