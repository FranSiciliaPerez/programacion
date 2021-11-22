/**
 * Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
 * una altura h. Aplica la fórmula t =√2h/g siendo g = 9:81m/s2
 * 
 * @author Francisco J. Sicilia
 */
public class Ejercicio6 {
  public static void main(String[] args) {
  
    System.out.printf("Por favor, introduzca el valor de la altura(en metros): ");
    double h = Double.parseDouble(System.console().readLine());
    
    double tiempo = Math.sqrt((2 * h)/9.81);
    System.out.printf("El tiempo que tarda el objeto en caer desde %f  es %f segudos", h , tiempo);
   
  }
}


