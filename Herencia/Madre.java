package src;
import java.util.ArrayList;

public class Madre extends Persona {

    ArrayList <Hijo> hijos;
    String empresa;
    
    public Madre (){
        super();
        this.empresa="Pizzeria Lombrito";
        hijos = new ArrayList<>();
    }

    public Madre(String nombre,int edad,int telefono,int id,String direccion,String empresa){
        super(nombre,edad,telefono,id,direccion);
        this.empresa = empresa;
        hijos = new ArrayList<>();
    }

    public ArrayList hijosMenoresDeEdad(){
        ArrayList<Hijo> menoresDeEdad = new ArrayList<>();
        for(int i=0;i<hijos.size();i++){
            if(this.hijos.get(i).getedad()<18){
                menoresDeEdad.add(this.hijos.get(i));
                System.out.println(
                    "nombre: "+this.hijos.get(i).getnombre()+
                    "| edad: "+this.hijos.get(i).getedad()
                );
            }
        }

        return menoresDeEdad;
    }

    public void addHijo(Hijo hijo){
        this.hijos.add(hijo);
    }
}
