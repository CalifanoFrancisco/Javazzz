import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;

public class Trabajador implements Enviador {

      private String nombre;
      private String apellido;
      private int dni;
      private LocalDate fechaNacimiento;
      private int cuil;
      private float sueldo;
      private String direccionResidencia;
      private HashSet<Integer> horarioLaboral;

      public Trabajador() {
            this.nombre = "dimitrio";
            this.apellido = "pumai";
            this.dni = 0;
            this.fechaNacimiento = LocalDate.now();
            this.cuil = 0;
            this.sueldo = 100;
            this.direccionResidencia = "Gerli";
      }

      public Trabajador(String nombre,String apellido,int dni,LocalDate fechaNacimiento,int cuil,float sueldo,String direccionResidencia) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.dni = dni;
            this.fechaNacimiento = fechaNacimiento;
            this.cuil = cuil;
            this.sueldo = sueldo;
            this.direccionResidencia = direccionResidencia;
      }

      public void setNombre(String i){ this.nombre = i; }
      public void setApellido(String i){ this.apellido = i; }
      public void setDni(int i){ this.dni = i; }
      public void setFechaNacimiento(LocalDate i){ this.fechaNacimiento = i; }
      public void setCuil(int i){ this.cuil = i; }
      public void setSueldo(float i){ this.sueldo = i; }
      public void setDireccionResidencia(String i){ this.direccionResidencia = i; }

      public String getNombre(){ return this.nombre; }
      public String getApellido(){ return this.apellido; }
      public int getDni(){ return this.dni; }
      public LocalDate getFechaNacimiento(){ return this.fechaNacimiento; }
      public int getCuil(){ return this.cuil; }
      public float getSueldo(){ return this.sueldo; }
      public String getDireccionResidencia(){ return this.direccionResidencia; }

      public void hacerCampania(String msg){
            boolean aux = false;
            for(Integer i:horarioLaboral){
                  if(LocalTime.now().getHour()==i){
                        aux = true;
                  }
            }
            if(aux == true){
                  System.out.println("Yo "+this.nombre+" te invito a "+msg);
            }
      }
}
