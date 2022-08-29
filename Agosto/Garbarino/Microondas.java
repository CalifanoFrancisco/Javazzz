package Garbarino;
public class Microondas extends Electrodomestico {

      private Integer potencia;
      private Integer tamanio;

      public Microondas() {
            super();
            this.potencia = 100;
            this.tamanio = 10;
      }

      public Microondas(Integer potencia,Integer tamanio) {
            super();
            this.potencia = potencia;
            this.tamanio = tamanio;
      }

      public void setPotencia(Integer i){ this.potencia = i; }
      public void setTamanio(Integer i){ this.tamanio = i; }

      public Integer getPotencia(){ return this.potencia; }
      public Integer getTamanio(){ return this.tamanio; }

      public float precioFinal(){
            float out = this._precioFinal();
            if(this.potencia > 100){ out += 1000; }
            if(this.tamanio > 5){    out += 500;  }
            return out;
      }
}
