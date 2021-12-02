/*
 * Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
 * de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
*/
public class Ejercicio3 {
    public static void main(String[] args) {
        
        int carta = (int)(Math.random()*10) + 1;
        int numPalo =  (int)(Math.random()*4) + 1;
        if ((carta > 1) && (carta <= 7)){
            System.out.printf("La carta es "+carta);
        }

        switch (carta) {
            case 1: 
                System.out.printf("La carta es as");
            break;
            case 8 :
                System.out.printf("La carta es sota");
            break;
            case 9:
                System.out.printf("La carta es caballo");
            break;
            case 10:
                System.out.printf("La carta es rey");
            break;
        }
        switch (numPalo) {
            case 1: 
                System.out.printf(" de oro");
            break;
            case 2 :
                System.out.printf(" de bastos");
            break;
            case 3:
                System.out.printf(" de espadas");
            break;
            case 4: 
                System.out.printf(" de copas");
            break;
        }
    }
}
