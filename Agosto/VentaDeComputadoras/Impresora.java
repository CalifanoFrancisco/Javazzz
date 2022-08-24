package Venta_de_computadoras;

public class Impresora extends OutputDevice {

    private String tipoImpresion;

    public Impresora() {
          super();
          this.tipoImpresion = "laser";
    }

    public Impresora(String tipoImpresion) {
          super();
          this.tipoImpresion = tipoImpresion;
    }

    public void setTipoImpresion(String i){ this.tipoImpresion = i; }

    public String getTipoImpresion(){ return this.tipoImpresion; }

}
