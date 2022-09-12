package ONG;

import java.util.HashMap;

public class ProfesorIterino extends Profesor{
    private HashMap<Materia,Integer> materias;
    public ProfesorIterino(){
        super();
        this.materias = new HashMap<>(); 
    }
    public HashMap<Materia,Integer> getMaterias(){
        return materias;
    }

}
