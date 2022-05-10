
import java.util.Scanner;
import java.util.ArrayList;

public class Persona {
  private String nombre;
  private int dni;


  public Persona(){
    this.nombre = "sech";
    this.dni=0;
  }

  public Persona(String nombre,int dni){
    this.nombre = nombre;
    this.dni=dni;
  }

  public String getnombre(){ return this.nombre;}

  public void setnombre(String nombre){ this.nombre = nombre; }

  }

