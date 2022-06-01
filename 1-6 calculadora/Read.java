import java.util.ArrayList;

public class Read extends Instruccion{
    public Read(){
        super("READ");
    }

    public void read(ArrayList<Float> pila,Float i){
        pila.add(i);
    }
}
