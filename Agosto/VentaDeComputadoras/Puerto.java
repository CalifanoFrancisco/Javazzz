package Venta_de_computadoras;

public class Puerto {
    private String puerto;
    public Puerto(){
        this.puerto = "";
    }
    public Puerto(String i){
        this.puerto = i;
    }
    public void setPuerto(String i){    this.puerto=i;  }
    public String getPuerto(){  return this.puerto; }
}
