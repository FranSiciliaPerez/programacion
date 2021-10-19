/**
 * Escribe un programa que calcule el salario semanal de 
 * un empleado en base a las horas trabajadas, a razón de 
 * 12 euros la hora.
 * 
 * @author Francisco J. Sicilia
 */
public class Ejercicio8 {
  public static void main(String[] args) {
  
    System.out.println("--Calcula el salario semanal según las horas trabajadas, a razón de 12 euros la hora.--");
    System.out.printf("Introduce las horas trabajadas por semana: ");
    double horasSemanales = Double.parseDouble(System.console().readLine());
  
    double salarioSemanal = horasSemanales * 12;
  
    System.out.println("El salario semanal por trabajar " + horasSemanales + " horas semanales es de : " + salarioSemanal + " euros");
  
  }
}
