package Venta_de_computadoras;

import java.util.ArrayList;

public class Computadora{
    private CPU cpu;
    private ArrayList<OutputDevice> dispositivosSalida;
    private ArrayList<InputDevice>  dispositivosEntrada;

    public Computadora(){
        this.cpu = null;
        this.dispositivosEntrada = new ArrayList<>();
        this.dispositivosEntrada = new ArrayList<>();
    }

    public boolean poseeLosComponentesMinimos(){
        if(
            this.dispositivosEntrada.size()>=1 && 
            this.dispositivosSalida.size()>=1 && 
            this.cpu!=null
        ){
            return true;
        }
        return false;
    }
    public void addPeriferico(OutputDevice i){
        this.dispositivosSalida.add(i);
    }
    public void addPeriferico(InputDevice i){
        this.dispositivosEntrada.add(i);
    }
    public void setPeriferico(int pos,OutputDevice i){
        this.dispositivosSalida.set(pos, i);
    }
    public void setPeriferico(int pos,InputDevice i){
        this.dispositivosEntrada.set(pos, i);
    }
    public void setCPU(CPU i){
        this.cpu = i;
    }
    public void deletePerifericoEntrada(int pos){
        this.dispositivosEntrada.remove(pos);
    }
    public void deletePerifericoSalida(int pos){
        this.dispositivosSalida.remove(pos);
    }
    public void deletePerifericoEntrada(InputDevice pos){
        this.dispositivosEntrada.remove(pos);
    }
    public void deletePerifericoSalida(OutputDevice pos){
        this.dispositivosSalida.remove(pos);
    }
    public ArrayList<InputDevice> getDispositivosEntrada(){ return this.dispositivosEntrada;    }
    public ArrayList<OutputDevice> getDispositivosSalida(){ return this.dispositivosSalida;     }
    public CPU getCPU(){return this.cpu;}
};