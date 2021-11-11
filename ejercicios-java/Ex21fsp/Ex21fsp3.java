/**
 * 3º
 * Una empresa textil que realiza polos personalizados para trabajadores, asociaciones y clubes
 * nos ha pedido hacer un programa que sea capaz de elaborar presupuestos. El precio de cada
 * polo depende de si se piden en blanco o en color, de la cantidad que se pida y del tipo de
 * técnica que se emplee para el logotipo, que puede ser serigrafía o bordado. En un
 * presupuesto no se mezclan distintos colores o técnicas. El pedido mínimo son 20 polos.
 * Suponemos que el usuario introduce correctamente todos los datos. En este ejercicio no hay
 * que comprobar la validez de los mismos. A la cantidad final hay que sumarle el IVA del 21%.
 * 
 * 
 * 
 * @author Francisco J. Sicilia
 */
public class Ex21fsp3 {
  public static void main(String[] args) {
  
    System.out.printf("Introduzca la cantidad de polos que desea: ");
    int cantPolos = Integer.parseInt(System.console().readLine());
    
    System.out.printf("1) blanco 2) color: ");
    int n = Integer.parseInt(System.console().readLine());
    
    System.out.printf("1) serigrafia 2) bordado: ");
    int n2 = Integer.parseInt(System.console().readLine());
   
    double totalPoloBlanco = 0;
    double precioUnidad = 0 ;
    double totalPoloColor = 0;
    switch (n) {
      case 1:
        if ((cantPolos >= 20) && (cantPolos <= 39)) {
          totalPoloBlanco = (double)cantPolos * 4.90;
          precioUnidad = 4.90; 
        }
        if ((cantPolos >= 40) && (cantPolos <= 99)) {
          totalPoloBlanco = (double)cantPolos * 3.90;
          precioUnidad = 3.90; 
        }
        if (cantPolos >= 100) {
          totalPoloBlanco = (double)cantPolos * 3.20;
          precioUnidad = 3.20; 
        }
      case 2:
        if ((cantPolos >= 20) && (cantPolos <= 39)) {
          totalPoloColor = cantPolos * 4.90 * (20/100);
          precioUnidad = 4.9 + (4.90 * 0.2);
        }
        if ((cantPolos >= 40) && (cantPolos <= 99)) {
          totalPoloColor = cantPolos * 3.90 * (20/100);
          precioUnidad = 3.90 + (3.90 * 0.2);
        }
        if (cantPolos >= 100) {
          totalPoloColor = cantPolos * 3.20 * (20/100); 
          precioUnidad = 3.20 + (3.20 * 0.2);
        }
      break;
    }
    
    
    double serigrafia = 0;
    double bordado = 0;
    double totalBordado = 0;
    double totalSerigrafia = 0;
    double iva = 0;
    switch (n2) {
      case 1:
        if (cantPolos < 50) {
          serigrafia = 2.00;
          totalSerigrafia = 2.00 * cantPolos;
          iva = (totalSerigrafia +)*0.21; 
        }
        if (cantPolos >= 50) {
          serigrafia = 1.50;
          totalSerigrafia = 1.50 * cantPolos;
          iva = (totalSerigrafia +)*0.21; 
        }
        System.out.println("EL POLITO BONITO – PRESUPUESTO");
        System.out.println("                              ");
        System.out.println("Polo en color (unid.)   " + cantPolos + " €");
        System.out.println("Precio unitario         " + precioUnidad + " €");
        System.out.println("Total textil            " + totalPoloBlanco + totalPoloColor+" €");
        System.out.println("Serigrafia (c.u.)       " + serigrafia+ " €");
        System.out.println("Total serigrafia        " + totalSerigrafia+ " €");
        System.out.println("Polo más logotipo");
        System.out.println("IVA");
        System.out.println("TOTAL");
      case 2:
        if (cantPolos < 50) {
          bordado = 3.00;
          totalBordado = 3.00 * cantPolos; 
          iva = (totalBordado +)*0.21;
        }
        if (cantPolos >= 50) {
          bordado = 2.50;
          totalSerigrafia = 2.50 * cantPolos; 
          iva = (totalBordado +)*0.21;
        }
         
        System.out.println("EL POLITO BONITO – PRESUPUESTO");
        System.out.println("                              ");
        System.out.println("Polo en color (unid.)   " + cantPolos + " €");
        System.out.println("Precio unitario         " + precioUnidad + " €");
        System.out.println("Total textil            " + totalPoloBlanco + totalPoloColor +" €");
        System.out.println("Bordado (c.u.)          " + bordado + " €");
        System.out.println("Total bordado           " + totalBordado + " €");
        System.out.println("Polo más logotipo       ");
        System.out.println("IVA                     ");
        System.out.println("TOTAL                   ");
      break;
    }
  
    
  }
}
