package Venta_de_computadoras;

import java.util.ArrayList;

public class Compra {
    private Cliente cliente;
    private ArrayList<Computadora> computadoras;
    private MetodoDePago metodoDePago;
    private float montoFinal;

    public Compra(){
        this.cliente = new Cliente();
        this.computadoras = new ArrayList<>();
        this.metodoDePago = new Efectivo();
    }
    public void addComputadora(Computadora i){this.computadoras.add(i); }

    private Float precio(){
        float out = 0.f;
        for(Computadora e:this.computadoras){
            if(e.poseeLosComponentesMinimos()){
                for(OutputDevice i:e.getDispositivosSalida()) { out += i.getPrecio();   }
                for(InputDevice  i:e.getDispositivosEntrada()){ out += i.getPrecio();   }
                out += e.getCPU().getPrecio();
            }
        }
        return out;
    }
    private Float recargo(int porcentaje,float total){
        return total + (porcentaje*total)/100;
    }
    public Float comprar(TarjetaCredito i){
        this.metodoDePago = i;
        this.montoFinal = recargo(5, precio());
        return montoFinal;
    }
    public Float comprar(TarjetaDebito i){
        this.metodoDePago = i;
        this.montoFinal = recargo(5, precio());
        return montoFinal;
    }
    public Float comprar(Efectivo i){
        this.metodoDePago = i;
        this.montoFinal = recargo(0, precio());
        return montoFinal;
    }
    public MetodoDePago getMetodoDePago(){return this.metodoDePago; }
    public Cliente getCliente(){return this.cliente;}
}
