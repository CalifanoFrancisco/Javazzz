import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Programa {

    private HashMap<String,ArrayList<Instruccion>> instrucciones;
    //              rutina|comandos
    public Programa(){
        instrucciones = new HashMap<>();
    }

    public void agregarInstruccion(String rutina,Instruccion instruccion){
        for (String tipo_rutina : instrucciones.keySet()) {
            if(instrucciones.keySet().toString()==rutina){
                instrucciones.put(rutina,instrucciones.values().add(instruccion));
            }
        }
    }

}
