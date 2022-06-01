import java.util.ArrayList;
import java.util.HashMap;

public class Write extends Instruccion{
    public Write (){
        super("WRITE");
    }
    public HashMap<String,Float> write(ArrayList<Float> pila,String name){
        HashMap<String,Float> aux = new HashMap<>();
        
        aux.put(name,pila.get(pila.size()-1));
        pila.remove(pila.size()-1);

        return aux;
    }
}
