public class Prueba {
    public static void main(String[] args) {
    
        int figuraNumerica = (int)(Math.random() * 3);

        switch (figuraNumerica) {
            case 0: 
            System.out.println("piedra");
            break;
            case 1:
            System.out.println("papel");
            break;
            case 2:
            System.out.println("tijeras");
            break;
        }

    }
}
