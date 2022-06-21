
public class Persona {
  private String nombre,apellido;
  private int dni,prioridad;


  public Persona(int prioridad){
    this.nombre = "mati";
    this.apellido = "ernesto";
    this.dni = 2;
    this.prioridad = prioridad; 
  }

  public Persona(String nombre,String apellido,int dni,int prioridad){
    this.nombre = nombre;
    this.apellido = apellido;
    this.dni = dni;
    //this.prioridad 
  }
  public String getnombre(){ return this.nombre;}
  public int getDNI(){ return this.dni;}
  public String getApellido(){return this.apellido; }
  public int getPrioridad(){  return this.prioridad;  }


  public void setnombre(String nombre){ this.nombre = nombre; }
  public void setDNI(int telefono){ this.dni = telefono; }

  }

