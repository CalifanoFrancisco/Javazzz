package Interfaces;

public class Libro extends Leible implements Prestable{

      private int paginasPorCapitulo;

      public Libro() {
            super();
            this.paginasPorCapitulo = 100;
      }

      public Libro(int paginasPorCapitulo) {
            super();
            this.paginasPorCapitulo = paginasPorCapitulo;
      }

      public void setPaginasPorCapitulo(int i){ this.paginasPorCapitulo = i; }

      public int getPaginasPorCapitulo(){ return this.paginasPorCapitulo; }
      
      @Override
      public void prestar(){
            if (this.paginasPorCapitulo % 2 == 0){
                  System.out.println("El objeto se dará prestado");
            }else{
                  System.out.println("El objeto no sera prestado");
            }
      }
      @Override
      public void agregarElemento () {

      }
}
