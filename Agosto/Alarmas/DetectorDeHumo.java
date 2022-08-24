package SistemaDeAlarmas;

public class DetectorDeHumo extends Sensor{
    public DetectorDeHumo(){ super();  }
    @Override
    void alertar(){
        if(this.alerta()){
            System.out.println("Llame a los bomberos");
        }
    }
   
}
