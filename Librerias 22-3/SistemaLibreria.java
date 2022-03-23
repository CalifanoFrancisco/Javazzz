package src;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;


public class SistemaLibreria {

    private ArrayList<Cliente> clientes     ;
    private ArrayList<Libro>   libros       ;
    private ArrayList<Integer> id           ;
    private ArrayList<Libro> librosVendidos ;
    private String nombre;

    public SistemaLibreria(){
        Cliente cliente1=new Cliente();
        clientes = new ArrayList<>();
        this.clientes.add(cliente1);

        Libro libro1=new Libro();
        libros = new ArrayList<>();
        this.libros.add(libro1);

        Integer id1=-1;
        id = new ArrayList<Integer>();
        this.id.add(id1);

        this.nombre="NULL";

        librosVendidos = new ArrayList<>();
    }

    public SistemaLibreria(String nombre,Libro libro,Cliente cliente){
        clientes = new ArrayList<>();
        this.clientes.add(cliente);

        libros = new ArrayList<>();
        this.libros  .add(libro);

        this.nombre = nombre;

        id = new ArrayList<Integer>();
        librosVendidos = new ArrayList<>();

    }

    public void setNombre (String nombre  ){   this.nombre=nombre;          }

    public void addLibro  (Libro libro    ){   this.libros  .add(libro);    }

    public void addCliente(Cliente cliente){   this.clientes.add(cliente);  }

    public void addLibroVendido(Libro libro){   this.libros.add(libro);     }
    
    public void removeLibro    (Libro aux){   
        this.libros.remove(aux.getId());
    }

    public void ventaLibro(Libro aux){
        this.libros.remove(aux.getId());
        this.librosVendidos.add(aux);
    }

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
        }
        for(int i=0;i<libros.size();i++){
            this.libros.get(i).setId(i);
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

    public void librosMasVendidos(ArrayList<String> nombreLibros){  //NO FUNKA :((

        ArrayList<Integer> valores = new ArrayList<Integer>();
        ArrayList<String> libroMasVendidoNombre  = new ArrayList<String>();

        for(int i=0;i<nombreLibros.size();i++){
            valores.add(0);
        }

        for(int i=0;i<clientes.size();i++){                     //Pasa por todos clientes
            for(int y=0;y<clientes.get(i).cantLibros();y++){    //Por todos sus libros
                for(int n=0;n<nombreLibros.size();n++){         //Por todos los nombres de libros
                    if( nombreLibros.get(n)==clientes.get(i).nombreLibro(y)){    
                        valores.set(n, +1);
                    }
                }

            }
        }

        for(int i=0;i<valores.size();i++){ 
            if(valores.get(i)>=100){
                System.out.println("Libros mas vendidos: " + libroMasVendidoNombre.get(i)+ " n° "+valores.get(i));
            }else{
                System.out.println("Libros no tan vendidos: " + libroMasVendidoNombre.get(i)+ " n° "+valores.get(i)); 
            }
        }
    }

    public void compradoresFrecuentesEdad(){
        for(int i=0;i<clientes.size();i++){
            int clib = this.clientes.get(i).cantLibros();
            if(clib>=10){
                System.out.println("ID: "+i+" Edad: " + this.clientes.get(i).getEdad());
            }
        }
    }

    public void librosMasCaros(){
        System.out.println("CantLibrosTotal: "+libros.size());
        for(int i=0;i<libros.size();i++){
            if(libros.get(i).getPrecio()>=5500){
                libros.get(i).sayData();
            }
        }
    }

    public void ordenarPorLetra(){
        //ArrayList <String> aux = new ArrayList<String>();
        System.out.println("INserte letra para buscar libros: ");
        Scanner inputUser = new Scanner(System.in);
        String letrax = inputUser.nextLine();

        char letra=letrax.charAt(0); 

        for(int i=0;i<libros.size();i++){
            //aux.add(libros.get(i).getNombre());
            String aux = libros.get(i).getNombre();
            char firstChar = aux.charAt(0);
            if(firstChar == letra){
                System.out.println(
                    "ID: "      + libros.get(i).getId()+
                    "| Nombre:" + libros.get(i).getNombre()+
                    "."
                );
            }
        }

    }

    public float precioFinal(Cliente c){
        String libreriasConDescuento[]={"ElAteneo","Interzona","Sur","Alianza"};
        int id = c.getId();
        float total =0;

        for(int x=0;x<clientes.get(id).librosComprados();x++){
            if( clientes.get(id).editorialLibro(x)==libreriasConDescuento[0] ||
                clientes.get(id).editorialLibro(x)==libreriasConDescuento[1] ||
                clientes.get(id).editorialLibro(x)==libreriasConDescuento[2] ||
                clientes.get(id).editorialLibro(x)==libreriasConDescuento[3]
            ){
                total+=clientes.get(id).precioLibrosComprados(x)/2;
            }
            total+=clientes.get(id).precioLibrosComprados(x);
        }
        System.out.println("total: "+total);
        return total;
    }

    public void descuentosNavidad(){
        for(int i=0;i<libros.size();i++){
            libros.get(i).descuentoNavidad();
        }
    }

    public void librosMasVendidos(){
        ArrayList <String> nombres = new ArrayList<String>();
        ArrayList <Integer> total = new ArrayList<Integer>();

        for(int i=0;i<libros.size();i++){
            System.out.println("id°"+i+" nombre: "+libros.get(i).getNombre());
            nombres.add(libros.get(i).getNombre());
            total.add(0);
        }
        
        for(int i=0;i<librosVendidos.size();i++){
            for(int e=0;e<nombres.size();e++){
                //System.out.println("es "+librosVendidos.get(i).getNombre()+" = "+nombres.get(e));
                if(librosVendidos.get(i).getNombre()==nombres.get(e)){
                    //System.out.print("Si");
                    total.set(e,+1);
                }else{
                    //System.out.print("no");

                }

            }
            //System.out.println("");
        }
        for(int i=0;i<total.size();i++){
            System.out.println("Nombre: "+nombres.get(i)+" total: "+total.get(i));
        }

    }
}
