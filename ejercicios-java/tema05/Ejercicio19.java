/*
 * Realiza un programa que pinte una pirámide por pantalla. La altura se debe
 * pedir por teclado. El carácter con el que se pinta la pirámide también se debe
 * pedir por teclado.
*/
public class Ejercicio19 {
    public static void main(String[] args) {
        /*Altura = h*/
        System.out.printf("A continuación, introduczca la altura de la pirámide: ");
        int h = Integer.parseInt(System.console().readLine());
        /*Simbolo = b*/
        System.out.printf("A continuación, introduczca un carácter por pantalla para realizar la pirámide: ");
        String b = System.console().readLine();
        for (int i= h; i > 0; i--){
            System.out.println(" "+b+" "+b);
        }
    }
}
