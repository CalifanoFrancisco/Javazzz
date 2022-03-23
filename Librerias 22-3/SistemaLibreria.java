package src;
import java.util.ArrayList;


public class SistemaLibreria {

    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Libro>   libros   = new ArrayList<>();
    private ArrayList<Integer> id       = new ArrayList<Integer>();
    private String nombre;

    public SistemaLibreria(){
        Cliente cliente1=new Cliente();
        this.clientes.add(cliente1);

        Libro libro1=new Libro();
        this.libros.add(libro1);

        Integer id1=-1;
        this.id.add(id1);

        this.nombre="NULL";
    }

    public SistemaLibreria(String nombre,Libro libro,Cliente cliente){
        this.nombre = nombre;
        this.libros  .add(libro);
        this.clientes.add(cliente);
    }

    public void setNombre (String nombre  ){   this.nombre=nombre;          }

    public void addLibro  (Libro libro    ){   this.libros  .add(libro);    }

    public void addCliente(Cliente cliente){   this.clientes.add(cliente);  }

    public void addClienteLibro(int id,Libro lib){      
        this.clientes.get(id).addLibro(lib);
    }

    public void setClienteData(int id,String nombre,int edad, Libro libro){
        this.clientes.get(id).setNombre(nombre);
        this.clientes.get(id).setEdad  (edad);
        this.clientes.get(id).addLibro (libro);
    }

    public void setLibroData(int id,String nombre,String editorial,float precio){
        this.libros.get(id).setNombre(nombre);
        this.libros.get(id).setPrice(precio);
        this.libros.get(id).setEditorial(editorial);
    }

    public void idSetter(){
        for(int i=0;i<clientes.size();i++){
            this.clientes.get(i).setId(i);
            this.clientes.get(i).libroIdSetter();
        }
    }

    public void sayDataLibros(){
        for(int i=0;i<libros.size();i++){            
            System.out.println(
                "ID: "        + this.libros.get(i).getId() +
                "  Nombre: "  + this.libros.get(i).getNombre() +
                "  Editorial:"+ this.libros.get(i).getEditorial() +
                "  Precio: "  + this.libros.get(i).getPrecio()
            );
        }
    }

    public void sayDataClientes(){
        for(int i=0;i<clientes.size();i++){
            System.out.println(
                "ID: "        + this.clientes.get(i).getId() + 
                "  Nombre: "  + this.clientes.get(i).getNombre() +
                "  Edad: "    + this.clientes.get(i).getEdad()
            );

            System.out.println("Libros comprados: ");

            int clib = this.clientes.get(i).cantLibros();

            for(int e=0;e<clib;e++){
                this.clientes.get(i).sayLibroData(e);
            }
        }
    }

    public void compradoresFrecuentes(){
        for(int i=0;i<clientes.size();i++){
            int clib = this.clientes.get(i).cantLibros();
            if(clib>=10){
                this.clientes.get(i).sayData();
            }
        }
    }

    public int  compradoTotal(){
        for(int i=0;i<clientes.size();i++){
            
        }
    }
}
