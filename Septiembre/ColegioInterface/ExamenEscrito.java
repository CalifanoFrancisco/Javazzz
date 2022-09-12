public class ExamenEscrito extends Examen {

      private int nota;
      private int duracionEnMinutos;

      public ExamenEscrito() {
            super();
            this.nota = 0;
            this.duracionEnMinutos = 120;
      }

      public ExamenEscrito(int nota,int duracionEnMinutos) {
            super();
            this.nota = nota;
            this.duracionEnMinutos = duracionEnMinutos;
      }

      public void setNota(int i){ this.nota = i; }
      public void setDuracionEnMinutos(int i){ this.duracionEnMinutos = i; }

      public int getNota(){ return this.nota; }
      public int getDuracionEnMinutos(){ return this.duracionEnMinutos; }

}
