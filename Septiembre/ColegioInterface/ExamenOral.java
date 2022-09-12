public class ExamenOral extends Examen {

      private String nivelDeSatisfaccion;

      public ExamenOral() {
            super();
            this.nivelDeSatisfaccion = "suficiente";
      }

      public ExamenOral(String nivelDeSatisfaccion) {
            super();
            this.nivelDeSatisfaccion = nivelDeSatisfaccion;
      }

      public void setNivelDeSatisfaccion(String i){ this.nivelDeSatisfaccion = i; }

      public String getNivelDeSatisfaccion(){ return this.nivelDeSatisfaccion; }

}
