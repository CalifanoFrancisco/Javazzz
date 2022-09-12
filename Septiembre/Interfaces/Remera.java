package Interfaces;

public class Remera extends Ropa {

      private int medidaEspalda;
      private int contorno;
      private int largoTorso;

      public Remera() {
            super();
            this.medidaEspalda = 10;
            this.contorno = 14;
            this.largoTorso = 435;
      }

      public Remera(int medidaEspalda,int contorno,int largoTorso) {
            super();
            this.medidaEspalda = medidaEspalda;
            this.contorno = contorno;
            this.largoTorso = largoTorso;
      }

      public void setMedidaEspalda(int i){ this.medidaEspalda = i; }
      public void setContorno(int i){ this.contorno = i; }
      public void setLargoTorso(int i){ this.largoTorso = i; }

      public int getMedidaEspalda(){ return this.medidaEspalda; }
      public int getContorno(){ return this.contorno; }
      public int getLargoTorso(){ return this.largoTorso; }

   
}
