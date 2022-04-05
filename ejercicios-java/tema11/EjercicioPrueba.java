import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EjercicioPrueba {
    public static void main(String[] args) {

        String nombreFichero = "precios.txt";

        try {

            BufferedReader bf = new BufferedReader(new FileReader("malaga.txt"));
            
            String linea = "";
            int numeroLineas = 0;
            double suma = 0;
            

            while (linea != null) {
                if (!linea.equals("")){

                    System.out.println(numeroLineas + ":" + linea);
                    numeroLineas++;
                    suma += Double.parseDouble(linea);
                }
                linea = bf.readLine();
                System.out.println("La suma total de los precios es:" + suma);
                System.out.println("");
            }
            bf.close();
        } catch (FileNotFoundException e) {
            System.out.println("\nNO se encuentra el fichero " + nombreFichero);
            System.out.println("");            
        } catch (IOException ioe) {
            System.out.println("\nNO se encuentra el fichero " + nombreFichero);   
        }
    }
}
