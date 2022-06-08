
import java.util.Scanner;
import java.util.ArrayList;

public class Cliente extends Persona{
  private int cbu;
  private float dinero;
  private int nivelSatisfaccion;
  private Usuario usuario;

  public Cliente(){
    super();
    this.cbu = 0;
    this.dinero=0;
    this.nivelSatisfaccion=0;
    this.usuario=new Usuario();
  }

  public Cliente(String nombre,int dni,int cbu,String userName,String clave){
    super(nombre,dni);
    //Persona(nombre,dni);
    this.cbu = cbu;
    this.dinero = 0;
    this.usuario =new Usuario(userName,clave);
  }
  public Cliente(String nombre,int dni,int cbu){
    super(nombre,dni);
  }

  public int getcbu(){ return this.cbu;}
  
  public void setcbu(int cbu){ this.cbu = cbu; }

  public Float getDinero(){ return this.dinero; }
  public void addDinero(Float i){ this.dinero+=i; }
  public void subDinero(Float i){ this.dinero-=i; }
  public Usuario getUsuario(){  return this.usuario;  }

  }

