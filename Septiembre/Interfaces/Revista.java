package Interfaces;

import java.time.LocalDate;

public class Revista extends Leible implements Prestable {

      private LocalDate fechaPublicacion;

      public Revista() {
            super();
            this.fechaPublicacion = LocalDate.now();
      }

      public Revista(LocalDate fechaPublicacion) {
            super();
            this.fechaPublicacion = fechaPublicacion;
      }

      public void setFechaPublicacion(LocalDate i){ this.fechaPublicacion = i; }

      public LocalDate getFechaPublicacion(){ return this.fechaPublicacion; }

      @Override
      public void prestar(){
            this.fechaPublicacion.minusMonths(3);
            if(0 > LocalDate.now().compareTo(this.fechaPublicacion)){
                  System.out.println("El objeto sera prestado");
            }else{
                  System.out.println("El objeto no se prestará");
            }
      }
      @Override
      public void agregarElemento(){}
}
