package Interfaces;

public class Pantalon extends Ropa {

      private int medidaCintura;
      private int medidaCadera;
      private int largo;

      public Pantalon() {
            super();
            this.medidaCintura = 10;
            this.medidaCadera = 10;
            this.largo = 12;
      }

      public Pantalon(int medidaCintura,int medidaCadera,int largo) {
            super();
            this.medidaCintura = medidaCintura;
            this.medidaCadera = medidaCadera;
            this.largo = largo;
      }

      public void setMedidaCintura(int i){ this.medidaCintura = i; }
      public void setMedidaCadera(int i){ this.medidaCadera = i; }
      public void setLargo(int i){ this.largo = i; }

      public int getMedidaCintura(){ return this.medidaCintura; }
      public int getMedidaCadera(){ return this.medidaCadera; }
      public int getLargo(){ return this.largo; }

}
