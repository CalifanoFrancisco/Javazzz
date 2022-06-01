import java.util.ArrayList;

public class Sub extends Instruccion{
    public Sub(){
        super("SUB");
    }
    public Float sub(ArrayList<Float> pila){
        Float out=0.f;
        switch(pila.size()){
            case 0: 
                out=0.f;    
            break;
            default:
                out = pila.get(pila.size()-1)-pila.get(pila.size());
                pila.remove(pila.size()-1);
                pila.remove(pila.size());
            break;
        }
        pila.add(out);
        return out;
    }
}
