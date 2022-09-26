import java.time.LocalDate;

public class EmpleadoPlanilla extends Empleado implements Registro {
    private float salarioMensual;
    private int porcentajeAdicionalXhora;

    public EmpleadoPlanilla(String nombre, String apellido, String direccion, String ciudadProcedencia, int edad, int dni, LocalDate fechaNacimiento, int codigo, int horasExtras, LocalDate fechaDeIngreso, String area, String cargo, float salarioMensual, int porcentajeAdicionalXhora) {
        super(nombre, apellido, direccion, ciudadProcedencia, edad, dni, fechaNacimiento, codigo, horasExtras, fechaDeIngreso, area, cargo);
        this.salarioMensual = salarioMensual;
        this.porcentajeAdicionalXhora = porcentajeAdicionalXhora;
    }

    public EmpleadoPlanilla() {
        super();
        this.salarioMensual = 54;
        this.porcentajeAdicionalXhora = 4;
    }

    @Override
    public void registrar() {
        super.registrar();
        System.out.println(
            "| Salario mensual: "               + this.salarioMensual +
            "| Porcentaje adicional por hora: " + this.porcentajeAdicionalXhora
        );
    }
}
