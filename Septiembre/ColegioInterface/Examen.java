import java.time.LocalDate;

public class Examen {

      private LocalDate fechaRealizacion;

      public Examen() {
            this.fechaRealizacion = LocalDate.now();
      }

      public Examen(LocalDate fechaRealizacion) {
            this.fechaRealizacion = fechaRealizacion;
      }

      public void setFechaRealizacion(LocalDate i){ this.fechaRealizacion = i; }

      public LocalDate getFechaRealizacion(){ return this.fechaRealizacion; }

}
