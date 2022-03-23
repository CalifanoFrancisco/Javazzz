public class Main {
	public static void main(String[] args) {
	    
		System.out.println("funka uwu");
		//---------------------------------------------------------------------------
		Persona p1 = new Persona();
		//---------------------------------------------------------------------------
		Persona p2 = new Persona("MeneM","La_Rioja",87654321,420,1512345678);
		//---------------------------------------------------------------------------
		Persona p3 = new Persona();
		p3.setNombre("eshteban");
		p3.setEdad(25);
		p3.setDireccion("puelledon");
		p3.setDni(99998888);
		p3.setTelefono(91104201);
		//---------------------------------------------------------------------------
		int edadp1=p1.getEdad()*2;
		p1.setEdad(edadp1);
		//---------------------------------------------------------------------------
		p2.setTelefono(55554444);
		//---------------------------------------------------------------------------
		System.out.println(p3.getNombre());
		System.out.println(p3.getDni());
		System.out.println(p3.getTelefono());
		System.out.println(p3.getEdad());
		System.out.println(p3.getDireccion());
		//---------------------------------------------------------------------------
		boolean mayorDeEdad=p1.esMayorDeEdad(p1.getEdad());
		boolean igualNombre=p2.sonLaMismaPersona(p1.getNombre(), p2.getNombre());
		boolean igualEdad  =p3.tienenLaMismaEdad(p2.getEdad(), p3.getEdad());

	}
	
}

/*

1. Crear la clase Persona con los siguientes atributos:
nombre
edad
dni
telefono

Declarar e implementar 3 tipos de constructores:
Uno por defecto.
Uno con parámetro string.
Otro con los 5 parámetros correspondientes a todos los atributos.
Declarar e implementar los getters y setters.

Agregar métodos con los siguientes nombres:
esMayorDeEdad
sonLaMismaPersona
tienenLaMismaEdad

Dentro de la función main, crear 3 instancias distintasde la clase Persona. 
A la primer instancia, cambiarle el valor de la edad por el doble de la misma.
A la segunda instancia, cambiarle el valor del teléfono.
Con respecto a la terce instancia, imprimir por consola todos sus datos.


*/