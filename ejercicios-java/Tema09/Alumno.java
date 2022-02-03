public class Alumno {

    int numeroExpediente;
    String nombre;
    String apellido;
    String telefono;
    String estudiosPrevios = "Bachillerato";
    int anoNacimiento;
    boolean esRepetidor;

    public Alumno() {

    }

    public Alumno(int anoNacimiento, boolean esRepetidor, int numeroExpediente, String nombre, String apellido) {
        this.anoNacimiento = anoNacimiento;
        this.esRepetidor = esRepetidor;
        this.numeroExpediente = numeroExpediente;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void saluda() {
        System.out.println("Hola soy" + this.nombre);
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
                System.out.println(cadena);
        }
    }
}
