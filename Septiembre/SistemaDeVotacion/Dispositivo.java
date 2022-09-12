public class Dispositivo {

      private double numeroDeSerie;
      private String fabricante;
      private String modelo;

      public Dispositivo() {
            this.numeroDeSerie = 0;
            this.fabricante = "huawei";
            this.modelo = "sexEdition";
      }

      public Dispositivo(double numeroDeSerie,String fabricante,String modelo) {
            this.numeroDeSerie = numeroDeSerie;
            this.fabricante = fabricante;
            this.modelo = modelo;
      }

      public void setNumeroDeSerie(double i){ this.numeroDeSerie = i; }
      public void setFabricante(String i){ this.fabricante = i; }
      public void setModelo(String i){ this.modelo = i; }

      public double getNumeroDeSerie(){ return this.numeroDeSerie; }
      public String getFabricante(){ return this.fabricante; }
      public String getModelo(){ return this.modelo; }

}
