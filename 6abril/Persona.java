package src;

public class Persona {
    
    private String nombre;
    private int edad;
    private int dni;
    private int telefono;
    private String direccion;

    public Persona(){
        this.nombre = "juan";
        this.edad   = 12;
        this.dni    = 0;
        this.telefono = 1561651;
        this.direccion = "anashe";
    }

    public Persona(String nombre, int edad, int dni, int telefono, String direccion){
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getnombre(){
        return this.nombre;
    }
    public int getedad(){
        return this.edad;
    }
    public int getdni(){
        return this.dni;
    }
    public int gettelefono(){
        return this.telefono;
    }
    public String getdireccion(){
        return this.direccion;
    }

    public void setnombre(String nombre){
        this.nombre = nombre;
    }
    public void setedad(int edad){
        this.edad = edad;
    }
    public void setdni(int dni){
        this.dni = dni;
    }
    public void settelefono(int telefono){
        this.telefono = telefono;
    }
    public void setdireccion(String direccion){
        this.direccion = direccion;
    }
}

/*nombre
    edad
    dni
    telefono
    dirección*/