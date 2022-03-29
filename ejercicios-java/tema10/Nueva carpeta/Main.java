public class Main {
    public static void main(String[] args) {

        Alumno  alumno1 = new Alumno ("perez","pepe");
        Alumno alumno2 = new Alumno ("Servia","David");
        alumno2= alumno1;
        /*alumno2= (Alumno)(alumno1.clone());*/
        
        alumno1.setNombre("Juan");
        System.out.println(alumno1);
        System.out.println(alumno2);
        
        
    }
}


