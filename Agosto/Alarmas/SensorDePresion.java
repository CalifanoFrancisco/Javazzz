package SistemaDeAlarmas;

public class SensorDePresion extends Sensor{
    public SensorDePresion(){ super();  }
    @Override
    void alertar(){
        if(this.alerta()){
            System.out.println("Sensor de presion activado");
        }
    }

}
