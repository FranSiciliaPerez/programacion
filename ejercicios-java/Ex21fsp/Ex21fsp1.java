/**
 *  1º
 * Escribe un programa que traduzca cada uno de los números de un PIN de 4 dígitos
 * introducido por el usuario a su correspondiente palabra. Si el usuario introduce un número de
 * menos de 4 dígitos, se entiende que el PIN tiene ceros a la izquierda hasta completar esos 4
 * dígitos
 * 
 * @author Francisco J. Sicilia
 */
public class Ex21fsp1 {
  public static void main(String[] args) {
  int primera = 0;
   int n = 0; 
   
   System.out.println("Introduce un número de 5 cifras max y diré cual es la primera cifra de este");
   n = Integer.parseInt(System.console().readLine());
   
   if (n < 10) {
      primera = n;
    }
    
   if (( n >= 10 ) && ( n < 100 )) {
      primera = n / 10;
    }
   
   if (( n >= 100 ) && ( n < 1000 )) {
      primera = n / 100;
    } 
   
   if (( n >= 1000 ) && ( n < 10000 )) {
      primera = n / 1000;
    } 
   
   
   System.out.println("La primera cifra del número introducido es el: " + primera);
  
  
    
    
    
  
  
  
  
  
  
  
  }

}
