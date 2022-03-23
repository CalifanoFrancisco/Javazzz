package src;

public class Producto {

    private String nombre;
    private float  precio;

    public Producto(){
        this.nombre = "Nada";
        this.precio = 0;
    }

    public Producto(String nombre,float precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public void sayProductoData(){
        System.out.println("Nombre: " + this.nombre + " Precio: " + this.precio);        
    }

    public String getNombre(){
        return this.nombre;
    }
    public float getPrecio(){
        return this.precio;
    }

    public void setNombre(String name){
        this.nombre= name;
    }

    public void setPrecio(float ciopre){
        this.precio=ciopre;
    }
}