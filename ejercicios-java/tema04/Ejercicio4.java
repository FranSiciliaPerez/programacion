/**
 * Escribe un programa que calcule el salario semanal de un
 * trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
 * trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros
 * la hora.
 * 
 * @author Francisco J. Sicilia
 */
public class Ejercicio4 {
  public static void main(String[] args) {
  
    System.out.println("--Calcula el salario semanal según las horas trabajadas, a razón de 12 euros la hora.--");
    System.out.printf("Introduce las horas trabajadas por semana: ");
    double horasSemanales = Double.parseDouble(System.console().readLine());
    double salarioSemanal = horasSemanales * 12;
    
    if (horasSemanales <= 40) {
      System.out.println("El salario semanal por trabajar " + horasSemanales + " horas semanales es de : " + salarioSemanal + " euros");
    }
    if (horasSemanales >= 41) {
      double salarioExtra = (horasSemanales - 41) * 16;
      double salarioTotal = salarioExtra + salarioSemanal;
      System.out.println("El salario semanal por trabajar " + horasSemanales + " horas semanales es de : " + salarioTotal + " euros");
    }
  }
}

