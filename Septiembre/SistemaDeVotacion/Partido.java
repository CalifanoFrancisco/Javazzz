import java.util.ArrayList;

public class Partido {

      private String nombre;
      private String direccion;
      private int afiliados;
      private ArrayList<Enviador> enviadores;

      public Partido() {
            this.nombre = "frenteParaLaDerrota";
            this.direccion = "Gerli";
            this.afiliados = 0;
            this.enviadores = new ArrayList<>();
      }

      public Partido(String nombre,String direccion,int afiliados,ArrayList<Enviador> enviadores) {
            this.nombre = nombre;
            this.direccion = direccion;
            this.afiliados = afiliados;
            this.enviadores = enviadores;
      }

      public void setNombre(String i){ this.nombre = i; }
      public void setDireccion(String i){ this.direccion = i; }
      public void setAfiliados(int i){ this.afiliados = i; }
      public void setEnviadores(ArrayList<Enviador> i){ this.enviadores = i; }

      public String getNombre(){ return this.nombre; }
      public String getDireccion(){ return this.direccion; }
      public int getAfiliados(){ return this.afiliados; }
      public ArrayList<Enviador> getEnviadores(){ return this.enviadores; }

}
