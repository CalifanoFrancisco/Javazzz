
import java.util.Scanner;
import java.util.ArrayList;

public class Persona {
  private String nombre;
  private int dni;


  public Persona(){
    this.nombre = "mati";
    this.dni = 2;
  }

  public Persona(String nombre,int telefono){
    this.nombre = nombre;
    this.dni = telefono;
  }
  public String getnombre(){ return this.nombre;}
  public int getDNI(){ return this.dni;}


  public void setnombre(String nombre){ this.nombre = nombre; }
  public void setDNI(int telefono){ this.dni = telefono; }

  }

