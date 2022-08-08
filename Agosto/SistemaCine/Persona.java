package SistemaCine;

public class Persona {

    private String nombre;
    private int    edad;

    public Persona(){
        this.nombre = "Ernesto";
        this.edad   = 10;
    }
    
    public Persona (String nombre, int edad){
        this.nombre = nombre;
        this.edad   = edad;
    }

    public String getName(){ return this.nombre; }
    public int    getEdad(){ return this.edad; }

    public void   setName(String i){    this.nombre = i;    }
    public void   setEdad(int    i){    this.edad   = i;    }
}
