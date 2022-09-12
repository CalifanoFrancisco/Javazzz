package ONG;

public class VolunarioExterno extends Voluntario{
    private Institucion institucion;
    public VolunarioExterno(){
        super();
    }
    public Institucion getInstitucion(){ return this.institucion; }
    public void setInstitucion(Institucion i){ this.institucion = i;    }
}
