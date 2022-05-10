
//import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
//import java.util.ArrayList;
import java.util.ArrayList;

public class Viaje{
  private float precio;
  private LocalTime hora;
  private LocalDate fecha;


  public Viaje(){
    this.precio = 0;
    this.hora   = LocalTime.now();
    this.fecha  = LocalDate.now();
  }

  public Viaje(float precio){
    this.precio = precio;
    this.hora   = LocalTime.now();
    this.fecha  = LocalDate.now();
  }

  public float     getprecio(){ return this.precio; }
  public LocalDate getfecha() { return this.fecha;  }
  public LocalTime gethora()  { return this.hora;   }


  public void setPrecio(float precio)   { this.precio = precio; }
  public void setFecha (LocalDate fecha){ this.fecha = fecha;   }
  public void setHora  (LocalTime hora) { this.hora = hora;     }

  public String to_string(){
    String aux;
    aux="Hora: "+this.hora+" | Fecha: "+this.fecha+" | Precio: "+this.precio;
    return aux;
  }

  }

