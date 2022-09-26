import java.time.LocalDate;

public class EmpleadoEventual extends Empleado implements Registro {

    private int honorarioXhora;
    private int numeroHorasTotalesTrabajadas;
    private LocalDate fechaDeTerminoDelContrato;

    public EmpleadoEventual(String nombre, String apellido, String direccion, String ciudadProcedencia, int edad, int dni, LocalDate fechaNacimiento, int codigo, int horasExtras, LocalDate fechaDeIngreso, String area, String cargo, int honorarioXhora, int numeroHorasTotalesTrabajadas, LocalDate fechaDeTerminoDelContrato) {
        super(nombre, apellido, direccion, ciudadProcedencia, edad, dni, fechaNacimiento, codigo, horasExtras, fechaDeIngreso, area, cargo);
        this.honorarioXhora = honorarioXhora;
        this.numeroHorasTotalesTrabajadas = numeroHorasTotalesTrabajadas;
        this.fechaDeTerminoDelContrato = fechaDeTerminoDelContrato;
    }

    public EmpleadoEventual() {
        super();
        this.honorarioXhora = 100;
        this.numeroHorasTotalesTrabajadas = 10;
        this.fechaDeTerminoDelContrato = LocalDate.now();
    }

    @Override
    public void registrar() {
        super.registrar();
        System.out.println(
            "| Honorarios por hora: "           + this.honorarioXhora               +
            "| Horas totales trabajadas: "      + this.numeroHorasTotalesTrabajadas +
            "| Fecha de termino del contrato: " + this.fechaDeTerminoDelContrato
        );
    }
}
