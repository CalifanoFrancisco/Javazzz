package Garbarino;

public class Lavarropas extends Electrodomestico {

      private int cargaDeRopaQueSoporta;

      public Lavarropas() {
            super();
            this.cargaDeRopaQueSoporta = 5;
      }

      public Lavarropas(int cargaDeRopaQueSoporta) {
            super();
            if(cargaDeRopaQueSoporta > 5){
                  this.cargaDeRopaQueSoporta = cargaDeRopaQueSoporta;
            }else{
                  System.out.println("Se debe ingresar un valor mayor");
            }
      }

      public void setCargaDeRopaQueSoporta(int i){ this.cargaDeRopaQueSoporta = i; }

      public int getCargaDeRopaQueSoporta(){ return this.cargaDeRopaQueSoporta; }

      public float precioFinal(){
            float out = this._precioFinal();
            if(this.getPeso()>30){ return (out + 2300);}
            return out;
      }

}
