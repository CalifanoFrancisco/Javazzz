package src;
import java.util.ArrayList;

public class Cliente {

    private int id;
    private int edad;
    private String nombre;

    ArrayList<Libro> libros = new ArrayList<>();

    public Cliente(){
        this.id     = 0;
        this.edad   = 0;
        this.nombre = "NULL";
        Libro aux = new Libro();
        libros.add(aux);
    }

    public Cliente(/*int id,*/String nombre,int edad,Libro libro){ 
        //this.id=id;
        this.edad=edad;
        this.nombre=nombre;
        this.libros.add(libro);
    }

    public void addLibro(Libro lib){    libros.add(lib);    }

    public void setNombre(String nombre){   this.nombre=nombre; }
    public void setId    (int    ide   ){   this.id=ide;        }
    public void setEdad  (int    edad  ){   this.edad=edad;     }

    public int    getId    (){  return this.id;         }
    public String getNombre(){  return this.nombre;     }
    public int    getEdad  (){  return this.edad;       }
    public int   cantLibros(){  return libros.size();   }

    public void setLibroData(int id,String name,String editorial,float precio){
        this.libros.get(id).setNombre   (name);
        this.libros.get(id).setEditorial(editorial);
        this.libros.get(id).setPrice    (precio);
    }

    public void sayLibroData(int id){
        this.libros.get(id).sayData();
    }

    public void libroIdSetter(){
        for(int i=0;i<libros.size();i++){
            libros.get(i).setId(i);
        }
    }

    public int librosComprados(){
        return libros.size();
    }

    public void sayData(){
        System.out.println(
            "ID: "        + this.id + 
            "  Nombre: "  + this.nombre +
            "  Edad: "    + this.edad
        );
        System.out.println("");
    }

    public String nombreLibro(int id){
        return libros.get(id).getNombre();
    }

    public String editorialLibro(int id){
        return libros.get(id).getEditorial();
    }

    public float precioLibrosComprados(int id){
        return libros.get(id).getPrecio();
    }

}
