public class Alumno {

    int numeroExpediente;
    String nombre;
    String apellido;
    String telefono;
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    String estudiosPrevios = "Bachillerato";
    int anoNacimiento;
    boolean esRepetidor;

    public Alumno() {
    }

    public Alumno(int anoNacimiento, int numeroExpediente, String nombre, String apellido) {
        this.anoNacimiento = anoNacimiento;
        this.numeroExpediente = numeroExpediente;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void saluda() {
        System.out.println("Hola soy " + this.nombre);
    }

    public void saluda(String intensidad) {

        String cadena = "Hola soy " + this.nombre;
        switch (intensidad) {
            case "fuerte":
                cadena = cadena.toUpperCase();
                break;
            case "debil":
                cadena = cadena.toLowerCase();
            default:
                break;
        }
            System.out.println(cadena);
    }
    
}
