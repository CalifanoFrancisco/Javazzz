import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Empleado extends Persona{
    private LocalDate fecha_nacimiento;
    private ArrayList<String> dias_laborales;
    private LocalTime hora_ingreso;
    private LocalTime hora_egreso;
    private HashMap<String,LocalTime> ingresos;

    public Empleado(){
        super();
        dias_laborales = new ArrayList<>();
        hora_ingreso   = LocalTime.now();
        hora_egreso    = LocalTime.now();
        ingresos       = new HashMap<String,LocalTime>();
    }

    public Empleado(String nombre,String apellido,int telefono){
        super(nombre,apellido,telefono);
        dias_laborales = new ArrayList<>();
        hora_ingreso   = LocalTime.now();
        hora_egreso    = LocalTime.now();
        ingresos       = new HashMap<String,LocalTime>();
    }

    public LocalDate        getFechaNacimiento(){  return this.fecha_nacimiento;    }
    public ArrayList<String>getDiasLaborales()  {  return this.dias_laborales;      }
    public LocalTime        getHoraIngreso()    {  return this.hora_ingreso;        }
    public LocalTime        getHoraEgreso()     {  return this.hora_egreso;         }
    public HashMap<String,LocalTime> getIngresos(){ return this.ingresos;           }

    public boolean asistenciaPerfecta(){
        if(this.ingresos.size()<=this.dias_laborales.size()*4){
            return true;
        }
        return false;
        
    }

    public void sayData(){
        System.out.println(
           this.getnombre()+" "+
           this.getapellido()+" "+
           this.gettelefono()
        );
    }
}
