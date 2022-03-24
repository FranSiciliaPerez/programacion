import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        ArrayList<Disco> album = new ArrayList<Disco>();

        Scanner s = new Scanner(System.in);

        int opcion;
        String autorIntroducido;
        String generoIntroducido;
        int DuracionIntroducido;
        int limiteIn;
        int limiteSup;

        album.add(new Disco("1", "Daft Punk", "Verdis Cuo", "instrumental", 120));
        album.add(new Disco("2", "Eiffel 65", "Blue (Da Ba Dee)", "techno", 180));
        album.add(new Disco("3", "The black eyes peas", "I gotta feeling", "pop/techno", 80));
        do {
            System.out.println("\n\nCOLECCIÓN DE DISCOS");
            System.out.println("===================");
            System.out.println("1. Listado");
            System.out.println("2. Nuevo disco");
            System.out.println("3. Modificar");
            System.out.println("4. Borrar");
            System.out.println("5. Salir");
            System.out.print("Introduzca una opción: ");
            opcion = Integer.parseInt(s.nextLine());

            switch (opcion) {
                case 1:
                    int opcionListado1 = 0;
                    System.out.println("\nLISTADO\n=======");
                    System.out.println("1. Completo");
                    System.out.println("2. Por autor");
                    System.out.println("3. Por género");
                    System.out.println("4. En un rango de duración");
                    System.out.println("5. Menú principal");
                    System.out.print("Introduzca una opción: ");
                    opcionListado1 = Integer.parseInt(s.nextLine());

                    switch (opcionListado1) {

                        case 1:

                            for (Disco d : album) {
                                System.out.println(d);
                            }
                            break;

                        case 2:

                            System.out.print("Introduzca el autor: ");
                            autorIntroducido = s.nextLine();

                            for (Disco d : album) {
                                if (d.getAutor().equals(autorIntroducido)) {
                                    System.out.println(d);
                                }
                            }
                            break;

                        case 3:

                            System.out.print("Introduzca el género: ");
                            generoIntroducido = s.nextLine();

                            for (Disco d : album) {
                                if (d.getGenero().equals(generoIntroducido)) {
                                    System.out.println(d);
                                }
                            }
                            break;

                        case 4:

                            System.out.println("Establezca el intervalo para la duración");
                            System.out.print("Introduzca el límite inferior de duración en minutos: ");
                            limiteIn = Integer.parseInt(s.nextLine());
                            System.out.print("Introduzca el límite superior de duración en minutos: ");
                            limiteSup = Integer.parseInt(s.nextLine());

                            for (Disco d : album) {
                                if ((d.getDuracion() <= limiteSup) && (d.getDuracion() >= limiteIn)) {
                                    System.out.println(d);
                                }
                            }
                            break;
                    }

                    break;
                case 2:
                    System.out.println("\nNUEVO DISCO\n===========");

                    break;
            }

        } while (opcion != 5);
    }
}
