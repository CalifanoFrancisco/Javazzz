import java.time.LocalDate;

public class Reserva {
    private LocalDate fecha;
    private Integer   bloque;
    private Persona   persona;

    public Reserva(){
        this.fecha   = LocalDate.now();
        this.bloque  = 0;
        this.persona = new Profesor();
    }
    public Reserva(Alumno alumno,LocalDate horario){
        this.fecha   = horario;
        this.bloque  = 0;
        this.persona = alumno;
    }
    public Reserva(Profesor profesor,LocalDate horario){
        this.fecha   = horario;
        this.bloque  = 0;
        this.persona = profesor;
    }
    public void setBloque(Integer bloque){   
        if(bloque>0&&bloque<=6){
            this.bloque = bloque;   
        }else{
            System.out.println("Valor de bloque invalido <"+bloque+">.");
        }
    }
    public int       getBloque (){  return this.bloque;     }
    public LocalDate getFecha  (){  return this.fecha;      }
    public Persona   getPersona(){  return this.persona;    }
}


