import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import javax.print.FlavorException;

import java.time.LocalTime;


public class SistemaDeEmpleados {
    private ArrayList<Empleado> empleados;

    public SistemaDeEmpleados(){
        empleados = new ArrayList<>();
    }

    /*el porcentaje de asistencia de un empleado en un determinado mes.
    la cantidad de empleados actuales
    el nombre, apellido y teléfono del empleado con una asistencia del 100%
    el listado de nombres, apellidos y teléfonos de aquellos empleados que tienen una asistencia menor al 50%
    el listado de nombres, apellidos y teléfonos de aquellos empleados que llegan al menos 5 minutos tarde.
    la cantidad de empleados que deben trabajar por día
    la información el ítem anterior con forma de tabla*/

    public Integer asistenciaEmpleadoxMesEspecificado(Empleado empleado,int mes){
        Integer ingresos        = empleado.getIngresos().size();
        Integer ingresosTotales = empleado.getDiasLaborales().size()*4;
        return (ingresos*100)/ingresosTotales;
    }

    public Integer cantidadEmpleadosActuales(){
        return empleados.size();
    }

    public void nombreApellidoTelefonoDeEmpleadoConAsistencia100(Empleado empleado){
        if(empleado.asistenciaPerfecta()){
           empleado.sayData();
        }
    }

    public void nombreApellidoTelefonoDeEmpleadoConAsistenciaMenorA50(){
        for(int i=0;i<empleados.size();i++){
            int PorcentajeAsistencia = (empleados.get(i).getIngresos().size()*100)/empleados.get(i).getDiasLaborales().size()*4;
            if(PorcentajeAsistencia<50){
                empleados.get(i).sayData();
            }
        }
    }

    public void nombreApellidoTelefonoDeEmpleadoConLlegadaTarde5min(){
        for (int i = 0; i < empleados.size(); i++) {
            HashMap<String,LocalTime> ingresos = empleados.get(i).getIngresos();

            LocalTime horaIngreso = empleados.get(i).getHoraIngreso();
            for (String j : ingresos.keySet()) {
                int time = ingresos.values().getHour()*60 + ingresos.values().getMinute();
                int time2 = horaIngreso.getHour()*60+horaIngreso.getMinute();
                int timeT=time2-time;
                if(timeT>=5){
                    empleados.get(i).sayData();
                }
            }
        }
    }

    public Integer cantidadDeEmpleadosQueDebenTrabajarPorDia(String dia){
        int cantidad=0;
        System.out.println("Dia: "+dia);
        for (int i = 0; i < empleados.size(); i++) {
            if(dia ==  empleados.get(i).getIngresos().keySet().toString()){
                //empleados.get(i).sayData();
                cantidad++;
            }
        }
        return cantidad;
    }

    public Integer elMetodoAnteriorEnFormaDeTabla(String dia){
        int cantidad=0;
        System.out.println("Dia: "+dia);
        for (int i = 0; i < empleados.size(); i++) {
            if(dia ==  empleados.get(i).getIngresos().keySet().toString()){
                empleados.get(i).sayData();
                cantidad++;
            }
        }
        return cantidad;
    }
}
