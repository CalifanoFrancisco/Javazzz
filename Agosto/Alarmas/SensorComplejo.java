package SistemaDeAlarmas;

import java.util.HashMap;
import java.util.Map;

public class SensorComplejo extends Sensor{
    private HashMap<Sensor,Integer> sensores;
    //              sensor|val umbral
    private String msg;
    public SensorComplejo(){
        this.sensores = new HashMap<>();
    }
    public void addSensor(Sensor i,Integer e){
        this.sensores.put(i, e);
    }

    @Override
    void alertar(){
        /*for(Sensor i:sensores.entrySet()){
          if(i.getValor()>sensores.get(i).val){

          }
        }*/
        Integer e = 0;
        for(Map.Entry<Sensor,Integer>entry:sensores.entrySet()){
            if(entry.getKey().getValor()>entry.getValue()){
                e++;
            }
        }
        if(e==sensores.size()){
            System.out.println(this.msg);
        }
    }

}
