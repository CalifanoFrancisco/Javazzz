import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    
		//-----------------------------------------------------------------------------------------
		/*
		1) Crear una aplicación que pida al usuario ingresar los datos necesarios para crear un 
		objeto de la clase Persona. 
		*/
		Persona p1 = new Persona();

		System.out.println("Isertar nombre: ");
		Scanner inputName = new Scanner(System.in);
		String name      = inputName.nextLine();
		p1.setNombre(name);

		System.out.println("Isertar edad: ");
		Scanner inputEdad = new Scanner(System.in);
		int    edad      = inputEdad.nextInt();
		p1.setEdad(edad);

		System.out.println("Isertar direccion: ");
		Scanner inputDireccion = new Scanner(System.in);
		String direccion = inputDireccion.nextLine();
		p1.setDireccion(direccion);

		System.out.println("Isertar dni: ");
		Scanner inputDni = new Scanner(System.in);
		int    dni       = inputDni.nextInt();
		p1.setDni(dni);


		System.out.println("Isertar telefono: ");
		Scanner inputTelefono = new Scanner(System.in);
		int    telefono  = inputTelefono.nextInt();
		p1.setTelefono(telefono);

		//-----------------------------------------------------------------------------------------
		/* 
		2) Crear la instancia de la clase Persona e imprimir cuáles fueron los datos ingresados 
		utilizando "getters".
		*/
		p1.sayData(p1.getNombre(),p1.getDireccion(),p1.getEdad(),p1.getTelefono(),p1.getDni());
		
		//---------------------------------------------------------------------------
		/*
		3) Ofrecerle al usuario la opción de cambiar uno de sus datos (el usuario deberá elegir), 
		realizar el cambio utilizando "setters" e imprimir nuevamente los datos del objeto creado.
		 */
		boolean sno=true;
		while(sno){
			System.out.println("1. Modificar nombre.    ");
			System.out.println("2. Modificar edad.      ");
			System.out.println("3. Modificar dni.       ");
			System.out.println("4. Modificar telefono.  ");
			System.out.println("5. Modificar direccion. ");
			Scanner eleccionInput = new Scanner(System.in);
			int eleccion = eleccionInput.nextInt();

			switch(eleccion){
				case 1:
					System.out.println("Isertar nombre nuevo: ");
					Scanner inputName2 = new Scanner(System.in);
					String  Name2      = inputName2.nextLine();
					sno=false;
					p1.setNombre(Name2);
				break;
				case 2:
					System.out.println("Isertar edad nueva: ");
					Scanner inputEdad2 = new Scanner(System.in);
					int     Edad2      = inputEdad2.nextInt();
					sno=false;
					p1.setEdad(Edad2);
				break;
				case 3:
					System.out.println("Isertar dni nuevo: ");
					Scanner inputDni2 = new Scanner(System.in);
					int     Dni2      = inputDni2.nextInt();
					sno=false;
					p1.setDni(Dni2);
				break;
				case 4:
					System.out.println("Isertar telefono nuevo: ");
					Scanner inputTelefono2 = new Scanner(System.in);
					int     telefono2      = inputTelefono2.nextInt();
					sno=false;
					p1.setTelefono(telefono2);
				break;
				case 5:
					System.out.println("Isertar direccion nueva: ");
					Scanner inputDireccion2 = new Scanner(System.in);
					String  Direccion2      = inputDireccion2.nextLine();
					sno=false;
					p1.setDireccion(Direccion2);

				break;
				default:	
					System.out.println("Numero invalido, mal ahi. ");
					sno=true;	
				break;
			}
		}
		p1.sayData(p1.getNombre(),p1.getDireccion(),p1.getEdad(),p1.getTelefono(),p1.getDni());
		


		//---------------------------------------------------------------------------
		
	}
	
}