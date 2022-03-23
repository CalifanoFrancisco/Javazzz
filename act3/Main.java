package src;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
	  
		ArrayList<Producto> productos = new ArrayList<>();

		Producto p1 = new Producto("Choclo"      ,200);
		Producto p2 = new Producto("Arvejas"     ,300);
		Producto p3 = new Producto("Champiniones",400);
		Producto p4 = new Producto("Pollo"       ,500);
		productos.add(p1);
		productos.add(p2);
		productos.add(p3);
		productos.add(p4);


		boolean menu1=true;
		boolean menu2=true;
		while(menu1){
			System.out.println("1. Insertar producto. ");
			System.out.println("2. Iniciar registro. ");
			System.out.println("3. Salir. ");
			Scanner eleccionInput = new Scanner(System.in);
			int eleccion = eleccionInput.nextInt();

			switch(eleccion){
				case 1:

					int tamanio = productos.size();
					Producto paux=new Producto();

					System.out.println(tamanio+ "  Insertar nombre: ");
					Scanner inputName = new Scanner(System.in);
					String name = inputName.nextLine();
					paux.setNombre(name);

					System.out.println("Insertar precio: ");
					Scanner inputPrecio = new Scanner(System.in);
					float   precio = inputPrecio.nextFloat();
					paux.setPrecio(precio);

					productos.add(paux);
					//productos.set(tamanio,paux);

				break;
				case 2:
					menu2=true;
					float total=0;

					while(menu2){
						System.out.println("Productos: ");

						for(int i=0;i<productos.size();i++){
							System.out.println(
								i + ". " +
								productos.get(i).getNombre()
								+ " " +
								productos.get(i).getPrecio()
								+ "."
							);
						}
						
						int endRegistroNum = productos.size();
						System.out.println(endRegistroNum + ". Terminar registro ");
						System.out.println("Total: " + total);

						Scanner productInput  = new Scanner(System.in);
						int     productChosen = productInput.nextInt();

						for(int i=0;i<productos.size();i++){
							if(productChosen==i){
								total+=productos.get(i).getPrecio();
							}
						}
						if(productChosen==endRegistroNum){
							menu2=false;
						}

					}
					System.out.println("Total: " + total);
				break;
				case 3:
					menu1=false;
				break;
				default:
					System.out.println("Valor invalido :(. ");
				break;

			}


		}




		
	}
	
}