package src;

//import java.util.Scanner;
//import java.util.ArrayList;

public class Alumno extends Persona{
  private int    curso;
  private int    numero_legajo;
  private String orientacion;


  public Alumno(){
    super();
    this.curso = 0;
    this.numero_legajo = 0;
    this.orientacion = "Mati";
  }

  public Alumno(String nombre, int edad, int dni, int telefono, String direccion,int curso,String orientacion){
    super(nombre,edad,dni,telefono,direccion);
    this.curso = curso;
    this.numero_legajo = 0;
    this.orientacion = orientacion;
  }

  public int getcurso()         { return this.curso;          }
  public int getnumero_legajo() { return this.numero_legajo;  }
  public String getorientacion(){ return this.orientacion;    }


  public void setcurso        (int curso)         { this.curso = curso;                  }
  public void setnumero_legajo(int numero_legajo) { this.numero_legajo = numero_legajo;  }
  public void setorientacion  (String orientacion){ this.orientacion = orientacion;      }

  }

