package src;
import java.util.ArrayList;
import java.util.Scanner;

import javax.management.Descriptor;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
  public static void main(String[] args) {

	SistemaAlmuerzos  sussy  = new SistemaAlmuerzos();
	ArrayList<Plato>  platos = new ArrayList<>();
	ArrayList<Alumno> alumnos= new ArrayList<>();
	LocalDateTime     hoy    = LocalDateTime.now();

//--------------------------------------------------------------------------------------
	Plato p1 = new Plato ("tortilla" , 150);
	Plato p2 = new Plato ("salame"   ,2000);
	Plato p3 = new Plato ("anvorgesa", 800);
	platos.add(p1);
	platos.add(p2);
	platos.add(p3);
//--------------------------------------------------------------------------------------
	Alumno a0= new Alumno("sech",15,87654321,1500000002,"gerli",4,"historia");
	Alumno a1= new Alumno("Mati",18,12345678,1500000001,"lanus",7,"computacion");
	Alumno a2= new Alumno();
	alumnos.add(a0);
	alumnos.add(a1);
	alumnos.add(a2);
//--------------------------------------------------------------------------------------
	sussy.setAllPlatos (platos);
	sussy.setAllAlumnos(alumnos);
	sussy.setNumeroLegajoAlumnos();
//--------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------
	boolean sno=true;
	int eleccion=0;
	
	while(sno){
		System.out.println("Hoy es " + hoy + ".");
		System.out.println("1. Añadir entidad");
		System.out.println("2. Eliminar entidad");
		System.out.println("3. Modificar entidad");
		System.out.println("4. Decir datos entidades");
		System.out.println("5. Platos del dia");
		System.out.println("6. Salir");

		Scanner eleccionInput = new Scanner(System.in);
		eleccion = eleccionInput.nextInt();

		switch(eleccion){
			case 1: 
				boolean aux1=true;
				while(aux1){
					System.out.println("- 1. Alumno");
					System.out.println("- 2. Plato");
					System.out.println("- 3. Pedido");
					System.out.println("- 4. Atras");

					Scanner anadir_eleccion = new Scanner(System.in);
					int anadir = anadir_eleccion.nextInt();

					switch(anadir){
						case  1: 
						//--------------------------------------------------
							System.out.println("Insertar nombre: ");
							Scanner nombre_ = new Scanner(System.in);
							String nombre = nombre_.nextLine();
						//--------------------------------------------------
							System.out.println("Insertar edad: ");
							Scanner edad_ = new Scanner(System.in);
							int edad = edad_.nextInt();
						//--------------------------------------------------
							System.out.println("Insertar dni: ");
							Scanner dni_ = new Scanner(System.in);
							int dni = dni_.nextInt();
						//--------------------------------------------------
							System.out.println("Insertar telefono: ");
							Scanner telefono_ = new Scanner(System.in);
							int telefono = telefono_.nextInt();
						//--------------------------------------------------
							System.out.println("Insertar direccion: ");
							Scanner direccion_ = new Scanner(System.in);
							String direccion = direccion_.nextLine();
						//--------------------------------------------------
							System.out.println("Insertar curso: ");
							Scanner curso_ = new Scanner(System.in);
							int curso = curso_.nextInt();
						//--------------------------------------------------
							System.out.println("Insertar orientacion: ");
							Scanner orientacion_ = new Scanner(System.in);
							String orientacion = orientacion_.nextLine();
						//--------------------------------------------------
							Alumno aux = new Alumno(nombre,edad,dni,telefono,direccion,curso,orientacion);
							sussy.addAlumno(aux);
							sussy.setNumeroLegajoAlumnos();
						//--------------------------------------------------
						break;
						case  2: 
						//--------------------------------------------------
							System.out.println("Insertar nombre: ");
							Scanner nombre__ = new Scanner(System.in);
							String nombre1 = nombre__.nextLine();
						//--------------------------------------------------
							System.out.println("Insertar precio: ");
							Scanner precio_ = new Scanner(System.in);
							Float precio = precio_.nextFloat();
						//--------------------------------------------------
							Plato aux2 = new Plato(nombre1,precio);
							sussy.addPlato(aux2);
						//--------------------------------------------------
						break;
						case  3: 
						//--------------------------------------------------
							System.out.println("Insertar nombre: ");
							Scanner nombrepedido__ = new Scanner(System.in);
							String nombrepedido = nombrepedido__.nextLine();
						//--------------------------------------------------
							Pedido nashe = new Pedido(nombrepedido,false);
							sussy.addPedido(nashe);
							sussy.setNumeroLegajoPedido();
						//--------------------------------------------------
						break;
						case  4: 
							aux1=false;
						break;
						default: 
							System.out.println("- Valor invalido :( ");
						break;
					}
				}
			break;
		//---------------------------------------------------------------
			case 2: 
				boolean borrar=true;
				while(borrar){
					System.out.println("- 1. Alumno");
					System.out.println("- 2. Plato");
					System.out.println("- 3. Pedido");
					System.out.println("- 4. Atras");
					Scanner borrar_eleccion = new Scanner(System.in);
					int borar = borrar_eleccion.nextInt();
					switch(borar){
						case 1:
						//--------------------------------------------------
							System.out.println("Inserte numero de legajo a eliminar");
							Scanner nlegaj_ = new Scanner(System.in);
							int nlegaj = nlegaj_.nextInt();
							sussy.deleteAlumno(nlegaj);
						//--------------------------------------------------
						break;
						case 2: 
						//--------------------------------------------------
							System.out.println("Inserte nombre de plato a eliminar");
							Scanner nplat_ = new Scanner(System.in);
							String nplat = nplat_.nextLine();
							sussy.deletePlato(nplat);
						//--------------------------------------------------
						break;
						case 3: 
							System.out.println("Inserte id del pedido a eliminar");
							Scanner idpedido_ = new Scanner(System.in);
							int idpedido = idpedido_.nextInt();
							sussy.deletePedido(idpedido);
						break;
						case 4: borrar = false;	break;
						default: 
							System.out.println("valor invalido :(");	
						break;
					}
				}
			break;
		//---------------------------------------------------------------
			case 3: 
				boolean modifi=true;
				while(modifi){
					System.out.println("- 1. Alumno");
					System.out.println("- 2. Plato");
					System.out.println("- 3. Pedido");
					System.out.println("- 4. Atras");

					Scanner modificar_ = new Scanner(System.in);
					int modificar = modificar_.nextInt();
					switch(modificar){
					//--------------------------------------------------
						case 1: 
							boolean dolor=true;
							int nlegaj=0;
							while(dolor){
								System.out.println("Insertar Numero de legajo alumno: ");
								Scanner nlegaj_ = new Scanner(System.in);
								nlegaj = nlegaj_.nextInt();
								if(nlegaj>0 && nlegaj<=sussy.alumnosTotal()){
									dolor=false;
								}else{
									System.out.println("Valor invalido");
								}
							}
							sussy.changeAlumnoData(nlegaj);

						break;
					//--------------------------------------------------
						case 2: 
							System.out.println("Insertar nombre de plato a modificar");
							Scanner nombre_ = new Scanner(System.in);
							String nombre = nombre_.nextLine();
							sussy.changePlatoData(nombre);
						break;
					//--------------------------------------------------
						case 3: 
							System.out.println("Insertar id pedido a modificar");
							Scanner idpedido_ = new Scanner(System.in);
							int idpedido = idpedido_.nextInt();
							sussy.changePedidoData(idpedido);
							break;
					//--------------------------------------------------
						case 4: modifi=false; break;
					//--------------------------------------------------
						default: 
							System.out.println("Valor invalido");	
						break;
					}
				}
			break;
		//---------------------------------------------------------------
			case 4: 
			boolean saydata=true;
			while(saydata){
				System.out.println("- 1. Alumno");
				System.out.println("- 2. Plato");
				System.out.println("- 3. Pedido");
				System.out.println("- 4. Atras");
				Scanner say_eleccion = new Scanner(System.in);
				int say = say_eleccion.nextInt();
				switch(say){
					case 1: sussy.sayAllAlumnos();	break;
					case 2: sussy.sayAllPlatos();	break;
					case 3: sussy.sayAllPedidos();	break;
					case 4: saydata=false;			break;
					default:
						System.out.println("Valor invalido :(");	
					break;
				}
			}
			break;
		//---------------------------------------------------------------
			case 5: 
				int descuentos = 50;
				LocalDate fecha_hoy = LocalDate.now();
				sussy.sayMenuDelDia(fecha_hoy, descuentos);
			break;
		//---------------------------------------------------------------
			case 6: 
			sno=false;
			break;
		//---------------------------------------------------------------
			default: 
				System.out.println("Valor invalido, mal ahi :("); 
			break;
		}
	}



  }
}