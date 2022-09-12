package ONG;

public class Institucion {
    private String nombre,direccion;
    public Institucion(){
        this.nombre = "Pizzeria los hijos de Puta";
        this.direccion = "Av.Donovan y Gral.Chamizo, en el corazon de Gerli";
    }
    public String getNombre(){ return this.nombre; }
    public void   setNombre(String x){ this.nombre = x; }
    public String getDireccion(){ return this.direccion; }
    public void setDireccion(String x){ this.direccion = x;}
}
