package ONG;

public class Trabajador extends Voluntario {
    private Salario salario;
    public Trabajador(){
        super();
        this.salario = new Salario();
    }
    public Salario getSueldo(){ return this.salario;}
    
}
