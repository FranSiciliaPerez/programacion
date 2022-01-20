/**
 * Tema 08 Ejecicios de funciones biblioteca de  funciones matemáticas
 * 
 * 1. esCapicua: Devuelve verdadero si el número que se pasa como parámetro es capicúa y falso en caso contrario.
 * 2. esPrimo: Devuelve verdadero si el número que se pasa como parámetro es primo y falso en caso contrario.
 * 3. siguientePrimo: Devuelve el menor primo que es mayor al número que se pasa como parámetro.
 * 4. potencia: Dada una base y un exponente devuelve la potencia.
 * 5. digitos: Cuenta el número de dígitos de un número entero.
 * 6. voltea: Le da la vuelta a un número.
 * 7. digitoN: Devuelve el dígito que está en la posición n de un número entero. Se empieza contando por el 0 y de  *  izquierda a derecha.
 * 8. posicionDeDigito: Da la posición de la primera ocurrencia de un dígito dentro de un número entero. Si no se  *  encuentra, devuelve -1.
 * 9. quitaPorDetras: Le quita a un número n dígitos por detrás (por la derecha).
 * 10. quitaPorDelante: Le quita a un número n dígitos por delante (por la izquierda).
 * 11. pegaPorDetras: Añade un dígito a un número por detrás.
 * 12. pegaPorDelante: Añade un dígito a un número por delante.
 * 13. trozoDeNumero: Toma como parámetros las posiciones inicial y final dentro de un número y devuelve el trozo  *  correspondiente.
 * 14. juntaNumeros: Pega dos números para formar uno.
 */
public class Funciones {
    public static void main(String[] args) {
            
                System.out.println("Hola mundo");
        
                System.out.printf("Introduzca la primera nota: ");
                double nota1 = Double.parseDouble(System.console().readLine());
        
                System.out.printf("Introduzca la segunda nota: ");
                double nota2 = Double.parseDouble(System.console().readLine());
            
                double media = nota1 * 0.4 + nota2 * 0.6;
        
                System.out.println("La nota mdeia es: " + media);
        
            }
    public static double trimestre(double nota1, double nota2){
                return nota1 * 0.4 + nota2 * 0.6;
    }
    public static void esPrimo {
     
        System.out.print("\n");
        
        int numInt;
        int contDivisores = 2;
        boolean pregPrimo = true;
        do {
        if (numInt % contDivisores == 0 && numInt != contDivisores) {
            pregPrimo = false; 
        }
        contDivisores++;
       } while (contDivisores < numInt && pregPrimo == true);
   
      if ( pregPrimo == true ) {
       System.out.print(numInt+" Es primo");
      } else {
       System.out.print(numInt+" No es primo");
      }
    }
}
