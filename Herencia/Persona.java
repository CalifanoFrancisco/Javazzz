package src;
import java.util.Scanner;
import java.util.ArrayList;

public class Persona {
  private String nombre;
  private int edad;
  private int telefono;
  private int id;
  private String direccion;


  public Persona(){
    this.nombre = "nashe";
    this.edad = 0;
    this.telefono = 1500000000;
    this.id = 0;
    this.direccion = "lanus";
  }

  public Persona(String nombre,int edad,int telefono,int id,String direccion){
    this.nombre = nombre;
    this.edad = edad;
    this.telefono = telefono;
    this.id = id;
    this.direccion = direccion;
  }
  
  public String getnombre(){ return this.nombre;}
  public int getedad(){ return this.edad;}
  public int gettelefono(){ return this.telefono;}
  public int getid(){ return this.id;}
  public String getdireccion(){ return this.direccion;}


  public void setnombre(String nombre){ this.nombre = nombre; }
  public void setedad(int edad){ this.edad = edad; }
  public void settelefono(int telefono){ this.telefono = telefono; }
  public void setid(int id){ this.id = id; }
  public void setdireccion(String direccion){ this.direccion = direccion; }

  }

