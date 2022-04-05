package src;
import java.util.ArrayList;

public class Hijo extends Persona {

    private String escuela;
    private String juegoFavorito;
    
    public Hijo (){
        super();
        this.escuela="CoscuSchool";
        this.juegoFavorito="Osu";
    }
    
    public Hijo(String nombre,int edad,int telefono,int id,String direccion,String escuela,String juegoFavorito ){
        super(nombre,edad,telefono,id,direccion);
        this.escuela=escuela;
        this.juegoFavorito=juegoFavorito;
    }
}
