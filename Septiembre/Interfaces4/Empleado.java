import java.time.LocalDate;

public class Empleado extends Persona{
    private int codigo;
    private int horasExtras;
    private LocalDate fechaDeIngreso;
    private String area, cargo;

    public Empleado(String nombre, String apellido, String direccion, String ciudadProcedencia, int edad, int dni, LocalDate fechaNacimiento, int codigo, int horasExtras, LocalDate fechaDeIngreso, String area, String cargo) {
        super(nombre, apellido, direccion, ciudadProcedencia, edad, dni, fechaNacimiento);
        this.codigo = codigo;
        this.horasExtras = horasExtras;
        this.fechaDeIngreso = fechaDeIngreso;
        this.area = area;
        this.cargo = cargo;
    }

    public Empleado() {
        super();
        this.codigo = 0;
        this.horasExtras = 0;
        this.fechaDeIngreso = LocalDate.now();
        this.area = "marketing";
        this.cargo = "";
    }
}
