package Venta_de_computadoras;

import java.util.ArrayList;

public class ComprasCOmputadoraCOnExceptions {
    public static void main(String[] args) {
        Compra c = new Compra();
        Computadora pc = new Computadora();
        pc.addPeriferico(new Pantalla());
        pc.addPeriferico(new Teclado());
        pc.addPeriferico(new Mouse());
        pc.addPeriferico(new Impresora());
        pc.setCPU(new CPU());
        c.addComputadora(pc);
        c.comprar(new Efectivo());

        try {
            
        } catch (Exception e){
            System.err.println(e);
        }
    }
    public static float buyPC(Computadora pc){
        float out = 0.f;
        try{
            for (Componente i:pc.getCPU().getComponentes()){
                if(i.getStock()-1 > 0){
                    i.setStock(i.getStock()-1);
                    out+=i.getPrecio();
                }else{
                    throw new Exception("No hay stock suficiente");
                }
            }
            for(int e = 0; e < pc.getDispositivosEntrada().size(); e++){
                InputDevice aux = pc.getDispositivosEntrada().get(e);
                for(Componente i:aux.getComponentes()){
                    if(i.getStock()-1 > 0){
                        i.setStock(i.getStock()-1);
                        out+=i.getPrecio();
                    }else{
                        throw new Exception("No hay stock suficiente");
                    }
                }
            }
            for(int e = 0; e < pc.getDispositivosSalida().size(); e++){
                OutputDevice aux = pc.getDispositivosSalida().get(e);
                for(Componente i:aux.getComponentes()){
                    if(i.getStock()-1 > 0){
                        i.setStock(i.getStock()-1);
                        out+=i.getPrecio();
                    }else{
                        throw new Exception("No hay stock suficiente");
                    }
                }
            }
        } catch (Exception e){
            System.err.println(e);
        }
       
        return out;
    }
}
