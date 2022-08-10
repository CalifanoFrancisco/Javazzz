package SistemaCine;

public class Pelicula {

    private String   titulo;
    private int      duracion;
    private int      edadMinima;
    private Director director;

    public Pelicula(){
        this.titulo    = "Sharknado 16";
        this.duracion   = 120;
        this.edadMinima = 18;
        this.director   = new Director();
    }
    
    public int      getEdadMinima(){  return this.edadMinima;   }
    public int      getDuracion()  {  return this.duracion;     }
    public String   getTitulo()    {  return this.titulo;       }
    public Director getDirector()  {  return this.director;     }

}   
