
import java.util.Scanner;
import java.util.ArrayList;

public class Persona {
  private String nombre;
  private String apellido;
  private int telefono;


  public Persona(){
    this.nombre = "mati";
    this.apellido = "hernesto";
    this.telefono = 2;
  }

  public Persona(String nombre,String apellido,int telefono){
    this.nombre = nombre;
    this.apellido = apellido;
    this.telefono = telefono;
  }
  public String getnombre(){ return this.nombre;}
  public String getapellido(){ return this.apellido;}
  public int gettelefono(){ return this.telefono;}


  public void setnombre(String nombre){ this.nombre = nombre; }
  public void setapellido(String apellido){ this.apellido = apellido; }
  public void settelefono(int telefono){ this.telefono = telefono; }

  }

