import java.time.LocalDate;

public class Medico extends Persona implements Registro {
    private Servicio servicio;
    private Especialidad especialidad;
    private int numeroDeConsultorio;

    public Medico(String nombre, String apellido, String direccion, String ciudadProcedencia, int edad, int dni, LocalDate fechaNacimiento, Servicio servicio, Especialidad especialidad, int numeroDeConsultorio) {
        super(nombre, apellido, direccion, ciudadProcedencia, edad, dni, fechaNacimiento);
        this.servicio = servicio;
        this.especialidad = especialidad;
        this.numeroDeConsultorio = numeroDeConsultorio;
    }

    public Medico() {
        super();
        this.servicio = Servicio.CIRUGIA;
        this.especialidad = Especialidad.CIRUJANO;
        this.numeroDeConsultorio = 10;
    }

    public int getNumeroDeConsultorio() {
        return numeroDeConsultorio;
    }

    public Especialidad getEspecialidad(){
        return this.especialidad;
    }

    @Override
    public void registrar() {
        super.registrar();
        System.out.println(
            "| Servicio: "     + this.servicio     +
            "| Especialidad: " + this.especialidad +
            "| Nro.Consul: "   + this.numeroDeConsultorio
        );
    }


}
