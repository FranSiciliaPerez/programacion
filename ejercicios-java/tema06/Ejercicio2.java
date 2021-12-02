/*
 * Realiza un programa que muestre al azar el nombre de una carta de la baraja
 * francesa. Esta baraja está dividida en cuatro palos: picas, corazones, diamantes
 * y tréboles. Cada palo está formado por 13 cartas, de las cuales 9 cartas son
 * numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el
 * 1). Para convertir un número en una cadena de caracteres podemos usar
 * String.valueOf(n).
 * 
 * Author Francisco Sicilia
*/
public class Ejercicio2 {
    public static void main(String[] args) {
        
        int carta = (int)(Math.random()*13) + 1;
        int numPalo =  (int)(Math.random()*4) + 1;
        if ((carta > 1) && (carta <= 10)){
            System.out.printf("La carta es "+carta);
        }

        switch (carta) {
            case 1: 
                System.out.printf("La carta es A");
            break;
            case 11 :
                System.out.printf("La carta es J");
            break;
            case 12:
                System.out.printf("La carta es Q");
            break;
            case 13:
                System.out.printf("La carta es K");
            break;
        }
        switch (numPalo) {
            case 1: 
                System.out.printf(" de rombos");
            break;
            case 2 :
                System.out.printf(" de picas");
            break;
            case 3:
                System.out.printf(" de corazones");
            break;
            case 4: 
                System.out.printf(" de tréboles");
            break;
        }
    }
}
