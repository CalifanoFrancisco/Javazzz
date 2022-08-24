package Venta_de_computadoras;

public class Persona {
    private String nombre,apellido;
    private double celular;
    public Persona(){
        this.nombre  = "";
        this.apellido = "";
        this.celular = 0;
    }
    public String getNombre(){  return this.nombre; }
    public String getApellido(){    return this.apellido;}
    public double getCelular(){ return this.celular;}
}
