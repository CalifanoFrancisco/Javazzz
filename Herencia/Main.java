package src;
//import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
	
	Madre madre = new Madre("Carla",78,1500001234,0,"gerli","empanadas Juan");
	Hijo  h1    = new Hijo("ElMati",20,1512345678,0,"gerli","cachuflaSchool","Minecraft");
	Hijo  h2    = new Hijo();
	madre.addHijo(h1);
	madre.addHijo(h2);

	madre.hijosMenoresDeEdad();

  }
}