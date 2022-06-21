import java.time.LocalDate;
import java.util.HashSet;

public class Colegio {
    private HashSet<Reserva> reservas;

    public Colegio(){
        this.reservas = new HashSet<>();
    }
    /*Casos posibles
    - El horario a reservar está disponible y la reserva queda efectuada.
    - El horario no está disponible y la persona que está reservando tiene menos 
    prioridad que la que hizo la reserva anteriormente. En este caso el sistema no 
    permite reservar.
    - El horario no está disponible pero la persona que está reservando tiene más 
    prioridad que la que hizo la reserva anteriormente. En este caso el sistema 
    elimina la reserva actual y genera una nueva con la persona con más prioridad.
    */

    public void addReserva(Profesor persona,LocalDate horario){
        Reserva aux = new Reserva(persona,horario);
        int e = 0;
        for (Reserva i : reservas) {
            if((aux.getFecha()==i.getFecha() && aux.getBloque()==i.getBloque()) && aux.getPersona().getPrioridad()>i.getPersona().getPrioridad()){
                reservas.remove(i);
                reservas.add(aux);
            }else{
                e++;
            }
        }
        if(e==reservas.size()){
            reservas.add(aux);
        }
    }
    public void addReserva(Reserva aux){
        int e = 0;
        for (Reserva i : reservas) {
            if((aux.getFecha()==i.getFecha() && aux.getBloque()==i.getBloque()) && aux.getPersona().getPrioridad()>i.getPersona().getPrioridad()){
                reservas.remove(i);
                reservas.add(aux);
            }else{
                e++;
            }
        }
        if(e==reservas.size()){
            reservas.add(aux);
        }
    }
}
