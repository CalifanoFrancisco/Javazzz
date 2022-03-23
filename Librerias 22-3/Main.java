package src;
//import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
	
//-------------------------------------------------------------------------
	Libro   l0 = new Libro  ("Nahe",6000,"ElAteneo"	);
	Cliente c0 = new Cliente("mati",19,l0);

	SistemaLibreria libreria = new SistemaLibreria("LibreriasNashe",l0,c0);
//-------------------------------------------------------------------------
	Libro l1 = new Libro("Nahe",6000,"ElAteneo"		);
	Libro l2 = new Libro("pepe",2000,"Kapelusz"		);
	Libro l3 = new Libro("sech",3000,"Sudamericana"	);
	Libro l4 = new Libro("hecg",4000,"Atlántida"  	);
	Libro l5 = new Libro("pole",5000,"Interzona"  	);
	Libro l6 = new Libro("caño",2000,"Sur"			);
	Libro l7 = new Libro("cali",8808,"Alianza"		);
	libreria.addLibro(l2);	
	libreria.addLibro(l3);
	libreria.addLibro(l4);
	libreria.addLibro(l5);
	libreria.addLibro(l6);
	libreria.addLibro(l7);
//-------------------------------------------------------------------------
	for(int i=0;i<200;i++){
		libreria.addLibro(l1);
		libreria.ventaLibro(l1);
	}
//-------------------------------------------------------------------------
	Cliente c1 = new Cliente("mati",19,l1);
	Cliente c2 = new Cliente("sech",21,l3);
	libreria.addCliente(c1);
	libreria.addCliente(c2);
//-------------------------------------------------------------------------
	libreria.addClienteLibro(1, l2);
	libreria.addClienteLibro(0, l2);
//-------------------------------------------------------------------------
	libreria.idSetter();
	//libreria.sayDataClientes();
//-------------------------------------------------------------------------
	System.out.println("Setup listo :D");
//-------------------------------------------------------------------------
	/* 1 */ libreria.compradoresFrecuentes();
	/* 2 */ libreria.librosMasVendidos();
	/* 3 */ libreria.compradoresFrecuentesEdad();
	/* 4 */ libreria.librosMasCaros();	
	/* 5 */ libreria.ventaLibro(l2);
	/* 6 */ libreria.ordenarPorLetra();
	/* 7 */ libreria.precioFinal(c2);	// 
	/* 8 */	l1.setPriceWDiscount(1000, 25);
	/* 9 */ libreria.descuentosNavidad();
//-------------------------------------------------------------------------
	System.out.println("Programa terminad :(");



  }
}
