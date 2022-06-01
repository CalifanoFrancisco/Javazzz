import java.util.ArrayList;

public class Mul extends Instruccion{
    public Mul(){
        super("MUL");
    }
    
    public Float mul(ArrayList<Float> pila){
        Float out=0.f;
        switch(pila.size()){
            case 0: 
                out=0.f; 
            break;
            default: 
                out = pila.get(pila.size())*pila.get(pila.size()-1);
                pila.remove(pila.size()-1);
                pila.remove(pila.size());
            break;
        }
        return out;
    }
}
