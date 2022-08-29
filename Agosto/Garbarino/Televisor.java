package Garbarino;
public class Televisor extends Electrodomestico {

      private float resolucion;
      private boolean smart;

      public Televisor() {
            super();
            this.resolucion = 10;
            this.smart = false;
      }

      public Televisor(float resolucion,boolean smart) {
            super();
            this.resolucion = resolucion;
            this.smart = smart;
      }

      public void setResolucion(float i){ this.resolucion = i; }
      public void setSmart(boolean i){ this.smart = i; }

      public float getResolucion(){ return this.resolucion; }
      public boolean getSmart(){ return this.smart; }

      public float precioFinal(){
            float out = this._precioFinal();
            if(resolucion>55){ out += (25*this._precioFinal())/100;     }
            if(smart){         out += 12340;                            }
            return out;
      }

}
