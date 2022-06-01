import java.util.ArrayList;

public class Push extends Instruccion{
    public Push(){
        super("PUSH");
    }
    public void push(ArrayList<Float> pila,Float i){
        pila.add(i);
    }
}
