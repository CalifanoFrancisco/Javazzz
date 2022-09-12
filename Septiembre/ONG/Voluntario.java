package ONG;

import java.time.LocalDate;

public class Voluntario extends Persona implements AccionSolidaria,MayorDeEdad {
    private LocalDate fechaDeIncrporacion;
    public Voluntario(){
        super();
        this.fechaDeIncrporacion = LocalDate.now();
    }
    @Override
    public void accion(){
        System.out.println("Ofrezco mi ayuda para lo que necesiten");
    }
    @Override
    public boolean mayorDeEdad(){
        return (this.getEdad()>=18);
    }
    public void incorporadoHace2Meses(){
        LocalDate aux = this.fechaDeIncrporacion;
        aux.minusMonths(2);
        if(aux.compareTo(LocalDate.now().minusMonths(2))>0){
            System.out.println(this.getNombre());
        }
    }
}
