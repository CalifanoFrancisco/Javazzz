
//import java.util.Scanner;
//import java.util.ArrayList;

public class Pasajero {
  private String nombre;
  private String apellido;
  private TarjetaEquis tarjeta;


  public Pasajero(){
    this.nombre = "mati";
    this.apellido = "30";
    this.tarjeta = new TarjetaEquis();
  }

  public Pasajero(String nombre,String apellido,TarjetaEquis tarjeta_){
    this.nombre = nombre;
    this.apellido = apellido;
    this.tarjeta = tarjeta_;
  }
  public String getnombre(){ return this.nombre;}
  public String getapellido(){ return this.apellido;}


  public void setnombre(String nombre){ this.nombre = nombre; }
  public void setapellido(String apellido){ this.apellido = apellido; }
  
  public TarjetaEquis getTarjeta(){ return this.tarjeta;  }

  }

