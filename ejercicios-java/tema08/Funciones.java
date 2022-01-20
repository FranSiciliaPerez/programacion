package ejercicios-java.tema08;

public class Funciones {
    public static void main(String[] args) {
            
                System.out.println("Hola mundo");
        
                System.out.printf("Introduzca la primera nota: ");
                double nota1 = Double.parseDouble(System.console().readLine());
        
                System.out.printf("Introduzca la segunda nota: ");
                double nota2 = Double.parseDouble(System.console().readLine());
            
                double media = nota1 * 0.4 + nota2 * 0.6;
        
                System.out.println("La nota mdeia es: " + media);
        
            }
            public static double trimestre(double nota1, double nota2){
                return nota1 * 0.4 + nota2 * 0.6;
    }
}
