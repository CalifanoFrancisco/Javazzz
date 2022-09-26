import java.time.LocalDate;

public class Persona implements Registro {
    private String nombre, apellido, direccion, ciudadProcedencia;
    private int edad, dni;
    private LocalDate fechaNacimiento;

    public Persona(String nombre, String apellido, String direccion, String ciudadProcedencia, int edad, int dni, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.ciudadProcedencia = ciudadProcedencia;
        this.edad = edad;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }
    public Persona() {
        this.nombre = "a";
        this.apellido = "a";
        this.direccion = "aa";
        this.ciudadProcedencia = "a";
        this.edad = 0;
        this.dni = 0;
        this.fechaNacimiento = LocalDate.now();
    }

    @Override
    public void registrar() {
        System.out.println(
            "| Nombre: "                + this.nombre            +
            "| Apellido: "              + this.apellido          +
            "| Direccion: "             + this.direccion         +
            "| Ciudad de procedencia: " + this.ciudadProcedencia +
            "| Edad: "                  + this.edad              +
            "| Dni: "                   + this.dni               +
            "| Fecha nacimiento: "      + this.fechaNacimiento
        );
    }
}
