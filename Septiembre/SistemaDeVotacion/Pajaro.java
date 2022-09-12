
public class Pajaro {

      private String tipo;
      private Color color;
      private boolean AprendioElMapaParaVolarSola;

      public Pajaro() {
            this.tipo = "pajaro";
            this.color = Color.AMARILLO;
            this.AprendioElMapaParaVolarSola = false;
      }

      public Pajaro(String tipo,Color color,boolean AprendioElMapaParaVolarSola) {
            this.tipo = tipo;
            this.color = color;
            this.AprendioElMapaParaVolarSola = AprendioElMapaParaVolarSola;
      }

      public void setTipo(String i){ this.tipo = i; }
      public void setS(Color i){ this.color = i; }
      public void setprendioElMapaParaVolarSola(boolean i){ this.AprendioElMapaParaVolarSola = i; }

      public String getTipo(){ return this.tipo; }
      public Color getColor(){ return this.color; }
      public boolean getprendioElMapaParaVolarSola(){ return this.AprendioElMapaParaVolarSola; }

}
