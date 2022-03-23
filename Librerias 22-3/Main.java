package src;
import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {

	Libro l1 = new Libro("Nahe",100,"ElAteneo"		);
	Libro l2 = new Libro("pepe",200,"Kapelusz"		);
	Libro l3 = new Libro("sech",300,"Sudamericana"	);
	Libro l4 = new Libro("hecg",400,"Atlántida"   	);
	Libro l5 = new Libro("pole",500,"Interzona"   	);
	Libro l6 = new Libro("caño",600,"Sur"			);
	Libro l7 = new Libro("cali",700,"Alianza"		);

	Cliente c1 = new Cliente("mati",19,l1);

	SistemaLibreria libreria = new SistemaLibreria("LibreriasNashe",l1,c1);
	
	libreria.addLibro(l2);
	libreria.addLibro(l3);
	libreria.addLibro(l4);
	libreria.addLibro(l5);
	libreria.addLibro(l6);
	libreria.addLibro(l7); 
	  
	libreria.addClienteLibro(0, l2);
	libreria.addClienteLibro(0, l3);
	libreria.addClienteLibro(0, l3);
	libreria.addClienteLibro(0, l3);
	libreria.addClienteLibro(0, l3);
	libreria.addClienteLibro(0, l3);
	libreria.addClienteLibro(0, l3);
	libreria.addClienteLibro(0, l3);
	libreria.addClienteLibro(0, l3);
	libreria.addClienteLibro(0, l3);
	libreria.addClienteLibro(0, l3);
	libreria.addClienteLibro(0, l3);
	libreria.addClienteLibro(0, l3);
	libreria.addClienteLibro(0, l3);
	libreria.addClienteLibro(0, l3);
	libreria.addClienteLibro(0, l3);
	libreria.addClienteLibro(0, l3);
	libreria.addClienteLibro(0, l3);
	libreria.addClienteLibro(0, l3);
	libreria.addClienteLibro(0, l3);
	libreria.addClienteLibro(0, l3);
	libreria.addClienteLibro(0, l3);


	libreria.idSetter();
	//libreria.sayDataClientes();
	libreria.compradoresFrecuentes();



  }
}
