package ONG;

public class VoluntarioMiembro extends Voluntario {
    private int porcentaje;
    public VoluntarioMiembro(){
        super();
        this.porcentaje = 0;
    }
    public int getPorcentaje(){ return this.porcentaje; }
    public void setPorcentaje(int x){ this.porcentaje = x; }

    @Override 
    public void accion(){
        System.out.println("Ofrezco mi ayuda para lo que necesiten");
        this.porcentaje++;
    }
}
