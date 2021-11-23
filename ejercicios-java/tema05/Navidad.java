public class Navidad {
    public static void main(String[] args) {
        
        System.out.println("Este programa pinta un árbool de navidad.");
        System.out.printf("Por favor, introduzca la altura: ");
        int h = Integer.parseInt(System.console().readLine());
        System.out.println("⭐");
        for (int i = h - 3; i > 0; i--) {
            System.out.println(" /");
        }
        System.out.println(" #");
        System.out.println(" #");
    }
}
