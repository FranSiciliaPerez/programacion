import java.io.File;
import java.io.FilenameFilter;

public class EjercicioPruebaFichero {
    public static void main(String[] args) {

    File f = new File(".");

    // This filter will only include files ending with .py
    FilenameFilter filter = new FilenameFilter() {
      @Override
      public boolean accept(File f, String name) {
        return name.endsWith(".java");
      }
    };

    final String[] LISTA_ARCHIVOS = f.list(filter);
    for (String nombreArchivo : LISTA_ARCHIVOS) {
      System.out.println(nombreArchivo);
    }
  }
}
