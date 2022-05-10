import java.util.ArrayList;

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

  public String to_string(){
    String aux;

    aux = "Nombre: "+this.nombre+" | Apellido: "+this.apellido;
    aux+= "Viajes realizados: ";
    aux+=this.tarjeta.toString();

    return aux;
  }

  public String to_String_altaCohesion(){
    String aux;
    //aux ="Hora: "+viaje.gethora()+" | Fecha: "+viaje.getfecha()+" | Precio: "+viaje.getprecio()+" | Precio: "+this.saldo;
    ArrayList<Viaje> viajes = tarjeta.getViajes();
    aux = "Nombre: "+this.nombre+" | Apellido: "+this.apellido;
    aux+= "Viajes realizados: ";
    for (int i = 0; i < viajes.size(); i++) {
      aux+= "  Hora:  " +viajes.get(i).gethora();
      aux+= "| Fecha: " +viajes.get(i).getfecha();
      aux+= "| Precio: "+viajes.get(i).getprecio();
      aux+=this.tarjeta.getsaldo();
    }

    return aux;
  }
  }

