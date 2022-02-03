public class Alumno {
    
    int numeroExpediente;
    String nombre;
    String apellidoa;
    String telefono;
    String estudiosPrevios = "Bachillerato";
    int añoNacimiento;
    boolean esRepetidor;
    
    public Alumno() {
        
    }
    public Alumno(int numeroExpediente, String nombre, String apellidoa) {
        this.numeroExpediente = numeroExpediente;
        this.nombre = nombre;
        this.apellidoa = apellidoa;
    }
    
}
