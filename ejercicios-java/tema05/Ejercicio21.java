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
        int pruebaN;
        int contImp = 0;
        int sumaImp = 0;
        int mediaImp;
        int sumaPar = 0;
        while (n >= 0) {
            System.out.printf("Introduce un número: ");
            n = Integer.parseInt(System.console().readLine());  
            cont++;
            pruebaN = n % 2;
            if ((pruebaN != 0) && (n >=0)){
                sumaImp +=n;
                contImp++;
            }
            if (pruebaN == 0){
                
                if(n > sumaPar) {
                    sumaPar = n;
                }
            }
        }
        mediaImp = sumaImp/(contImp);
        System.out.println("Se ha introducido "+ cont + " números, la media de los impares es " +mediaImp+ "el número par mayor es: " +sumaPar); 
    }
}
