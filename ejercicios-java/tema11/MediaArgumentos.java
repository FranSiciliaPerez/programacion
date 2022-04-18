import java.io.BufferedReader;
import java.io.FileReader;

class MediaArgumentos {

  public static void main(String[] args) {
    
    String numero = "numero.txt";

    try {
      BufferedReader bf = new BufferedReader(new FileReader(numero));

      System.out.println("Introduce numeros:");
      double suma = 0;

     for (int i = 0; i < args.length; i++) {
        suma += Double.parseDouble(args[i]); 
         
      }
      System.out.println(suma / args.length);
    }catch(){}
  }
}
