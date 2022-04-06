package src;
import java.time.LocalDate;

public class Plato {
  private String nombre;
  private float precio;
  private LocalDate fecha;


  public Plato(){
    this.nombre = "choripan";
    this.precio = 200;
    fecha = LocalDate.now();
  }

  public Plato(String nombre,float precio){
    this.nombre = nombre;
    this.precio = precio;
    fecha = LocalDate.now();
  }
  
  public String getnombre(){ return this.nombre;}
  public float getprecio(){ return this.precio;}
  public LocalDate getFecha(){return this.fecha;}


  public void setnombre(String nombre){ this.nombre = nombre; }
  public void setprecio(float precio){ this.precio = precio; }

  }

