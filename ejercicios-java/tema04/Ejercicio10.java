/**
 * Realiza un programa que resuelva una ecuación de segundo grado 
 * (del tipo ax2 + bx + c = 0).
 * 
 * @author Francisco J. Sicilia
 */
public class Ejercicio10 {
  public static void main(String[] args) {
  
    System.out.println("A continuación introduce el dia y el mes de nacimiento para saber tu signo del horóscopo");
    System.out.printf("Por favor, introduzca el dia de nacimiento: ");
    double dia = Double.parseDouble(System.console().readLine());
    
    System.out.printf("Por favor, introduzca el mes de nacimiento: ");
    String mes = System.console().readLine();
    
    switch (mes) {
      case "Enero":
      case "enero":
        if ((dia >= 1) && (dia <= 19)) {
         System.out.println("El signo del zodiaco que corresponde con tu fecha de nacimiento es: capricornio  ");
        }
        if ((dia >= 20) && (dia <= 31)) {
         System.out.println("El signo del zodiaco que corresponde con tu fecha de nacimiento es: acuario  ");
        }
      break;
      case "Febrero":
      case "febrero":
        if ((dia >= 1) && (dia <= 19)) {
         System.out.println("El signo del zodiaco que corresponde con tu fecha de nacimiento es: acuario  ");
        }
        if ((dia >= 20) && (dia <= 31)) {
         System.out.println("El signo del zodiaco que corresponde con tu fecha de nacimiento es: piscis ");
        }
      break;
      case "Marzo":
      case "marzo":
        if ((dia >= 1) && (dia <=20 )) {
         System.out.println("El signo del zodiaco que corresponde con tu fecha de nacimiento es: piscis  ");
        }
        if ((dia >= 21) && (dia <= 20)) {
         System.out.println("El signo del zodiaco que corresponde con tu fecha de nacimiento es: aries ");
        }
      break;
      case "Abril":
      case "abril":
        if ((dia >= 1) && (dia <= 20)) {
         System.out.println("El signo del zodiaco que corresponde con tu fecha de nacimiento es: aries ");
        }
        if ((dia >= 21) && (dia <= 30)) {
         System.out.println("El signo del zodiaco que corresponde con tu fecha de nacimiento es: tauro ");
        }
      break;
      case "Mayo":
      case "mayo":
        if ((dia >= 1) && (dia <= 21)) {
         System.out.println("El signo del zodiaco que corresponde con tu fecha de nacimiento es: tauro ");
        }
        if ((dia >= 22) && (dia <= 31)) {
         System.out.println("El signo del zodiaco que corresponde con tu fecha de nacimiento es: geminis ");
        }
      break;
      case "Junio":
      case "junio":
        if ((dia >= 1) && (dia <= 21)) {
         System.out.println("El signo del zodiaco que corresponde con tu fecha de nacimiento es: geminis ");
        }
        if ((dia >= 22) && (dia <= 30)) {
         System.out.println("El signo del zodiaco que corresponde con tu fecha de nacimiento es: cancer ");
        }
      break;
      case "Julio":
      case "julio":
        if ((dia >= 1) && (dia <= 23)) {
         System.out.println("El signo del zodiaco que corresponde con tu fecha de nacimiento es: cancer ");
        }
        if ((dia >= 24) && (dia <= 31)) {
         System.out.println("El signo del zodiaco que corresponde con tu fecha de nacimiento es: leo ");
        }
      break;
      case "Agosto":
      case "agosto":
        if ((dia >= 1) && (dia <= 23)) {
         System.out.println("El signo del zodiaco que corresponde con tu fecha de nacimiento es: leo ");
        }
        if ((dia >= 24) && (dia <= 31)) {
         System.out.println("El signo del zodiaco que corresponde con tu fecha de nacimiento es: virgo ");
        }
      break;
      case "Septiembre":
      case "septiembre":
        if ((dia >= 1) && (dia <= 22)) {
         System.out.println("El signo del zodiaco que corresponde con tu fecha de nacimiento es: virgo ");
        }
        if ((dia >= 23) && (dia <= 31)) {
         System.out.println("El signo del zodiaco que corresponde con tu fecha de nacimiento es: libra ");
        }
      break;
      case "Octubre":
      case "octubre":
        if ((dia >= 1) && (dia <= 22)) {
         System.out.println("El signo del zodiaco que corresponde con tu fecha de nacimiento es: libra ");
        }
        if ((dia >= 23) && (dia <= 31)) {
         System.out.println("El signo del zodiaco que corresponde con tu fecha de nacimiento es: escorpio ");
        }
      break;
      case "Noviembre":
      case "noviembre":
        if ((dia >= 0) && (dia <= 22)) {
         System.out.println("El signo del zodiaco que corresponde con tu fecha de nacimiento es: escorpio ");
        }
        if ((dia >= 23) && (dia <= 30)) {
         System.out.println("El signo del zodiaco que corresponde con tu fecha de nacimiento es: sagitario ");
        }
      break;
      case "Diciembre":
      case "diciembre":
        if ((dia >= 1) && (dia <= 21)) {
         System.out.println("El signo del zodiaco que corresponde con tu fecha de nacimiento es: sagitario ");
        }
        if ((dia >= 22) && (dia <= 31)) {
         System.out.println("El signo del zodiaco que corresponde con tu fecha de nacimiento es: capricornio ");
        }
      break;
    }
  }
}

