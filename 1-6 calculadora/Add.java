import java.util.ArrayList;

public class Add extends Instruccion{
    public Add(){
        super("ADD");
    }
    public Float add(ArrayList <Float> pila){
        Float out=0.f;
        switch(pila.size()){
            case 0:     
                out = 0.f;                                              
            break;
            case 1:     
                out = pila.get(pila.size());   
                pila.remove(pila.size());
            break;
            default:   
                out = pila.get(pila.size()-1)+pila.get(pila.size());    
                pila.remove(pila.size()-1);
                pila.remove(pila.size());
            break;
        }
        pila.add(out);
        return out;
    }
}
