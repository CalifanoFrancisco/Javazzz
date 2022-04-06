package src;

import java.util.Scanner;
//import java.lang.reflect.Array;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalDateTime;
//import java.time.LocalTime;

public class SistemaAlmuerzos {

  private ArrayList<Alumno> alumnos;
  private ArrayList<Plato> platos;
  private ArrayList<Pedido> pedidos;
  private LocalDateTime ahora;

  public SistemaAlmuerzos(){
    alumnos = new ArrayList<>();
    platos  = new ArrayList<>();
    pedidos = new ArrayList<>();

    this.ahora = LocalDateTime.now();
  }

  public SistemaAlmuerzos(Alumno alumno,Plato plato,Pedido pedido){
    alumnos = new ArrayList<>();
    platos = new ArrayList<>();
    pedidos = new ArrayList<>();

    alumnos.add(alumno);
    platos .add(plato);
    pedidos.add(pedido);

    this.ahora = LocalDateTime.now();  
  }

  public void actualizarTiempo(){ this.ahora   = LocalDateTime.now();  }

  public void addPlato (Plato plato)  { platos.add(plato);    }
  public void addPedido(Pedido pedido){ pedidos.add(pedido);  }
  public void addAlumno(Alumno alumno){ alumnos.add(alumno);  }

  public void newPlato(String nombre,Float precio){
    Plato plato = new Plato(nombre,precio);
    platos.add(plato);
  }

  public void newAlumno(String nombre, int edad, int dni, int telefono, String direccion,int curso,String orientacion){
    Alumno alumno = new Alumno(nombre,edad,dni,telefono,direccion,curso,orientacion);
    alumnos.add(alumno);
  }

  public void setAllAlumnos(ArrayList<Alumno> alumnos_){  this.alumnos=alumnos_;  }
  public void setAllPlatos (ArrayList<Plato> platos_)  {  this.platos=platos_;    }

  public void setNumeroLegajoAlumnos(){
    for (int i = 0; i < alumnos.size(); i++) {
      alumnos.get(i).setnumero_legajo(i);
    }
  }

  public void setNumeroLegajoPedido(){
    for (int i = 0; i < pedidos.size(); i++) {
      pedidos.get(i).setId(i);
    }
  }

  public void sayAllAlumnos(){
    for (int i = 0; i < alumnos.size(); i++) {
      System.out.println(
        alumnos.get(i).getnombre() + " " +
        alumnos.get(i).getnumero_legajo()
      );
    }
  }

  public void sayAllPedidos(){
    for (int i = 0; i < pedidos.size(); i++) {
      System.out.println(
        pedidos.get(i).getnombre_plato() +
        "| fecha creacion: " + pedidos.get(i).getfecha_creacion() + 
        "| hora entrega: "   + pedidos.get(i).gethora_entrega()
      );
    }
  }

  public void sayAllPlatos(){
    for (int i = 0; i < platos.size(); i++) {
      System.out.println(
        platos.get(i).getnombre() + " " +
        platos.get(i).getprecio() +" $"
      );
    }
  }

  public void deleteAlumno(int nlegajo){
    for (int i = 0; i < alumnos.size(); i++) {
      if(alumnos.get(i).getnumero_legajo()==nlegajo){
        alumnos.remove(i);
        System.out.println("Eliminado exitosamente :D");
      }
    }
  }
  
  public void deletePlato(String nombre_plato){
    for (int i = 0; i < platos.size(); i++) {
      if(platos.get(i).getnombre()==nombre_plato){
        platos.remove(i);
        System.out.println("Eliminado exitosamente :D");
      }
    }
  }

  public void deletePedido(int id_pedido){
    for (int i = 0; i < pedidos.size(); i++) {
      if(pedidos.get(i).getId()==id_pedido){
        pedidos.remove(i);
        System.out.println("Eliminado exitosamente :D");
      }
    }
  }

  public int alumnosTotal(){
    return alumnos.size();
  }

  public void changeAlumnoName(int id,String nombre){ this.alumnos.get(id).setnombre(nombre); }
  public void changeAlumnoEdad(int id,int edad)     { this.alumnos.get(id).setedad(edad);     }
  //public void changeAlumnoEdad

  public void changeAlumnoData(int id){
    boolean repeAumno=true;
		while(repeAumno){
    //--------------------------------------------------
			System.out.println("-- 1. Nombre");
			System.out.println("-- 2. Edad");
			System.out.println("-- 3. Dni");
			System.out.println("-- 4. Telefono");
			System.out.println("-- 5. Direccion");
			System.out.println("-- 6. Curso");
			System.out.println("-- 7. Orientacion");
			System.out.println("-- 8. Atras");
    //--------------------------------------------------
			Scanner datoacambiar_ = new Scanner(System.in);
			int datoacambiar = datoacambiar_.nextInt();
    //--------------------------------------------------
    repeAumno=false;
			switch(datoacambiar){
        //--------------------------------------------------
				case 1: 
					System.out.println("Inserte nombre nuevo: ");
					Scanner nombre2_ = new Scanner(System.in);
					String nombre2 = nombre2_.nextLine();
          alumnos.get(id).setnombre(nombre2);
				break;
        //--------------------------------------------------
				case 2: 
          System.out.println("Inserte edad nuevo: ");
          Scanner edad_ = new Scanner(System.in);
          int edad = edad_.nextInt();
          alumnos.get(id).setedad(edad);
        break;
        //--------------------------------------------------
				case 3: 
          System.out.println("Inserte dni nuevo: ");
          Scanner dni_ = new Scanner(System.in);
          int dni = dni_.nextInt();
          alumnos.get(id).setdni(dni);
        break;
        //--------------------------------------------------
				case 4: 
          System.out.println("Inserte telefono nuevo: ");
          Scanner telefono_ = new Scanner(System.in);
          int telefono = telefono_.nextInt();
          alumnos.get(id).settelefono(telefono);
        break;
        //--------------------------------------------------
				case 5:
          System.out.println("Inserte direccion nuevo: ");
          Scanner direccion_ = new Scanner(System.in);
          String direccion = direccion_.nextLine();
          alumnos.get(id).setdireccion(direccion);
        break;
        //--------------------------------------------------
				case 6:
          System.out.println("Inserte curso nuevo: ");
          Scanner curso_ = new Scanner(System.in);
          int curso = curso_.nextInt();
          alumnos.get(id).setcurso(curso);
        break;
        //--------------------------------------------------
				case 7: 
          System.out.println("Inserte orientacion nuevo: ");
          Scanner orientacion_ = new Scanner(System.in);
          String orientacion = orientacion_.nextLine();
          alumnos.get(id).setorientacion(orientacion);
        break;
        //--------------------------------------------------
				case 8: repeAumno=false;	break;
        //--------------------------------------------------
				default: 
          System.out.println("Valor invalido"); 
          repeAumno=true; 
        break;
		  }

		}
  }

  public void changePlatoData(String nombre){
    boolean repePlato=true;
    while(repePlato){
    //--------------------------------------------------
      System.out.println("-- 1. Nombre");
		  System.out.println("-- 2. Precio");
    //--------------------------------------------------
      Scanner datoacambiar_ = new Scanner(System.in);
			int datoacambiar = datoacambiar_.nextInt();
    //--------------------------------------------------
      switch(datoacambiar){
      //--------------------------------------------------
        case 1: 
          System.err.println("insertar nuevo nombre:");
          Scanner nombre_ = new Scanner(System.in);
			    String nombre2 = nombre_.nextLine();
          for (int i = 0; i < platos.size(); i++) {
            if(platos.get(i).getnombre()==nombre){
              platos.get(i).setnombre(nombre2);
            }
          }
          repePlato=false;
        break;
      //--------------------------------------------------
        case 2: 
          Scanner precio_ = new Scanner(System.in);
          float precio = precio_.nextFloat();
          for (int i = 0; i < platos.size(); i++) {
            if(platos.get(i).getnombre()==nombre){
              platos.get(i).setprecio(precio);
            }
          }
          repePlato=false;
        break;
      //--------------------------------------------------
        default: System.out.println("valor invalido"); break;
      //--------------------------------------------------
      }
    //--------------------------------------------------
    }
    

  }

  public void changePedidoData(int id_pedido){
    boolean dolor2=true;
    while(dolor2){
    //--------------------------------------------------
      System.out.println("-- 1. Posponer entrega");
      //System.out.println("-- 2. Fecha creacion");
      System.out.println("-- 2. Nombre plato");
    //--------------------------------------------------
			Scanner datoacambiar_ = new Scanner(System.in);
			int datoacambiar = datoacambiar_.nextInt();
    //--------------------------------------------------
      switch(datoacambiar){
      //--------------------------------------------------
        case 1: 
          System.out.println("Cuantas horas?");
          Scanner hora_ = new Scanner(System.in);
			    int hora = hora_.nextInt();
          this.pedidos.get(id_pedido).sethora_entrega(
            this.pedidos.get(id_pedido).gethora_entrega().plusHours(hora)
          );
        break;
      //--------------------------------------------------
        case 2: 
          System.out.println("Insertar nuevo nombre: ");
          Scanner nombre_ = new Scanner(System.in);
          String nombre = nombre_.nextLine();
          this.pedidos.get(id_pedido).setnombre_plato(nombre);
        break;
      //--------------------------------------------------
      }
    //--------------------------------------------------
    }

  }

  public void sayMenuDelDia(LocalDate fecha,int descuentos){
    for (int i = 0; i < platos.size(); i++) {
      if(fecha==platos.get(i).getFecha()){
        System.out.println(
          platos.get(i).getnombre() + " " +
          platos.get(i).getprecio() + "$"
        );
      }
    }
  }

  
}

