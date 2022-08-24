package Venta_de_computadoras;

public class Main {
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
    }
}
