import java.util.ArrayList;

public class Alumno extends Persona {
    private ArrayList<ExamenOral>    examenesOrales;
    private ArrayList<ExamenEscrito> examenesEscritos;

    public Alumno(){
        super();
        this.examenesEscritos = new ArrayList<>();
        this.examenesOrales   = new ArrayList<>();
    }

    public boolean aprobado(){
        for (ExamenEscrito i : examenesEscritos) {
            if(i.getNota()<6){ return false; }
        }
        for (ExamenOral i : examenesOrales) {
            if(i.getNivelDeSatisfaccion()=="insuficiente"){
                return false;
            }
        }
        return true;
    }
}
