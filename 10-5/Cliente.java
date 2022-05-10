
import java.util.Scanner;
import java.util.ArrayList;

public class Cliente extends Persona{
  private int cbu;

  public Cliente(){
    super();
    this.cbu = 0;
  }

  public Cliente(String nombre,int dni,int cbu){
    super(nombre,dni);
    //Persona(nombre,dni);
    this.cbu = cbu;
  }

  public int getcbu(){ return this.cbu;}

  public void setcbu(int cbu){ this.cbu = cbu; }

  }

