package Interfaces;

public class Leible implements ToString {

      private Integer codigo;
      private String titulo;
      private Integer anioDePublicacion;

      public Leible() {
            this.codigo = 0;
            this.titulo = "sexoLaNovela";
            this.anioDePublicacion = 1984;
      }

      public Leible(Integer codigo,String titulo,Integer anioDePublicacion) {
            this.codigo = codigo;
            this.titulo = titulo;
            this.anioDePublicacion = anioDePublicacion;
      }

      public void setCodigo(Integer i){ this.codigo = i; }
      public void setTitulo(String i){ this.titulo = i; }
      public void setAnioDePublicacion(Integer i){ this.anioDePublicacion = i; }

      public Integer getCodigo(){ return this.codigo; }
      public String getTitulo(){ return this.titulo; }
      public Integer getAnioDePublicacion(){ return this.anioDePublicacion; }

      @Override
      public String toString() {
          return codigo.toString() + " " + titulo + " " + anioDePublicacion.toString();
      }
}
