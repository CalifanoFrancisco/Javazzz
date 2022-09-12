package ONG;

public class Profesor extends Voluntario {
    private Salario salario;
    private Materia materia;
    private int horasLaborales;

    public Profesor(){
        this.salario = new Salario();
        this.materia = Materia.GEOGRAFIA;
        this.horasLaborales = 10;
    }
    public Salario getSueldo(){ return this.salario;}
    public Materia getMateria(){return this.materia; }
    public int getHorasLaborales(){ return this.horasLaborales; }
     
    @Override
    public void accion(){
        System.out.println(materia);
    }
}
