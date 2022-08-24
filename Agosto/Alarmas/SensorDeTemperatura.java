package SistemaDeAlarmas;

public class SensorDeTemperatura extends Sensor{
    public SensorDeTemperatura(){ super();  }
    @Override
    void alertar(){
        if(this.alerta()){
            System.out.println("Cuidado, la temperatura sube");
        }
    }
}
