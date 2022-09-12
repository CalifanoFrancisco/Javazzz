import java.util.HashSet;

public class Colegio implements Aprobados{
    private HashSet<Alumno> alumnos;    
    
    @Override
    public int cantAprobados() {
        int out = 0;
        for (Alumno i:alumnos){
            if(i.aprobado()){ out++; }
        }
        return out;
    }
}
