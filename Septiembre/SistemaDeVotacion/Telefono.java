public class Telefono extends Dispositivo implements Enviador{

      private String companiaTelefonica;
      private double numeroCelular;
      private boolean prendido;
      private float creditoDisponible;

      public Telefono() {
            super();
            this.companiaTelefonica = "movistar";
            this.numeroCelular = 0;
            this.prendido = false;
            this.creditoDisponible = 100.f;
      }

      public Telefono(String companiaTelefonica,double numeroCelular) {
            super();
            this.companiaTelefonica = companiaTelefonica;
            this.numeroCelular = numeroCelular;
      }

      public void setCompaniaTelefonica(String i){ this.companiaTelefonica = i; }
      public void setNumeroCelular(double i){ this.numeroCelular = i; }

      public String getCompaniaTelefonica(){ return this.companiaTelefonica; }
      public double getNumeroCelular(){ return this.numeroCelular; }

      public void hacerCampania(String msg){
            if(this.prendido == true && this.creditoDisponible>0){
                  System.out.println("Conectando con la antena más cercana: " + msg);
            }
      }

}
